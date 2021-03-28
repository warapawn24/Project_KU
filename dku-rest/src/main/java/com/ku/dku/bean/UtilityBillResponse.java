package com.ku.dku.bean;

import java.util.List;

public class UtilityBillResponse {
	private long utilityId;
	private String utilityDatePresent;
	private Float utilityWaterPresent;
	private Float utilityElectricbillPresent;
	private Float utilityFinesPresent;
	private Float utilityTotalPresent;
	private String utilityStatusPresent;
	private List<ListLastUtilityBillThreeResponse> utilityRetroact;
	
	
	
	public UtilityBillResponse() {
		super();
	}
	public UtilityBillResponse(long utilityId, String utilityDatePresent, Float utilityWaterPresent,
			Float utilityElectricbillPresent, Float utilityFinesPresent, Float utilityTotalPresent,
			String utilityStatusPresent, List<ListLastUtilityBillThreeResponse> utilityRetroact) {
		super();
		this.utilityId = utilityId;
		this.utilityDatePresent = utilityDatePresent;
		this.utilityWaterPresent = utilityWaterPresent;
		this.utilityElectricbillPresent = utilityElectricbillPresent;
		this.utilityFinesPresent = utilityFinesPresent;
		this.utilityTotalPresent = utilityTotalPresent;
		this.utilityStatusPresent = utilityStatusPresent;
		this.utilityRetroact = utilityRetroact;
	}
	public long getUtilityId() {
		return utilityId;
	}
	public void setUtilityId(long utilityId) {
		this.utilityId = utilityId;
	}
	public String getUtilityDatePresent() {
		return utilityDatePresent;
	}
	public void setUtilityDatePresent(String utilityDatePresent) {
		this.utilityDatePresent = utilityDatePresent;
	}
	public Float getUtilityWaterPresent() {
		return utilityWaterPresent;
	}
	public void setUtilityWaterPresent(Float utilityWaterPresent) {
		this.utilityWaterPresent = utilityWaterPresent;
	}
	public Float getUtilityElectricbillPresent() {
		return utilityElectricbillPresent;
	}
	public void setUtilityElectricbillPresent(Float utilityElectricbillPresent) {
		this.utilityElectricbillPresent = utilityElectricbillPresent;
	}
	public Float getUtilityFinesPresent() {
		return utilityFinesPresent;
	}
	public void setUtilityFinesPresent(Float utilityFinesPresent) {
		this.utilityFinesPresent = utilityFinesPresent;
	}
	public Float getUtilityTotalPresent() {
		return utilityTotalPresent;
	}
	public void setUtilityTotalPresent(Float utilityTotalPresent) {
		this.utilityTotalPresent = utilityTotalPresent;
	}
	public String getUtilityStatusPresent() {
		return utilityStatusPresent;
	}
	public void setUtilityStatusPresent(String utilityStatusPresent) {
		this.utilityStatusPresent = utilityStatusPresent;
	}
	public List<ListLastUtilityBillThreeResponse> getUtilityRetroact() {
		return utilityRetroact;
	}
	public void setUtilityRetroact(List<ListLastUtilityBillThreeResponse> utilityRetroact) {
		this.utilityRetroact = utilityRetroact;
	}
	
	
	
	
	
}
