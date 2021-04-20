package com.ku.dku.bean;

import java.util.Date;

public class SetDateBookRoomRequest {

	private String reserveStart;
	private String reserveDue;
	private long termId;
	private Integer year;
	
	
	public SetDateBookRoomRequest() {
		super();
	}
	public SetDateBookRoomRequest(String reserveStart, String reserveDue, long termId, Integer year) {
		super();
		this.reserveStart = reserveStart;
		this.reserveDue = reserveDue;
		this.termId = termId;
		this.year = year;
	}
	public String getReserveStart() {
		return reserveStart;
	}
	public void setReserveStart(String reserveStart) {
		this.reserveStart = reserveStart;
	}
	public String getReserveDue() {
		return reserveDue;
	}
	public void setReserveDue(String reserveDue) {
		this.reserveDue = reserveDue;
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
	
	
	
	
	
	
}
