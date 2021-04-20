package com.ku.dku.bean;

import java.util.List;

public class ListShowAllInfoAdminResponse {

	private List<ShowAllInfoAdminResponse> detail;

	
	public ListShowAllInfoAdminResponse() {
		super();
	}

	public ListShowAllInfoAdminResponse(List<ShowAllInfoAdminResponse> detail) {
		super();
		this.detail = detail;
	}

	public List<ShowAllInfoAdminResponse> getDetail() {
		return detail;
	}

	public void setDetail(List<ShowAllInfoAdminResponse> detail) {
		this.detail = detail;
	}
	
}
