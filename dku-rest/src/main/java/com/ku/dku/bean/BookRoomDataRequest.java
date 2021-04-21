package com.ku.dku.bean;

public class BookRoomDataRequest {
	private long buildingId;
	private long roomId;
	
	
	public BookRoomDataRequest() {
		super();
	}
	public BookRoomDataRequest(long buildingId, long roomId) {
		super();
		this.buildingId = buildingId;
		this.roomId = roomId;
	}
	public long getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(long buildingId) {
		this.buildingId = buildingId;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	
	
	
}
