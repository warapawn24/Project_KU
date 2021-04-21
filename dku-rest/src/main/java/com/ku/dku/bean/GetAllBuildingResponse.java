package com.ku.dku.bean;

public class GetAllBuildingResponse {
	private long buildingId;
	private String BuildingName;
	
	
	
	public GetAllBuildingResponse() {
		super();
	}
	public GetAllBuildingResponse(long buildingId, String buildingName) {
		super();
		this.buildingId = buildingId;
		BuildingName = buildingName;
	}
	public long getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(long buildingId) {
		this.buildingId = buildingId;
	}
	public String getBuildingName() {
		return BuildingName;
	}
	public void setBuildingName(String buildingName) {
		BuildingName = buildingName;
	}
	
	
}
