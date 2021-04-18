package com.ku.dku.bean;

public class ShowInfoRequest {

	private long officerId;

	
	public ShowInfoRequest() {
		super();
	}

	public ShowInfoRequest(long officerId) {
		super();
		this.officerId = officerId;
	}

	public long getOfficerId() {
		return officerId;
	}

	public void setOfficerId(long officerId) {
		this.officerId = officerId;
	}
	
	
}
