package com.ku.dku.bean;

import java.util.List;

public class ListAdminRepairShowResponse {

	private List<AdminRepairShowDetailResponse> detail;

	
	public ListAdminRepairShowResponse() {
		super();
	}

	public ListAdminRepairShowResponse(List<AdminRepairShowDetailResponse> detail) {
		super();
		this.detail = detail;
	}

	public List<AdminRepairShowDetailResponse> getDetail() {
		return detail;
	}

	public void setDetail(List<AdminRepairShowDetailResponse> detail) {
		this.detail = detail;
	}

	
	
	
}
