package com.ku.dku.bean;

import java.util.Date;

public class ViewRepairStatusDoneResponse {

	private Date repairDate;
	private Date repairDuedate;
	private String 	repairList;
	
	
	
	public ViewRepairStatusDoneResponse() {
		super();
	}
	public ViewRepairStatusDoneResponse(Date repairDate, Date repairDuedate, String repairList) {
		super();
		this.repairDate = repairDate;
		this.repairDuedate = repairDuedate;
		this.repairList = repairList;
	}
	public Date getRepairDate() {
		return repairDate;
	}
	public void setRepairDate(Date repairDate) {
		this.repairDate = repairDate;
	}
	public Date getRepairDuedate() {
		return repairDuedate;
	}
	public void setRepairDuedate(Date repairDuedate) {
		this.repairDuedate = repairDuedate;
	}
	public String getRepairList() {
		return repairList;
	}
	public void setRepairList(String repairList) {
		this.repairList = repairList;
	}
	
	
}
