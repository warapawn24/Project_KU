package com.ku.dku.bean;

import java.util.List;

public class ListAdminSearchPostResponse {
 
	private List<AdminSearchPostResponse> detail;

	
	public ListAdminSearchPostResponse() {
		super();
	}

	public ListAdminSearchPostResponse(List<AdminSearchPostResponse> detail) {
		super();
		this.detail = detail;
	}

	public List<AdminSearchPostResponse> getDetail() {
		return detail;
	}

	public void setDetail(List<AdminSearchPostResponse> detail) {
		this.detail = detail;
	}
	
	
}
