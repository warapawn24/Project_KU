package com.ku.dku.bean;

public class CreatebailRequest {
	private long termId;
	private Integer year;
	private long studentId;
	
	
	public CreatebailRequest() {
		super();
	}
	public CreatebailRequest(long termId, Integer year, long studentId) {
		super();
		this.termId = termId;
		this.year = year;
		this.studentId = studentId;
	}
	public long getTermId() {
		return termId;
	}
	public void setTermId(long termId) {
		this.termId = termId;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	
	
	
	
}
