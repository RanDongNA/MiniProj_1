package insuranceModel;

import java.util.Date;

public class BasicInfoModel {
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
	private Integer age;
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
	 * @return the age
	 */
	public Integer getAge() {
		return age;
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
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
