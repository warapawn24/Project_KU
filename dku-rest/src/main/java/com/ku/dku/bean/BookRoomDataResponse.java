package com.ku.dku.bean;

import java.util.List;

public class BookRoomDataResponse {
	
	private String typeName;
	private long roomId;
	private long floor;
	private String buildingName;
	private Integer totalPeople;
	private Float price;
	
	private List<ViewDataReserve> detailStudent;

	
	public BookRoomDataResponse() {
		super();
	}

	public BookRoomDataResponse(String typeName, long roomId, long floor, String buildingName, Integer totalPeople,
			Float price, List<ViewDataReserve> detailStudent) {
		super();
		this.typeName = typeName;
		this.roomId = roomId;
		this.floor = floor;
		this.buildingName = buildingName;
		this.totalPeople = totalPeople;
		this.price = price;
		this.detailStudent = detailStudent;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public long getFloor() {
		return floor;
	}

	public void setFloor(long floor) {
		this.floor = floor;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public Integer getTotalPeople() {
		return totalPeople;
	}

	public void setTotalPeople(Integer totalPeople) {
		this.totalPeople = totalPeople;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public List<ViewDataReserve> getDetailStudent() {
		return detailStudent;
	}

	public void setDetailStudent(List<ViewDataReserve> detailStudent) {
		this.detailStudent = detailStudent;
	}
	
	
	
	
}
