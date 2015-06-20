package insuranceModel;

import java.lang.reflect.Field;
import java.util.Date;

public class Model {
	// basic info
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffix;
	// ma_ for mailing address
	private String maStreet;
	private String maApt;
	private String maCity;
	private String maZip;
	private Boolean isPOBox;
	private Date dateOfBirth;
	
	// vehicle info
	private Integer year;
	private String make;
	private String model;
	private String bodyType;
	private String primaryUse;
	// true means lease, false means own
	private Boolean isLease;
	private Boolean hasPassiveAlarm;
	
	// driver info
	private String gender;
	private String maritalStatus;
	private String education;
	private String employmentStatus;
	private String ssn;
	private String primaryEesidence;
	private String usLicenseStatus;
	private Integer yearsLicensed;
	// true means there exist a/c/d, false means none
	private Boolean hasAccidentsClaimsDamage;
	// true means got ticket/violation, false means not
	private Boolean hasTicketsorCiolations;
	
	
	// this main() method is only for unit test
	// this main() method is only for unit test
	// say twice because it is import
	public static void main(String[] args) {
		// for test of this class
		Model model = new Model();
		model.setFirstName("Zhu");
		model.setLastName("Ge");
		model.setMiddleName("Liang");
		model.setIsPOBox(true);
		System.out.println(model.toString());
	}
	
	public String toString() {
		Field[] fields = this.getClass().getDeclaredFields();
		String modelString="";
		for(Field f : fields) {
			modelString+="\n"+f.getName()+": ";
			try {
				modelString+=f.get(this);
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
		return modelString;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @return the maStreet
	 */
	public String getMaStreet() {
		return maStreet;
	}

	/**
	 * @return the maApt
	 */
	public String getMaApt() {
		return maApt;
	}

	/**
	 * @return the maCity
	 */
	public String getMaCity() {
		return maCity;
	}

	/**
	 * @return the maZip
	 */
	public String getMaZip() {
		return maZip;
	}

	/**
	 * @return the isPOBox
	 */
	public Boolean getIsPOBox() {
		return isPOBox;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @return the year
	 */
	public Integer getYear() {
		return year;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the bodyType
	 */
	public String getBodyType() {
		return bodyType;
	}

	/**
	 * @return the primaryUse
	 */
	public String getPrimaryUse() {
		return primaryUse;
	}

	/**
	 * @return the isLease
	 */
	public Boolean getIsLease() {
		return isLease;
	}

	/**
	 * @return the hasPassiveAlarm
	 */
	public Boolean getHasPassiveAlarm() {
		return hasPassiveAlarm;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @return the employmentStatus
	 */
	public String getEmploymentStatus() {
		return employmentStatus;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @return the primaryEesidence
	 */
	public String getPrimaryEesidence() {
		return primaryEesidence;
	}

	/**
	 * @return the usLicenseStatus
	 */
	public String getUsLicenseStatus() {
		return usLicenseStatus;
	}

	/**
	 * @return the yearsLicensed
	 */
	public Integer getYearsLicensed() {
		return yearsLicensed;
	}

	/**
	 * @return the accidentsClaimsDamage
	 */
	public Boolean getHasAccidentsClaimsDamage() {
		return hasAccidentsClaimsDamage;
	}

	/**
	 * @return the ticketsorCiolations
	 */
	public Boolean getHasTicketsorCiolations() {
		return hasTicketsorCiolations;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param suffix the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * @param maStreet the maStreet to set
	 */
	public void setMaStreet(String maStreet) {
		this.maStreet = maStreet;
	}

	/**
	 * @param maApt the maApt to set
	 */
	public void setMaApt(String maApt) {
		this.maApt = maApt;
	}

	/**
	 * @param maCity the maCity to set
	 */
	public void setMaCity(String maCity) {
		this.maCity = maCity;
	}

	/**
	 * @param maZip the maZip to set
	 */
	public void setMaZip(String maZip) {
		this.maZip = maZip;
	}

	/**
	 * @param isPOBox the isPOBox to set
	 */
	public void setIsPOBox(Boolean isPOBox) {
		this.isPOBox = isPOBox;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(Integer year) {
		this.year = year;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @param bodyType the bodyType to set
	 */
	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	/**
	 * @param primaryUse the primaryUse to set
	 */
	public void setPrimaryUse(String primaryUse) {
		this.primaryUse = primaryUse;
	}

	/**
	 * @param isLease the isLease to set
	 */
	public void setIsLease(Boolean isLease) {
		this.isLease = isLease;
	}

	/**
	 * @param hasPassiveAlarm the hasPassiveAlarm to set
	 */
	public void setHasPassiveAlarm(Boolean hasPassiveAlarm) {
		this.hasPassiveAlarm = hasPassiveAlarm;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		this.education = education;
	}

	/**
	 * @param employmentStatus the employmentStatus to set
	 */
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @param primaryEesidence the primaryEesidence to set
	 */
	public void setPrimaryEesidence(String primaryEesidence) {
		this.primaryEesidence = primaryEesidence;
	}

	/**
	 * @param usLicenseStatus the usLicenseStatus to set
	 */
	public void setUsLicenseStatus(String usLicenseStatus) {
		this.usLicenseStatus = usLicenseStatus;
	}

	/**
	 * @param yearsLicensed the yearsLicensed to set
	 */
	public void setYearsLicensed(Integer yearsLicensed) {
		this.yearsLicensed = yearsLicensed;
	}

	/**
	 * @param accidentsClaimsDamage the accidentsClaimsDamage to set
	 */
	public void setHasAccidentsClaimsDamage(Boolean accidentsClaimsDamage) {
		this.hasAccidentsClaimsDamage = accidentsClaimsDamage;
	}

	/**
	 * @param ticketsorCiolations the ticketsorCiolations to set
	 */
	public void setHasTicketsorCiolations(Boolean ticketsorCiolations) {
		this.hasTicketsorCiolations = ticketsorCiolations;
	}
}
