package com.ku.dku.bean;

public class ListBailTypeRequest {
	private String bailType;

	
	public ListBailTypeRequest() {
		super();
	}

	public ListBailTypeRequest(String bailType) {
		super();
		this.bailType = bailType;
	}

	public String getBailType() {
		return bailType;
	}

	public void setBailType(String bailType) {
		this.bailType = bailType;
	}
}
