package com.ku.dku.bean;

import java.util.Date;

public class CreateBailResponse {
	private long bailId;
	private long studenId;
	private long roomId;
	private String studentFname;
	private String studentLname;
	private String termName;
	private Integer year;
	private Date bailDate;
	private String statusResponse;
	
	
	public CreateBailResponse() {
		super();
	}
	public CreateBailResponse(long bailId, long studenId, long roomId, String studentFname, String studentLname,
			String termName, Integer year, Date bailDate, String statusResponse) {
		super();
		this.bailId = bailId;
		this.studenId = studenId;
		this.roomId = roomId;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		this.termName = termName;
		this.year = year;
		this.bailDate = bailDate;
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
	public String getTermName() {
		return termName;
	}
	public void setTermName(String termName) {
		this.termName = termName;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Date getBailDate() {
		return bailDate;
	}
	public void setBailDate(Date bailDate) {
		this.bailDate = bailDate;
	}
	public String getStatusResponse() {
		return statusResponse;
	}
	public void setStatusResponse(String statusResponse) {
		this.statusResponse = statusResponse;
	}
	
	
	
	
	
	
	
	
}
