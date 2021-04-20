package com.ku.dku.bean;

public class ShowAllInfoAdminResponse {

	private long officerId;
	private String officerFname;
	private String officerLname;
	private String officerEmail;
	private String officerRole;
	private String officerStatus;
	
	
	public ShowAllInfoAdminResponse() {
		super();
	}
	public ShowAllInfoAdminResponse(long officerId, String officerFname, String officerLname, String officerEmail,
			String officerRole, String officerStatus) {
		super();
		this.officerId = officerId;
		this.officerFname = officerFname;
		this.officerLname = officerLname;
		this.officerEmail = officerEmail;
		this.officerRole = officerRole;
		this.officerStatus = officerStatus;
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
	public String getOfficerEmail() {
		return officerEmail;
	}
	public void setOfficerEmail(String officerEmail) {
		this.officerEmail = officerEmail;
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
	
	
}
