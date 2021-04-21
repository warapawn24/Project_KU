package com.ku.dku.bean;

public class BuildingDataRequest {
		
	private long buildingId;
	private long floorId;
	
	
	public BuildingDataRequest() {
		super();
	}
	public BuildingDataRequest(long buildingId, long floorId) {
		super();
		this.buildingId = buildingId;
		this.floorId = floorId;
	}
	public long getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(long buildingId) {
		this.buildingId = buildingId;
	}
	public long getFloorId() {
		return floorId;
	}
	public void setFloorId(long floorId) {
		this.floorId = floorId;
	}
	
	
		
}
