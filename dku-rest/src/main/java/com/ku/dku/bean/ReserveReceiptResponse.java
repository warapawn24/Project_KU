package com.ku.dku.bean;

import java.util.Date;

public class ReserveReceiptResponse {

	private Integer receiptNumber;
	private Date receiptDate;
	private String studentFname;
	private String studentLname;
	private long studentId;
	private long roomId;
	private Date reserveDate;
	private String buildingType;
	private String term;
	private Integer year;
	private float price;
	private String officerFname;
	private String officerLname;
	private String officerRole;
	
	
	
	public ReserveReceiptResponse() {
		super();
	}
	public ReserveReceiptResponse(Integer receiptNumber, Date receiptDate, String studentFname, String studentLname,
			long studentId, long roomId, Date reserveDate, String buildingType, String term, Integer year, float price,
			String officerFname, String officerLname, String officerRole) {
		super();
		this.receiptNumber = receiptNumber;
		this.receiptDate = receiptDate;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		this.studentId = studentId;
		this.roomId = roomId;
		this.reserveDate = reserveDate;
		this.buildingType = buildingType;
		this.term = term;
		this.year = year;
		this.price = price;
		this.officerFname = officerFname;
		this.officerLname = officerLname;
		this.officerRole = officerRole;
	}
	public Integer getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(Integer receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	public Date getReceiptDate() {
		return receiptDate;
	}
	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
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
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public Date getReserveDate() {
		return reserveDate;
	}
	public void setReserveDate(Date reserveDate) {
		this.reserveDate = reserveDate;
	}
	public String getBuildingType() {
		return buildingType;
	}
	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}
	public String getTerm() {
		return term;
	}
	public void setTerm(String term) {
		this.term = term;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getOfficerFname() {
		return officerFname;
	}
	public void setOfficerFname(String officerFname) {
		this.officerFname = officerFname;
	}
	public String getOfficerLname() {
		return officerLname;
	}
	public void setOfficerLname(String officerLname) {
		this.officerLname = officerLname;
	}
	public String getOfficerRole() {
		return officerRole;
	}
	public void setOfficerRole(String officerRole) {
		this.officerRole = officerRole;
	}
	
	
}
