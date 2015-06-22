package insuranceController;

import insuranceModel.BasicInfoModel;
import insuranceModel.DriverInfoModel;
import insuranceModel.Model;
import insuranceModel.MyValidationException;
import insuranceModel.RuleEngine;
import insuranceModel.VehicleInfoModel;

public class Controller {
	
	private Model model;
	private RuleEngine ruleEngine;
	
	public Controller() {
		model = new Model();
		ruleEngine = new RuleEngine();
	}
	
	public Model getModel() {
		return model;
	}
	
	public double getQuotePrice() {
		return ruleEngine.getQuotePrice(model);
	}
	
	public void saveBasicInfo(
			String firstName,String middleName, String lastName, String suffix, 
			String maStreet, String maApt, 
			String state, String maCity, String zip, 
			Boolean isPOBox, 
			Integer age	) throws MyValidationException {
		BasicInfoModel bim = this.model.getBasicInfoModel();
		bim.setFirstName(firstName);
		bim.setMiddleName(middleName);
		bim.setLastName(lastName);
		bim.setSuffix(suffix);
		bim.setMaStreet(maStreet);
		bim.setMaApt(maApt);
		bim.setState(state);
		bim.setMaCity(maCity);
		bim.setMaZip(zip);
		bim.setIsPOBox(isPOBox);
		bim.setAge(age);		
	}
	
	public void saveVehicalInfo(
			Integer year,String make,String model,
			String bodyType, String primaryUse,Boolean isLease,
			Boolean hasPassiveAlarm ) {
		VehicleInfoModel vim =  this.model.getVehicleInfoModel();
		vim.setYear(year);
		vim.setMake(make);
		vim.setModel(model);
		vim.setBodyType(bodyType);
		vim.setPrimaryUse(primaryUse);
		vim.setIsLease(isLease);
		vim.setHasPassiveAlarm(hasPassiveAlarm);		
	}
	
	public void saveDriverInfo (
			String gender, String maritalStatus, String education, 
			Boolean employmentStatus, 
			String ssn, String primaryResidence, String usLicenseStatus,
			Integer yearsLicensed, Boolean hasAccidentsClaimsDamage, 
			Boolean hasTicketsViolations) throws MyValidationException  {
		DriverInfoModel dim = this.model.getDriverInfoModel();
		dim.setGender(gender);
		dim.setMaritalStatus(maritalStatus);
		dim.setEducation(education);
		dim.setEmploymentStatus(employmentStatus);
		dim.setSsn(ssn);
		dim.setPrimaryResidence(primaryResidence);
		dim.setUsLicenseStatus(usLicenseStatus);
		dim.setYearsLicensed(yearsLicensed);
		dim.setHasAccidentsClaimsDamage(hasAccidentsClaimsDamage);
		dim.setHasTicketsViolations(hasTicketsViolations);
	}
}
