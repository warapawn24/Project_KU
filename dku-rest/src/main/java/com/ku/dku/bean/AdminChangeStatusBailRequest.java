package com.ku.dku.bean;

public class AdminChangeStatusBailRequest {

	private long bailId;
	private String bailStatus;
	private String bailNotation;
	
	
	public AdminChangeStatusBailRequest() {
		super();
	}
	public AdminChangeStatusBailRequest(long bailId, String bailStatus, String bailNotation) {
		super();
		this.bailId = bailId;
		this.bailStatus = bailStatus;
		this.bailNotation = bailNotation;
	}
	public long getBailId() {
		return bailId;
	}
	public void setBailId(long bailId) {
		this.bailId = bailId;
	}
	public String getBailStatus() {
		return bailStatus;
	}
	public void setBailStatus(String bailStatus) {
		this.bailStatus = bailStatus;
	}
	public String getBailNotation() {
		return bailNotation;
	}
	public void setBailNotation(String bailNotation) {
		this.bailNotation = bailNotation;
	}
	
	
}
