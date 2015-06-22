package insuranceModel;

import java.lang.reflect.Field;

public class DriverInfoModel {
	// driver info
	private String gender;
	private String maritalStatus;
	private String education;
	private Boolean employmentStatus;
	private String ssn;
	private String primaryResidence;

	private String usLicenseStatus;  //TODO: to be removed

	private Integer yearsLicensed;
	// true means there exist a/c/d, false means none
	private Boolean hasAccidentsClaimsDamage;
	// true means got ticket/violation, false means not
	private Boolean hasTicketsViolations;
	
	public String toString() {
		Field[] fields = this.getClass().getDeclaredFields();
		String modelString="\nDriver Info Model:\n--------------------";
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
	public Boolean getEmploymentStatus() {
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
		return primaryResidence;
	}

	/**
	 * @return the yearsLicensed
	 */
	public Integer getYearsLicensed() {
		return yearsLicensed;
	}
	/**
	 * @return the hasAccidentsClaimsDamage
	 */
	public Boolean getHasAccidentsClaimsDamage() {
		return hasAccidentsClaimsDamage;
	}
	/**
	 * @return the hasTicketsorCiolations
	 */
	public Boolean getHasTicketsViolations() {
		return hasTicketsViolations;
	}
	
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) throws MyValidationException {
		String input=gender.trim().toLowerCase();
		if(!input.equals("male") && !input.equals("female")) {
			throw new MyValidationException("Invalid gender: "+gender);			
		}
		this.gender = gender;
	}
	
	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) throws MyValidationException {
		String input=maritalStatus.trim().toLowerCase();
		if(!input.equals("single") && !input.equals("married") && !input.equals("divoced"))
			throw new MyValidationException("Invalid Married Status: "+ maritalStatus);
		this.maritalStatus = maritalStatus;
	}
	
	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) throws MyValidationException {
		String input=education.trim().toLowerCase();
		if(!input.equals("high school") && !input.equals("bachelor") && !input.equals("master") && !input.equals("phd"))
			throw new MyValidationException("Invalid Education: "+ education);
		this.education = education;
	}
	
	/**
	 * @param employmentStatus the employmentStatus to set
	 */
	public void setEmploymentStatus(Boolean employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	
	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) throws MyValidationException{
		if(!ssn.matches("[0-9]{9}"))
			throw new MyValidationException("Invalid SSN: "+ssn);
		this.ssn = ssn;
	}
	
	/**
	 * @param primaryEesidence the primaryEesidence to set
	 */
	public void setPrimaryResidence(String primaryResidence) throws MyValidationException {		
		this.primaryResidence = primaryResidence;
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
	public void setYearsLicensed(Integer yearsLicensed) throws MyValidationException{
		if(yearsLicensed<0)
			throw new MyValidationException("Invalid year: "+ yearsLicensed);
		this.yearsLicensed = yearsLicensed;
	}
	
	/**
	 * @param hasAccidentsClaimsDamage the hasAccidentsClaimsDamage to set
	 */
	public void setHasAccidentsClaimsDamage(Boolean hasAccidentsClaimsDamage) {
		this.hasAccidentsClaimsDamage = hasAccidentsClaimsDamage;
	}
	
	/**
	 * @param hasTicketsorCiolations the hasTicketsorCiolations to set
	 */
	public void setHasTicketsViolations(Boolean hasTicketsCiolations) {
		this.hasTicketsViolations = hasTicketsCiolations;
	}
	
	
}
