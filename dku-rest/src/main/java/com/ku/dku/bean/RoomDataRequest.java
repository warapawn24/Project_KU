package com.ku.dku.bean;

public class RoomDataRequest {
	private long buildingIdRequest;

	
	
	public RoomDataRequest() {
		super();
	}

	public RoomDataRequest(long buildingIdRequest) {
		super();
		this.buildingIdRequest = buildingIdRequest;
	}

	public long getBuildingIdRequest() {
		return buildingIdRequest;
	}

	public void setBuildingIdRequest(long buildingIdRequest) {
		this.buildingIdRequest = buildingIdRequest;
	}
	
	

}
