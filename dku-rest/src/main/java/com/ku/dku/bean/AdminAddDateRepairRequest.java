package com.ku.dku.bean;

public class AdminAddDateRepairRequest {

	private long repairId;
	private String repairDuedate;
	
	
	public AdminAddDateRepairRequest() {
		super();
	}
	public AdminAddDateRepairRequest(long repairId, String repairDuedate) {
		super();
		this.repairId = repairId;
		this.repairDuedate = repairDuedate;
	}
	public long getRepairId() {
		return repairId;
	}
	public void setRepairId(long repairId) {
		this.repairId = repairId;
	}
	public String getRepairDuedate() {
		return repairDuedate;
	}
	public void setRepairDuedate(String repairDuedate) {
		this.repairDuedate = repairDuedate;
	}
	
	
}
