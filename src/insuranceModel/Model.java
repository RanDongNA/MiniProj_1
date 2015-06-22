package insuranceModel;

import java.io.Serializable;

public class Model implements Serializable{
	private BasicInfoModel basicInfoModel;
	private VehicleInfoModel vehicleInfoModel;
	private DriverInfoModel driverInfoModel;
	
	// a no arg constructor
	public Model() {
		this.basicInfoModel=new BasicInfoModel();
		this.vehicleInfoModel=new VehicleInfoModel();
		this.driverInfoModel=new DriverInfoModel();
	}
	public Model(BasicInfoModel basicInfoModel,VehicleInfoModel vehicleInfoModel,DriverInfoModel driverInfoModel) {
		this.basicInfoModel=basicInfoModel;
		this.vehicleInfoModel=vehicleInfoModel;
		this.driverInfoModel=driverInfoModel;
	}
	
	public String toString() {
		return ""+basicInfoModel+"\n"+vehicleInfoModel+"\n"+driverInfoModel;
		
	}
	/**
	 * @return the basicInfoModel
	 */
	public BasicInfoModel getBasicInfoModel() {
		return basicInfoModel;
	}

	/**
	 * @return the vehicleInfoModel
	 */
	public VehicleInfoModel getVehicleInfoModel() {
		return vehicleInfoModel;
	}

	/**
	 * @return the driverInfoModel
	 */
	public DriverInfoModel getDriverInfoModel() {
		return driverInfoModel;
	}
	
	
}