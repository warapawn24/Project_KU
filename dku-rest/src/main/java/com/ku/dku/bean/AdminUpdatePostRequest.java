package com.ku.dku.bean;

public class AdminUpdatePostRequest {

	private long studentId;

	
	public AdminUpdatePostRequest() {
		super();
	}

	public AdminUpdatePostRequest(long studentId) {
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
