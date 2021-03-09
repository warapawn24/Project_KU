package com.ku.dku.bean;

import java.util.Date;

public class RepairRequest {

	private long roomId;
	private long studentId;
	private String studentFname;
	private String studentLname;
	private Date repairDate;
	private String repairPhone;
	private String repairList;
	
	
	public RepairRequest() {
		super();
	}
	public RepairRequest(long roomId, long studentId, String studentFname, String studentLname, Date repairDate,
			String repairPhone, String repairList) {
		super();
		this.roomId = roomId;
		this.studentId = studentId;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		this.repairDate = repairDate;
		this.repairPhone = repairPhone;
		this.repairList = repairList;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
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
	public Date getRepairDate() {
		return repairDate;
	}
	public void setRepairDate(Date repairDate) {
		this.repairDate = repairDate;
	}
	public String getRepairPhone() {
		return repairPhone;
	}
	public void setRepairPhone(String repairPhone) {
		this.repairPhone = repairPhone;
	}
	public String getRepairList() {
		return repairList;
	}
	public void setRepairList(String repairList) {
		this.repairList = repairList;
	}
	
	
	
	
	
}
