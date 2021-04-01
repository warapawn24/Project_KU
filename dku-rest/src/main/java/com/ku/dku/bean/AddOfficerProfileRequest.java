package com.ku.dku.bean;

public class AddOfficerProfileRequest {
	private String officerFname;
	private String officerLname;
	private String officerEmail;
	private String officerUsername;
	private String officerPassword;
	private String confirmPassword;
	private long officerRoleId;
	
	
	
	public AddOfficerProfileRequest() {
		super();
	}
	public AddOfficerProfileRequest(String officerFname, String officerLname, String officerEmail,
			String officerUsername, String officerPassword, String confirmPassword, long officerRoleId) {
		super();
		this.officerFname = officerFname;
		this.officerLname = officerLname;
		this.officerEmail = officerEmail;
		this.officerUsername = officerUsername;
		this.officerPassword = officerPassword;
		this.confirmPassword = confirmPassword;
		this.officerRoleId = officerRoleId;
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
	public String getOfficerUsername() {
		return officerUsername;
	}
	public void setOfficerUsername(String officerUsername) {
		this.officerUsername = officerUsername;
	}
	public String getOfficerPassword() {
		return officerPassword;
	}
	public void setOfficerPassword(String officerPassword) {
		this.officerPassword = officerPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public long getOfficerRoleId() {
		return officerRoleId;
	}
	public void setOfficerRoleId(long officerRoleId) {
		this.officerRoleId = officerRoleId;
	}
	
	
	
	
}
