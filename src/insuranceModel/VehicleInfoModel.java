package insuranceModel;

import java.io.Serializable;
import java.lang.reflect.Field;

public class VehicleInfoModel implements Serializable{
	// vehicle info
	private Integer year;
	private String make;
	private String model;
	private String bodyType;
	private String primaryUse;
	// true means lease, false means own
	private Boolean isLease;
	private Boolean hasPassiveAlarm;
	
	public String toString() {
		Field[] fields = this.getClass().getDeclaredFields();
		String modelString="\nVehicle Info Model:\n--------------------";
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
}
