package com.ku.dku.bean;

import java.util.List;

public class CheckPostResponse {

	private List<ListCheckPostDataResponse> postDetail;

	
	
	public CheckPostResponse() {
		super();
	}

	public CheckPostResponse(List<ListCheckPostDataResponse> postDetail) {
		super();
		this.postDetail = postDetail;
	}

	public List<ListCheckPostDataResponse> getPostDetail() {
		return postDetail;
	}

	public void setPostDetail(List<ListCheckPostDataResponse> postDetail) {
		this.postDetail = postDetail;
	}
	
	
	
	
}
