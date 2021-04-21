package com.ku.dku.bean;

import java.util.List;

public class ListRelationViewResponse {

	private List<RelationViewResponse> detail;

	
	
	public ListRelationViewResponse() {
		super();
	}

	public ListRelationViewResponse(List<RelationViewResponse> detail) {
		super();
		this.detail = detail;
	}

	public List<RelationViewResponse> getDetail() {
		return detail;
	}

	public void setDetail(List<RelationViewResponse> detail) {
		this.detail = detail;
	}
	
	
}
