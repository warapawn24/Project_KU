package com.ku.dku.bean;

import java.util.List;

public class ListAdminUpdateDataStudentRequest {

	private List<AdminUpdateDataStudentRequest> studentDataRequest;

	
	public ListAdminUpdateDataStudentRequest() {
		super();
	}

	public ListAdminUpdateDataStudentRequest(List<AdminUpdateDataStudentRequest> studentDataRequest) {
		super();
		this.studentDataRequest = studentDataRequest;
	}

	public List<AdminUpdateDataStudentRequest> getStudentDataRequest() {
		return studentDataRequest;
	}

	public void setStudentDataRequest(List<AdminUpdateDataStudentRequest> studentDataRequest) {
		this.studentDataRequest = studentDataRequest;
	}
	
	
	
	
	
	
}
