package com.ku.dku.bean;

public class ChangeStatusPostRequest {
	
	private long postId;

	
	public ChangeStatusPostRequest() {
		super();
	}

	public ChangeStatusPostRequest(long postId) {
		super();
		this.postId = postId;
	}

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	
	
	

}
