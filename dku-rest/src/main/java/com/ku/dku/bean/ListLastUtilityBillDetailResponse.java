package com.ku.dku.bean;

public class ListLastUtilityBillDetailResponse {
	private long utilityId;
	private String utilityDateRetroact;
	private Float utilityWaterRetroact;
	private Float utilityElectricbillRetroact;
	private Float utilityFinesRetroact;
	private Float utilityTotalRetroact;
	private String utilityStatusRetroact;
	
	
	
	public ListLastUtilityBillDetailResponse() {
		super();
	}
	public ListLastUtilityBillDetailResponse(long utilityId, String utilityDateRetroact, Float utilityWaterRetroact,
			Float utilityElectricbillRetroact, Float utilityFinesRetroact, Float utilityTotalRetroact,
			String utilityStatusRetroact) {
		super();
		this.utilityId = utilityId;
		this.utilityDateRetroact = utilityDateRetroact;
		this.utilityWaterRetroact = utilityWaterRetroact;
		this.utilityElectricbillRetroact = utilityElectricbillRetroact;
		this.utilityFinesRetroact = utilityFinesRetroact;
		this.utilityTotalRetroact = utilityTotalRetroact;
		this.utilityStatusRetroact = utilityStatusRetroact;
	}
	public long getUtilityId() {
		return utilityId;
	}
	public void setUtilityId(long utilityId) {
		this.utilityId = utilityId;
	}
	public String getUtilityDateRetroact() {
		return utilityDateRetroact;
	}
	public void setUtilityDateRetroact(String utilityDateRetroact) {
		this.utilityDateRetroact = utilityDateRetroact;
	}
	public Float getUtilityWaterRetroact() {
		return utilityWaterRetroact;
	}
	public void setUtilityWaterRetroact(Float utilityWaterRetroact) {
		this.utilityWaterRetroact = utilityWaterRetroact;
	}
	public Float getUtilityElectricbillRetroact() {
		return utilityElectricbillRetroact;
	}
	public void setUtilityElectricbillRetroact(Float utilityElectricbillRetroact) {
		this.utilityElectricbillRetroact = utilityElectricbillRetroact;
	}
	public Float getUtilityFinesRetroact() {
		return utilityFinesRetroact;
	}
	public void setUtilityFinesRetroact(Float utilityFinesRetroact) {
		this.utilityFinesRetroact = utilityFinesRetroact;
	}
	public Float getUtilityTotalRetroact() {
		return utilityTotalRetroact;
	}
	public void setUtilityTotalRetroact(Float utilityTotalRetroact) {
		this.utilityTotalRetroact = utilityTotalRetroact;
	}
	public String getUtilityStatusRetroact() {
		return utilityStatusRetroact;
	}
	public void setUtilityStatusRetroact(String utilityStatusRetroact) {
		this.utilityStatusRetroact = utilityStatusRetroact;
	}
	
	
}
