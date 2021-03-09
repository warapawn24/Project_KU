package com.ku.dku.bean;

public class LoginRequest {
	private String studentUsername;
	private String studentPassword;
	
	
	public LoginRequest() {
		super();
	}
	public LoginRequest(String studentUsername, String studentPassword) {
		super();
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
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
	
	
}
