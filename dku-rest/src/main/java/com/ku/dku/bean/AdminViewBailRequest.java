package com.ku.dku.bean;

public class AdminViewBailRequest {
	private String bailBank;
	private String bailStatus;
	
	
	
	public AdminViewBailRequest() {
		super();
	}
	public AdminViewBailRequest(String bailBank, String bailStatus) {
		super();
		this.bailBank = bailBank;
		this.bailStatus = bailStatus;
	}
	public String getBailBank() {
		return bailBank;
	}
	public void setBailBank(String bailBank) {
		this.bailBank = bailBank;
	}
	public String getBailStatus() {
		return bailStatus;
	}
	public void setBailStatus(String bailStatus) {
		this.bailStatus = bailStatus;
	}
	
	
}
