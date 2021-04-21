package com.ku.dku.bean;

import java.util.List;

public class ListBuildingDataResponse {

	private long roomFloor;
	private List<BuildingDataResponse> listRoom;
	
	
	public ListBuildingDataResponse() {
		super();
	}
	public ListBuildingDataResponse(long roomFloor, List<BuildingDataResponse> listRoom) {
		super();
		this.roomFloor = roomFloor;
		this.listRoom = listRoom;
	}
	public long getRoomFloor() {
		return roomFloor;
	}
	public void setRoomFloor(long roomFloor) {
		this.roomFloor = roomFloor;
	}
	public List<BuildingDataResponse> getListRoom() {
		return listRoom;
	}
	public void setListRoom(List<BuildingDataResponse> listRoom) {
		this.listRoom = listRoom;
	}
	
	
	
	
	
	
	
	
	
}
