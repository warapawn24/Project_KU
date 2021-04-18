package com.ku.dku.bean;

public class AdminRepairShowDetailRequest {

	private String repairStatus;
	private String repairList;
	
	
	public AdminRepairShowDetailRequest() {
		super();
	}
	public AdminRepairShowDetailRequest(String repairStatus, String repairList) {
		super();
		this.repairStatus = repairStatus;
		this.repairList = repairList;
	}
	public String getRepairStatus() {
		return repairStatus;
	}
	public void setRepairStatus(String repairStatus) {
		this.repairStatus = repairStatus;
	}
	public String getRepairList() {
		return repairList;
	}
	public void setRepairList(String repairList) {
		this.repairList = repairList;
	}
	
	
}
