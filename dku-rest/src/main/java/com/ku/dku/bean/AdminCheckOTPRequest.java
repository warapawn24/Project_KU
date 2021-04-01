package com.ku.dku.bean;

public class AdminCheckOTPRequest {

	private String otpCode;
	private String email;
	
	
	public AdminCheckOTPRequest() {
		super();
	}
	public AdminCheckOTPRequest(String otpCode, String email) {
		super();
		this.otpCode = otpCode;
		this.email = email;
	}
	public String getOtpCode() {
		return otpCode;
	}
	public void setOtpCode(String otpCode) {
		this.otpCode = otpCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
