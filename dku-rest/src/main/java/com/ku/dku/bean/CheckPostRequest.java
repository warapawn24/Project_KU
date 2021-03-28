package com.ku.dku.bean;


public class CheckPostRequest {
	
	private long studentId;

	
	
	public CheckPostRequest() {
		super();
	}

	public CheckPostRequest(long studentId) {
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
