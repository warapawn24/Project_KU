package com.ku.dku.bean;

public class ListRepairRequest {

	private String repairStatus;

	
	
	public ListRepairRequest() {
		super();
	}

	public ListRepairRequest(String repairStatus) {
		super();
		this.repairStatus = repairStatus;
	}

	public String getRepairStatus() {
		return repairStatus;
	}

	public void setRepairStatus(String repairStatus) {
		this.repairStatus = repairStatus;
	}
	
	
}
