package com.ku.dku.bean;

import java.util.List;

public class ListFloorByBuildingResponse {
	
	
	private List<ListBuildingDataResponse> listBuilding;

	
	
	public ListFloorByBuildingResponse() {
		super();
	}

	public ListFloorByBuildingResponse(List<ListBuildingDataResponse> listBuilding) {
		super();
		this.listBuilding = listBuilding;
	}

	public List<ListBuildingDataResponse> getListBuilding() {
		return listBuilding;
	}

	public void setListBuilding(List<ListBuildingDataResponse> listBuilding) {
		this.listBuilding = listBuilding;
	}
	
	
	
	
	
}
