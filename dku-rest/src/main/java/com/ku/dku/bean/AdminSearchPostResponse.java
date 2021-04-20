package com.ku.dku.bean;

public class AdminSearchPostResponse {

	private long postId;
	private long studentId;
	private String studentFname;
	private String studentLname;
	private String postStatus;
	
	
	public AdminSearchPostResponse() {
		super();
	}
	public AdminSearchPostResponse(long postId, long studentId, String studentFname, String studentLname,
			String postStatus) {
		super();
		this.postId = postId;
		this.studentId = studentId;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		this.postStatus = postStatus;
	}
	public long getPostId() {
		return postId;
	}
	public void setPostId(long postId) {
		this.postId = postId;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getStudentFname() {
		return studentFname;
	}
	public void setStudentFname(String studentFname) {
		this.studentFname = studentFname;
	}
	public String getStudentLname() {
		return studentLname;
	}
	public void setStudentLname(String studentLname) {
		this.studentLname = studentLname;
	}
	public String getPostStatus() {
		return postStatus;
	}
	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}
	
	
}
