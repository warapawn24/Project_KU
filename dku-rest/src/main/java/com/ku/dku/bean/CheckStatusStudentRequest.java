package com.ku.dku.bean;

public class CheckStatusStudentRequest {
	
	private long studentId;

	
	
	public CheckStatusStudentRequest() {
		super();
	}

	public CheckStatusStudentRequest(long studentId) {
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
