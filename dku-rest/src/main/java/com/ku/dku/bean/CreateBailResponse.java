package com.ku.dku.bean;

import java.util.Date;

public class CreateBailResponse {
	private long bailId;
	private long studenId;
	private long roomId;
	private String studentFname;
	private String studentLname;
	private Date bailDate;
	private String bailStatus;
	private String statusResponse;
	
	
	public CreateBailResponse() {
		super();
	}
	public CreateBailResponse(long bailId, long studenId, long roomId, String studentFname, String studentLname,
			Date bailDate, String bailStatus, String statusResponse) {
		super();
		this.bailId = bailId;
		this.studenId = studenId;
		this.roomId = roomId;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		this.bailDate = bailDate;
		this.bailStatus = bailStatus;
		this.statusResponse = statusResponse;
	}
	public long getBailId() {
		return bailId;
	}
	public void setBailId(long bailId) {
		this.bailId = bailId;
	}
	public long getStudenId() {
		return studenId;
	}
	public void setStudenId(long studenId) {
		this.studenId = studenId;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getStudentFname() {
		return studentFname;
	}
	public void setStudentFname(String studentFname) {
		this.studentFname = studentFname;
	}
	public String getStudentLname() {
		return studentLname;
	}
	public void setStudentLname(String studentLname) {
		this.studentLname = studentLname;
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
	public String getStatusResponse() {
		return statusResponse;
	}
	public void setStatusResponse(String statusResponse) {
		this.statusResponse = statusResponse;
	}
	
	
	
	
	
}
