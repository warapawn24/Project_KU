package com.ku.dku.bean;

import java.util.Date;

public class AdminViewBailResponse {
	
	private long bailId; 
	private long studentId;
	private long roomId;
	private Date bailDate;
	private String bailStatus;
	private String bailNotation;
	
	
	public AdminViewBailResponse() {
		super();
	}
	public AdminViewBailResponse(long bailId, long studentId, long roomId, Date bailDate, String bailStatus,
			String bailNotation) {
		super();
		this.bailId = bailId;
		this.studentId = studentId;
		this.roomId = roomId;
		this.bailDate = bailDate;
		this.bailStatus = bailStatus;
		this.bailNotation = bailNotation;
	}
	public long getBailId() {
		return bailId;
	}
	public void setBailId(long bailId) {
		this.bailId = bailId;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public Date getBailDate() {
		return bailDate;
	}
	public void setBailDate(Date bailDate) {
		this.bailDate = bailDate;
	}
	public String getBailStatus() {
		return bailStatus;
	}
	public void setBailStatus(String bailStatus) {
		this.bailStatus = bailStatus;
	}
	public String getBailNotation() {
		return bailNotation;
	}
	public void setBailNotation(String bailNotation) {
		this.bailNotation = bailNotation;
	}
	
	


}
