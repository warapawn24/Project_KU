package com.ku.dku.bean;

public class CreateRepairNumberRequest {
	private long studentId;

	
	public CreateRepairNumberRequest() {
		super();
	}

	public CreateRepairNumberRequest(long studentId) {
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
