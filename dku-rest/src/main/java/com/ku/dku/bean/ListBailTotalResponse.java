package com.ku.dku.bean;

public class ListBailTotalResponse {
	
	private float bailWater;
	private float bailElectricbill;
	private float bailOther;
	
	
	public ListBailTotalResponse() {
		super();
	}
	public ListBailTotalResponse(float bailWater, float bailElectricbill, float bailOther) {
		super();
		this.bailWater = bailWater;
		this.bailElectricbill = bailElectricbill;
		this.bailOther = bailOther;
	}
	public float getBailWater() {
		return bailWater;
	}
	public void setBailWater(float bailWater) {
		this.bailWater = bailWater;
	}
	public float getBailElectricbill() {
		return bailElectricbill;
	}
	public void setBailElectricbill(float bailElectricbill) {
		this.bailElectricbill = bailElectricbill;
	}
	public float getBailOther() {
		return bailOther;
	}
	public void setBailOther(float bailOther) {
		this.bailOther = bailOther;
	}
	
	
}
