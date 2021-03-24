package com.ku.dku.bean;

import java.util.Date;
import java.util.List;

public class DetailBailStatusResponse {
	private Date bailDate;
	private String bailStatus;
	private List<BailAmountResponse> bailTotal;
	private String bailNotation;
	
	
	public DetailBailStatusResponse() {
		super();
	}
	public DetailBailStatusResponse(Date bailDate, String bailStatus, List<BailAmountResponse> bailTotal,
			String bailNotation) {
		super();
		this.bailDate = bailDate;
		this.bailStatus = bailStatus;
		this.bailTotal = bailTotal;
		this.bailNotation = bailNotation;
	}
	public Date getBailDate() {
		return bailDate;
	}
	public void setBailDate(Date bailDate) {
		this.bailDate = bailDate;
	}
	public String getBailStatus() {
		return bailStatus;
	}
	public void setBailStatus(String bailStatus) {
		this.bailStatus = bailStatus;
	}
	public List<BailAmountResponse> getBailTotal() {
		return bailTotal;
	}
	public void setBailTotal(List<BailAmountResponse> bailTotal) {
		this.bailTotal = bailTotal;
	}
	public String getBailNotation() {
		return bailNotation;
	}
	public void setBailNotation(String bailNotation) {
		this.bailNotation = bailNotation;
	}
	
	
	
	
}
