package com.ku.dku.bean;

public class SearchRequest {
	private String keyword;

	
	public SearchRequest() {
		super();
	}

	public SearchRequest(String keyword) {
		super();
		this.keyword = keyword;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	
}
