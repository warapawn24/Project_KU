package com.ku.dku.bean;

public class BuildingDataResponse {

	private long recId;
	private long roomId;
	private long romFloor;
	
	
	public BuildingDataResponse() {
		super();
	}
	public BuildingDataResponse(long recId, long roomId, long romFloor) {
		super();
		this.recId = recId;
		this.roomId = roomId;
		this.romFloor = romFloor;
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
	public long getRomFloor() {
		return romFloor;
	}
	public void setRomFloor(long romFloor) {
		this.romFloor = romFloor;
	}
	
	
}
