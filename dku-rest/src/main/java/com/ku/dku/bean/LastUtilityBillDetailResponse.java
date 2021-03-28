package com.ku.dku.bean;

import java.util.List;

public class LastUtilityBillDetailResponse {
	private List<ListLastUtilityBillDetailResponse> detail;

	
	public LastUtilityBillDetailResponse() {
		super();
	}

	public LastUtilityBillDetailResponse(List<ListLastUtilityBillDetailResponse> detail) {
		super();
		this.detail = detail;
	}

	public List<ListLastUtilityBillDetailResponse> getDetail() {
		return detail;
	}

	public void setDetail(List<ListLastUtilityBillDetailResponse> detail) {
		this.detail = detail;
	}
	
	
}
