package insuranceModel;

public class DriverInfoModel {
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
	private Boolean hasTicketsViolations;
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
