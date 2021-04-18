package com.ku.dku.bean;

public class AdminLoginRequest {
	private String officerUsername;
	private String officerPassword;
	private String loginFrom;
	
	
	public AdminLoginRequest() {
		super();
	}
	public AdminLoginRequest(String officerUsername, String officerPassword, String loginFrom) {
		super();
		this.officerUsername = officerUsername;
		this.officerPassword = officerPassword;
		this.loginFrom = loginFrom;
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
	public String getLoginFrom() {
		return loginFrom;
	}
	public void setLoginFrom(String loginFrom) {
		this.loginFrom = loginFrom;
	}
	
	
}
