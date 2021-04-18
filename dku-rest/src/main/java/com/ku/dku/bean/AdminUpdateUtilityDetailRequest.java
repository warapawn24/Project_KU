package com.ku.dku.bean;

import java.util.Date;
import java.util.List;

public class AdminUpdateUtilityDetailRequest {

	private long roomId;

	private Float utilityWater;
	private Float utilityElectric;
	
	private Float utilityTotal;
	private String utilityDate;
	private String utilityStartdate;
	private String utilityDuedate;
	
	
	public AdminUpdateUtilityDetailRequest() {
		super();
	}
	public AdminUpdateUtilityDetailRequest(long roomId, Float utilityWater, Float utilityElectric, Float utilityTotal,
			String utilityDate, String utilityStartdate, String utilityDuedate) {
		super();
		this.roomId = roomId;
		this.utilityWater = utilityWater;
		this.utilityElectric = utilityElectric;
		this.utilityTotal = utilityTotal;
		this.utilityDate = utilityDate;
		this.utilityStartdate = utilityStartdate;
		this.utilityDuedate = utilityDuedate;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public Float getUtilityWater() {
		return utilityWater;
	}
	public void setUtilityWater(Float utilityWater) {
		this.utilityWater = utilityWater;
	}
	public Float getUtilityElectric() {
		return utilityElectric;
	}
	public void setUtilityElectric(Float utilityElectric) {
		this.utilityElectric = utilityElectric;
	}
	public Float getUtilityTotal() {
		return utilityTotal;
	}
	public void setUtilityTotal(Float utilityTotal) {
		this.utilityTotal = utilityTotal;
	}
	public String getUtilityDate() {
		return utilityDate;
	}
	public void setUtilityDate(String utilityDate) {
		this.utilityDate = utilityDate;
	}
	public String getUtilityStartdate() {
		return utilityStartdate;
	}
	public void setUtilityStartdate(String utilityStartdate) {
		this.utilityStartdate = utilityStartdate;
	}
	public String getUtilityDuedate() {
		return utilityDuedate;
	}
	public void setUtilityDuedate(String utilityDuedate) {
		this.utilityDuedate = utilityDuedate;
	}
	
	
	
	
	
	
}
