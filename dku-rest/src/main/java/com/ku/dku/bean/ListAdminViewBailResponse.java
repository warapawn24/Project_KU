package com.ku.dku.bean;

import java.util.List;

public class ListAdminViewBailResponse {

	private List<AdminViewBailResponse> detail;

	
	
	public ListAdminViewBailResponse() {
		super();
	}

	public ListAdminViewBailResponse(List<AdminViewBailResponse> detail) {
		super();
		this.detail = detail;
	}

	public List<AdminViewBailResponse> getDetail() {
		return detail;
	}

	public void setDetail(List<AdminViewBailResponse> detail) {
		this.detail = detail;
	}
	
	
}
