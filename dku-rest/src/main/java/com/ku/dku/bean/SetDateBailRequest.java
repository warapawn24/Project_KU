package com.ku.dku.bean;

import java.util.Date;

public class SetDateBailRequest {

	private String bailStart;
	private String bailDue;
	private long term;
	private Integer year;

	
	public SetDateBailRequest() {
		super();
	}
	public SetDateBailRequest(String bailStart, String bailDue, long term, Integer year) {
		super();
		this.bailStart = bailStart;
		this.bailDue = bailDue;
		this.term = term;
		this.year = year;
	}
	public String getBailStart() {
		return bailStart;
	}
	public void setBailStart(String bailStart) {
		this.bailStart = bailStart;
	}
	public String getBailDue() {
		return bailDue;
	}
	public void setBailDue(String bailDue) {
		this.bailDue = bailDue;
	}
	public long getTerm() {
		return term;
	}
	public void setTerm(long term) {
		this.term = term;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	
	
}
