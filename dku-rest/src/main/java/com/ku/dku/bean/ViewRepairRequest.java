package com.ku.dku.bean;

public class ViewRepairRequest {

	private long studentId;

	
	public ViewRepairRequest() {
		super();
	}

	public ViewRepairRequest(long studentId) {
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
