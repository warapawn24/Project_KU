package com.ku.dku.bean;

public class ChangeStatusRepairRequest {

	private long repairId;
	private String status;
	
	
	public ChangeStatusRepairRequest() {
		super();
	}
	public ChangeStatusRepairRequest(long repairId, String status) {
		super();
		this.repairId = repairId;
		this.status = status;
	}
	public long getRepairId() {
		return repairId;
	}
	public void setRepairId(long repairId) {
		this.repairId = repairId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
