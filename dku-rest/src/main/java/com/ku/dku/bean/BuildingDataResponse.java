package com.ku.dku.bean;

public class BuildingDataResponse {

	private long recId;
	private long roomId;
	private long availability;
	
	
	public BuildingDataResponse() {
		super();
	}
	public BuildingDataResponse(long recId, long roomId, long availability) {
		super();
		this.recId = recId;
		this.roomId = roomId;
		this.availability = availability;
	}
	public long getRecId() {
		return recId;
	}
	public void setRecId(long recId) {
		this.recId = recId;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public long getAvailability() {
		return availability;
	}
	public void setAvailability(long availability) {
		this.availability = availability;
	}
	
	
	
	
	
	
}
