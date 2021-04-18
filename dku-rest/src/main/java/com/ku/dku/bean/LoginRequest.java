package com.ku.dku.bean;

public class LoginRequest {
	private String studentUsername;
	private String studentPassword;
	private String loginFrom;
	
	
	public LoginRequest() {
		super();
	}
	public LoginRequest(String studentUsername, String studentPassword, String loginFrom) {
		super();
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
		this.loginFrom = loginFrom;
	}
	public String getStudentUsername() {
		return studentUsername;
	}
	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public String getLoginFrom() {
		return loginFrom;
	}
	public void setLoginFrom(String loginFrom) {
		this.loginFrom = loginFrom;
	}
	
	
	
	
	
	
	
}
