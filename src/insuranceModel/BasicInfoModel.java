package insuranceModel;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Date;

public class BasicInfoModel implements Serializable{
	private String firstName;
	private String middleName;
	private String lastName;
	private String suffix;
	// ma_ for mailing address
	private String maStreet;
	private String maApt;
	private String maCity;
	private String state;
	private String maZip;
	private Boolean isPOBox;
	private Integer age;
	
	
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
	public void setMaZip(String maZip) throws MyValidationException{
		if(!maZip.matches("^\\d{5}(?:[-\\s]\\d{4})?$"))
			throw new MyValidationException("Invalid Zip Code: "+maZip);
		this.maZip = maZip;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
	public void setAge(Integer age) throws MyValidationException{
		if(age<=0)
			throw new MyValidationException("Invalid Age: "+age);
		this.age = age;
	}
	
	
}
