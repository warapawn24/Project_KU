package com.ku.dku.bean;

import java.util.List;

public class ListAdminViewReserveResponse {

	private List<AdminViewReserveResponse> detail;

	
	
	public ListAdminViewReserveResponse() {
		super();
	}

	public ListAdminViewReserveResponse(List<AdminViewReserveResponse> detail) {
		super();
		this.detail = detail;
	}

	public List<AdminViewReserveResponse> getDetail() {
		return detail;
	}

	public void setDetail(List<AdminViewReserveResponse> detail) {
		this.detail = detail;
	}
	
	
}
