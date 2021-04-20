package com.ku.dku.bean;

public class AdminSearchPostRequest {

	private String keyword;

	
	public AdminSearchPostRequest() {
		super();
	}

	public AdminSearchPostRequest(String keyword) {
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
