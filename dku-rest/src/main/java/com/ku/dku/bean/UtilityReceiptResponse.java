package com.ku.dku.bean;

import java.util.Date;

public class UtilityReceiptResponse {

	private int receiptNumber;
	private Date receiptDate;
	private String studentFname;
	private String studentLname;
	private long studentId;
	private long roomId;
	private String utilityDate;
	private float utilityElectric;
	private float utilityWater;
	private float utilityFines;
	private float utilityTotal;
	private String officerFname;
	private String officerLname;
	private String officerRole;
	
	
	public UtilityReceiptResponse() {
		super();
	}
	public UtilityReceiptResponse(int receiptNumber, Date receiptDate, String studentFname, String studentLname,
			long studentId, long roomId, String utilityDate, float utilityElectric, float utilityWater,
			float utilityFines, float utilityTotal, String officerFname, String officerLname, String officerRole) {
		super();
		this.receiptNumber = receiptNumber;
		this.receiptDate = receiptDate;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		this.studentId = studentId;
		this.roomId = roomId;
		this.utilityDate = utilityDate;
		this.utilityElectric = utilityElectric;
		this.utilityWater = utilityWater;
		this.utilityFines = utilityFines;
		this.utilityTotal = utilityTotal;
		this.officerFname = officerFname;
		this.officerLname = officerLname;
		this.officerRole = officerRole;
	}
	public int getReceiptNumber() {
		return receiptNumber;
	}
	public void setReceiptNumber(int receiptNumber) {
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
	public String getUtilityDate() {
		return utilityDate;
	}
	public void setUtilityDate(String utilityDate) {
		this.utilityDate = utilityDate;
	}
	public float getUtilityElectric() {
		return utilityElectric;
	}
	public void setUtilityElectric(float utilityElectric) {
		this.utilityElectric = utilityElectric;
	}
	public float getUtilityWater() {
		return utilityWater;
	}
	public void setUtilityWater(float utilityWater) {
		this.utilityWater = utilityWater;
	}
	public float getUtilityFines() {
		return utilityFines;
	}
	public void setUtilityFines(float utilityFines) {
		this.utilityFines = utilityFines;
	}
	public float getUtilityTotal() {
		return utilityTotal;
	}
	public void setUtilityTotal(float utilityTotal) {
		this.utilityTotal = utilityTotal;
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
