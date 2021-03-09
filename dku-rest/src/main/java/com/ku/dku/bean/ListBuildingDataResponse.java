package com.ku.dku.bean;

import java.util.List;

public class ListBuildingDataResponse {

	private long roomFloor;
	private List<RoomDataResponse> listRoom;
	
	
	public ListBuildingDataResponse() {
		super();
	}
	public ListBuildingDataResponse(long roomFloor, List<RoomDataResponse> listRoom) {
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
	public List<RoomDataResponse> getListRoom() {
		return listRoom;
	}
	public void setListRoom(List<RoomDataResponse> listRoom) {
		this.listRoom = listRoom;
	}
	
	
	
	
	
	
	
}
