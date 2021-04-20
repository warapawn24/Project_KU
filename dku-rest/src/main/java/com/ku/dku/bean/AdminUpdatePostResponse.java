package com.ku.dku.bean;

public class AdminUpdatePostResponse {

	private long postId;
	private String statusResponse;
	
	
	public AdminUpdatePostResponse() {
		super();
	}
	public AdminUpdatePostResponse(long postId, String statusResponse) {
		super();
		this.postId = postId;
		this.statusResponse = statusResponse;
	}
	public long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
		this.postId = postId;
	}
	public String getStatusResponse() {
		return statusResponse;
	}
	public void setStatusResponse(String statusResponse) {
		this.statusResponse = statusResponse;
	}
	
	
}
