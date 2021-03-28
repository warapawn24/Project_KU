package com.ku.dku.bean;

public class ListLastUtilityBillThreeResponse {
	private long utilityId;
	private String utilityDateRetroact;
	private Float utilityTotalRetroact;
	private String utilityStatusRetroact;
	
	
	public ListLastUtilityBillThreeResponse() {
		super();
	}
	public ListLastUtilityBillThreeResponse(long utilityId, String utilityDateRetroact, Float utilityTotalRetroact,
			String utilityStatusRetroact) {
		super();
		this.utilityId = utilityId;
		this.utilityDateRetroact = utilityDateRetroact;
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
