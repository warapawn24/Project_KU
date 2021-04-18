package com.ku.dku.bean;

public class ChangeOfficerStatusRequest {
	private long officerId;
	private String officerStatus;
	
	
	public ChangeOfficerStatusRequest() {
		super();
	}
	public ChangeOfficerStatusRequest(long officerId, String officerStatus) {
		super();
		this.officerId = officerId;
		this.officerStatus = officerStatus;
	}
	public long getOfficerId() {
		return officerId;
	}
	public void setOfficerId(long officerId) {
		this.officerId = officerId;
	}
	public String getOfficerStatus() {
		return officerStatus;
	}
	public void setOfficerStatus(String officerStatus) {
		this.officerStatus = officerStatus;
	}

	
	
	
}
