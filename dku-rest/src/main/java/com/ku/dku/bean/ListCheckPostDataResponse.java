package com.ku.dku.bean;

import java.util.Date;



public class ListCheckPostDataResponse {
	
	private long postId;
	private Date postDate;
	private String postCode;
	private String postStatus;
	private Date postRecivedate;
	
	
	public ListCheckPostDataResponse() {
		super();
	}
	public ListCheckPostDataResponse(long postId, Date postDate, String postCode, String postStatus,
			Date postRecivedate) {
		super();
		this.postId = postId;
		this.postDate = postDate;
		this.postCode = postCode;
		this.postStatus = postStatus;
		this.postRecivedate = postRecivedate;
	}
	public long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
		this.postId = postId;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getPostStatus() {
		return postStatus;
	}
	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}
	public Date getPostRecivedate() {
		return postRecivedate;
	}
	public void setPostRecivedate(Date postRecivedate) {
		this.postRecivedate = postRecivedate;
	}
	
	
	
	

}
