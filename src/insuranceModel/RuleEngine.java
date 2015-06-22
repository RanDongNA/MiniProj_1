package insuranceModel;

import java.util.*;
import java.io.*;

public class RuleEngine {
	
	private Map<String, Integer> stateRates;
	private Map<String, Integer> makeRates;
	
	public RuleEngine() {
		this.stateRates = new HashMap<String, Integer>();
		this.makeRates = new HashMap<String, Integer>();
		try {
			parseBasicRates("RateForStates.txt", stateRates);
			parseBasicRates("RateForMakes.txt", makeRates);
		} catch (IOException e) {e.printStackTrace();}
	}
	
	/**
	 * Parse the given file into key, value pairs into the given hashMap
	 * @param fileName Given fileNmae
	 * @param info Given hashMap
	 * @throws IOException if given file does not exist
	 */
	private void parseBasicRates(String fileName, Map<String, Integer> info) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(fileName));
		
		while (true) {
			String currentline = reader.readLine();
			if (currentline == null) break;
			String[] pair = currentline.split(":");
			info.put(pair[0].trim(), Integer.parseInt(pair[1].trim()));
		}
        reader.close();
	}
	
	/**
	 * Calculate the base based on state and car make
	 * @return insurance base value
	 */
	private int calculateBaseInsurance(Model user) {
		String state = user.getBasicInfoModel().getState();
		String make = user.getVehicleInfoModel().getMake().toLowerCase();
		int result = 100;//stateRates.get(state);
		if (makeRates.containsKey(make)) result += makeRates.get(make);
		else throw new IllegalArgumentException("Given make does not exist");
		return result;
	}
	
	/**
	 * Apply the age factor after retrieving the base value
	 * @return base value with age factor
	 */
	private double ageMultiplier(Model user) {
		double result = calculateBaseInsurance(user);
		int age = user.getBasicInfoModel().getAge();
		if (age < 18 || age >= 60) result *= 1.2;
		else if (age >= 24) result *= 0.95;
		else if (age >= 30) result *= 0.9;
		return result;
	}
	
	/**
	 * Apply the personal factors: maritalStatus, education lvl,
	 * employmentStatus and yearsLicensed to the base value with age factor
	 * @return insurance value with personal and age factors
	 */
	private double personalMultiplier(Model user) {
		double result = ageMultiplier(user);
		// apply maritalStatus factor
		switch (user.getDriverInfoModel().getMaritalStatus().toLowerCase()) {
		case "single":
			result *= 1.05;
			break;
		case "married":
			result *= 0.9;
			break;
		case "divorced":
			result *= 1.08;
			break;
		}
		// apply education lvl factor
		switch (user.getDriverInfoModel().getEducation().toLowerCase()) {
		case "high school":
			result *= 1.1;
			break;
		case "bachelor":
			result *= 0.96;
			break;
		case "masters":
			result *= 0.95;
			break;
		case "phd":
			result *= 0.92;
			break;
		}
		// apply employmentStatus factor
		if (!user.getDriverInfoModel().getEmploymentStatus()) result *= 1.08;
		else result *= 0.95;
		// apply yearsLicensed factor
		int yearsLicensed = user.getDriverInfoModel().getYearsLicensed();
		if (yearsLicensed <= 3) result *= 1.1;
		
		return result;
	}
	
	/**
	 * Apply accident and violation factor based on insurance value
	 * with age and base factor
	 * @param user
	 * @return insurance value with driver and basic info factors
	 */
	private double applyAccidentViolation(Model user) {
		double result = personalMultiplier(user);
		if (user.getDriverInfoModel().getHasAccidentsClaimsDamage()) result *= 1.15;
		if (user.getDriverInfoModel().getHasTicketsViolations()) result *= 1.1;
		
		return result;
	}
	
	/**
	 * Apply year and bodytype factor 
	 * @param user
	 * @return value with driver, basic info, vehicle year and bodytype
	 */
	private double applyYearAndBodytype(Model user) {
		double result = applyAccidentViolation(user);
		int vehicleYear = user.getVehicleInfoModel().getYear();
		result *= Math.log10(10 + vehicleYear);
		
		switch (user.getVehicleInfoModel().getBodyType().toLowerCase()) {
		case "sedan":
			break;
		case "coupe":
			result *= 1.02;
			break;
		case "convertible":
			result *= 1.03;
			break;
		case "minivan":
			result *= 1.05;
			break;
		case "truck":
			result *= 1.08;
			break;
		case "suv":
			result *= 1.03;
			break;
		}
		
		return result;
	}
	
	/**
	 * Apply primaryUse and isLease factor
	 * @param user
	 * @return
	 */
	private double applyUseAndIsLease(Model user) {
		double result = applyYearAndBodytype(user);
		if (user.getVehicleInfoModel().getPrimaryUse().toLowerCase().equals("business"))
			result *= 1.1;
		
		if (user.getVehicleInfoModel().getIsLease()) result *= 0.93;
		
		return result;
	}
	
	/**
	 * Get quote for the user information given
	 * @param user
	 * @return standard quote price
	 */
	public double getQuotePrice(Model user) {
		double result = applyUseAndIsLease(user);
		if (user.getVehicleInfoModel().getHasPassiveAlarm()) result *= 0.98;
		return result;
	}
	
	public static void main(String[] args) {
		new RuleEngine();
	}

}
