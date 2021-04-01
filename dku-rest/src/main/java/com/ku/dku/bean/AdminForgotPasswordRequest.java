package com.ku.dku.bean;

public class AdminForgotPasswordRequest {

	private String officerEmail;
	private String newPassword;
	private String confirmPassword;
	
	
	public AdminForgotPasswordRequest() {
		super();
	}
	public AdminForgotPasswordRequest(String officerEmail, String newPassword, String confirmPassword) {
		super();
		this.officerEmail = officerEmail;
		this.newPassword = newPassword;
		this.confirmPassword = confirmPassword;
	}
	public String getOfficerEmail() {
		return officerEmail;
	}
	public void setOfficerEmail(String officerEmail) {
		this.officerEmail = officerEmail;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	


	
}
