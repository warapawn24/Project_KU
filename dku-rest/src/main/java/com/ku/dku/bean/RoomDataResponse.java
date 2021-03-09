package com.ku.dku.bean;

public class RoomDataResponse {

	private long recId;
	private long roomId;
	
	
	public RoomDataResponse() {
		super();
	}
	public RoomDataResponse(long recId, long roomId) {
		super();
		this.recId = recId;
		this.roomId = roomId;
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
	
	
}
