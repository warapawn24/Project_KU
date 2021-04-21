package com.ku.dku.bean;

public class ViewDataReserve {

	private long studentId;
	private String studentFname;
	private String studentLname;
	
	
	public ViewDataReserve() {
		super();
	}
	public ViewDataReserve(long studentId, String studentFname, String studentLname) {
		super();
		this.studentId = studentId;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
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
	
	
}
