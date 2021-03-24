package com.ku.dku.bean;

import java.util.List;

public class BailAmountResponse {
	private float bailAmount;
	private List<ListBailTotalResponse> detail;
	
	
	public BailAmountResponse() {
		super();
	}
	public BailAmountResponse(float bailAmount, List<ListBailTotalResponse> detail) {
		super();
		this.bailAmount = bailAmount;
		this.detail = detail;
	}
	public float getBailAmount() {
		return bailAmount;
	}
	public void setBailAmount(float bailAmount) {
		this.bailAmount = bailAmount;
	}
	public List<ListBailTotalResponse> getDetail() {
		return detail;
	}
	public void setDetail(List<ListBailTotalResponse> detail) {
		this.detail = detail;
	}

	
}
