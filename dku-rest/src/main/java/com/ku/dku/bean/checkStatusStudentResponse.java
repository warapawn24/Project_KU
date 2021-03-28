package com.ku.dku.bean;

import java.util.Date;

public class checkStatusStudentResponse {
	private long studentId;
	private String studentStatus;
	private Date startDate;
	private Date endDate;
	
	
	public checkStatusStudentResponse() {
		super();
	}
	public checkStatusStudentResponse(long studentId, String studentStatus, Date startDate, Date endDate) {
		super();
		this.studentId = studentId;
		this.studentStatus = studentStatus;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentStatus() {
		return studentStatus;
	}
	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
	
}
