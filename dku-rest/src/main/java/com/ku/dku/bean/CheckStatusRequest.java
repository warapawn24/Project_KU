package com.ku.dku.bean;

public class CheckStatusRequest {
	private long studentId;

	
	
	
	public CheckStatusRequest() {
		super();
	}

	public CheckStatusRequest(long studentId) {
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
