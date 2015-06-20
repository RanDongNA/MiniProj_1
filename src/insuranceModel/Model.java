package insuranceModel;

public class Model {
	private BasicInfoModel bim;
	private VehicleInfoModel vim;
	private DriverInfoModel dim;
	
	Model(BasicInfoModel aBim,VehicleInfoModel aVim,DriverInfoModel aDim) {
		this.bim=aBim;
		this.vim=aVim;
		this.dim=aDim;
	}
	
	/**
	 * @return the bim
	 */
	public BasicInfoModel getBim() {
		return bim;
	}
	/**
	 * @return the vim
	 */
	public VehicleInfoModel getVim() {
		return vim;
	}
	/**
	 * @return the dim
	 */
	public DriverInfoModel getDim() {
		return dim;
	}
	/**
	 * @param bim the bim to set
	 */
	public void setBim(BasicInfoModel bim) {
		this.bim = bim;
	}
	/**
	 * @param vim the vim to set
	 */
	public void setVim(VehicleInfoModel vim) {
		this.vim = vim;
	}
	/**
	 * @param dim the dim to set
	 */
	public void setDim(DriverInfoModel dim) {
		this.dim = dim;
	}
	
	
}