package com.ku.dku.bean;

public class AdminUpdatePhotoRequest {

	private long buildingId;

	
	
	public AdminUpdatePhotoRequest() {
		super();
	}

	public AdminUpdatePhotoRequest(long buildingId) {
		super();
		this.buildingId = buildingId;
	}

	public long getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(long buildingId) {
		this.buildingId = buildingId;
	}
	
	
	
}
