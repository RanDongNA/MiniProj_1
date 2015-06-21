package insuranceController;

import insuranceModel.BasicInfoModel;
import insuranceModel.DriverInfoModel;
import insuranceModel.Model;
import insuranceModel.MyValidationException;
import insuranceModel.VehicleInfoModel;

public class Controller {
	
	public Model model;
	
	Controller() {
		model = new Model();
	}
	
	public void saveBasicInfo(String zip, Integer age) throws MyValidationException{
		BasicInfoModel bim = this.model.getBasicInfoModel();
		bim.setMaZip(zip);
		bim.setAge(age);		
	}
	
	public void saveVehicalInfo(Integer year,String make,String model,String bodyType,
						String primaryUse,Boolean isLease,Boolean hasPassiveAlarm) {
		VehicleInfoModel vim =  this.model.getVehicleInfoModel();
		vim.setYear(year);
		vim.setMake(make);
		vim.setModel(model);
		vim.setBodyType(bodyType);
		vim.setPrimaryUse(primaryUse);
		vim.setIsLease(isLease);
		vim.setHasPassiveAlarm(hasPassiveAlarm);		
	}
	
	public void saveDriverInfo (String maritalStatus, String education, Boolean employmentStatus, 
						Integer yearsLicensed, Boolean hasAccidentsClaimsDamage, 
						Boolean hasTicketsViolations) throws MyValidationException  {
		DriverInfoModel dim = this.model.getDriverInfoModel();
		dim.setMaritalStatus(maritalStatus);
		dim.setEducation(education);
		dim.setEmploymentStatus(employmentStatus);
		dim.setYearsLicensed(yearsLicensed);
		dim.setHasAccidentsClaimsDamage(hasAccidentsClaimsDamage);
		dim.setHasTicketsViolations(hasTicketsViolations);
	}
}
