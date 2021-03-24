package com.ku.dku.bean;

public class DetailBailStatusRequest {
	private long studentId;

	
	public DetailBailStatusRequest() {
		super();
	}

	public DetailBailStatusRequest(long studentId) {
		super();
		this.studentId = studentId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	
}
