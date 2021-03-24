package com.ku.dku.bean;

public class RepairResponse {
	private long repairId;
	private long studentId;
	private int year;
	private int yearNumber;
	private String studentFname;
	private String studentLname;
	private String statusResponse;
	private long roomId;
	
	
	
	
	public RepairResponse() {
		super();
	}
	public RepairResponse(long repairId, long studentId, int year, int yearNumber, String studentFname,
			String studentLname, String statusResponse, long roomId) {
		super();
		this.repairId = repairId;
		this.studentId = studentId;
		this.year = year;
		this.yearNumber = yearNumber;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		this.statusResponse = statusResponse;
		this.roomId = roomId;
	}
	public long getRepairId() {
		return repairId;
	}
	public void setRepairId(long repairId) {
		this.repairId = repairId;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYearNumber() {
		return yearNumber;
	}
	public void setYearNumber(int yearNumber) {
		this.yearNumber = yearNumber;
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
	public String getStatusResponse() {
		return statusResponse;
	}
	public void setStatusResponse(String statusResponse) {
		this.statusResponse = statusResponse;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	
	
	
	
	
	
	
	
	

}
