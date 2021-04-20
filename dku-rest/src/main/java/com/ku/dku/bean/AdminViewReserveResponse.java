package com.ku.dku.bean;

public class AdminViewReserveResponse {

	private long reserveId;
	private long studentId;
	private String studentFname;
	private String studentLname;
	private long roomId;
	private String reserveStatus;
	private Float reservePrice;
	
	
	
	public AdminViewReserveResponse() {
		super();
	}
	public AdminViewReserveResponse(long reserveId, long studentId, String studentFname, String studentLname,
			long roomId, String reserveStatus, Float reservePrice) {
		super();
		this.reserveId = reserveId;
		this.studentId = studentId;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		this.roomId = roomId;
		this.reserveStatus = reserveStatus;
		this.reservePrice = reservePrice;
	}
	public long getReserveId() {
		return reserveId;
	}
	public void setReserveId(long reserveId) {
		this.reserveId = reserveId;
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
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getReserveStatus() {
		return reserveStatus;
	}
	public void setReserveStatus(String reserveStatus) {
		this.reserveStatus = reserveStatus;
	}
	public Float getReservePrice() {
		return reservePrice;
	}
	public void setReservePrice(Float reservePrice) {
		this.reservePrice = reservePrice;
	}
	
	
	
}
