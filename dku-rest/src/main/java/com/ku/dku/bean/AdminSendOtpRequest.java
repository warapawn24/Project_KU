package com.ku.dku.bean;

public class AdminSendOtpRequest {
	private String officerEmail;

	
	public AdminSendOtpRequest() {
		super();
	}

	public AdminSendOtpRequest(String officerEmail) {
		super();
		this.officerEmail = officerEmail;
	}

	public String getOfficerEmail() {
		return officerEmail;
	}

	public void setOfficerEmail(String officerEmail) {
		this.officerEmail = officerEmail;
	}
	
	
}
