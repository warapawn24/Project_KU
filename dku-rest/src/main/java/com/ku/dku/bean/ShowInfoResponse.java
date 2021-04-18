package com.ku.dku.bean;

public class ShowInfoResponse {

	private long officerId;
	private String officerFname;
	private String officerLname;
	private String officerRole;
	private String officerStatus;
	private String officerEmail;
	
	
	public ShowInfoResponse() {
		super();
	}
	public ShowInfoResponse(long officerId, String officerFname, String officerLname, String officerRole,
			String officerStatus, String officerEmail) {
		super();
		this.officerId = officerId;
		this.officerFname = officerFname;
		this.officerLname = officerLname;
		this.officerRole = officerRole;
		this.officerStatus = officerStatus;
		this.officerEmail = officerEmail;
	}
	public long getOfficerId() {
		return officerId;
	}
	public void setOfficerId(long officerId) {
		this.officerId = officerId;
	}
	public String getOfficerFname() {
		return officerFname;
	}
	public void setOfficerFname(String officerFname) {
		this.officerFname = officerFname;
	}
	public String getOfficerLname() {
		return officerLname;
	}
	public void setOfficerLname(String officerLname) {
		this.officerLname = officerLname;
	}
	public String getOfficerRole() {
		return officerRole;
	}
	public void setOfficerRole(String officerRole) {
		this.officerRole = officerRole;
	}
	public String getOfficerStatus() {
		return officerStatus;
	}
	public void setOfficerStatus(String officerStatus) {
		this.officerStatus = officerStatus;
	}
	public String getOfficerEmail() {
		return officerEmail;
	}
	public void setOfficerEmail(String officerEmail) {
		this.officerEmail = officerEmail;
	}

	
	

	
	
}
