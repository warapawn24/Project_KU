package com.ku.dku.bean;

import java.util.Date;

public class SetDateBookRoomRequest {

	private Date reserveStart;
	private Date reserveDue;
	private long termId;
	private Integer year;
	public Date getReserveStart() {
		return reserveStart;
	}
	public void setReserveStart(Date reserveStart) {
		this.reserveStart = reserveStart;
	}
	public Date getReserveDue() {
		return reserveDue;
	}
	public void setReserveDue(Date reserveDue) {
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
