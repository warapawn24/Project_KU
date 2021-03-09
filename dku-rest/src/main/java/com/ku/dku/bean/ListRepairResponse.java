package com.ku.dku.bean;

import java.util.Date;

public class ListRepairResponse {
	private long roomId;
	private String studentfname;
	private String studentLname;
	private String repairDetail;
	private Date repairDate;
	private Date repairDuedate;
	
	
	public ListRepairResponse() {
		super();
	}
	public ListRepairResponse(long roomId, String studentfname, String studentLname, String repairDetail,
			Date repairDate, Date repairDuedate) {
		super();
		this.roomId = roomId;
		this.studentfname = studentfname;
		this.studentLname = studentLname;
		this.repairDetail = repairDetail;
		this.repairDate = repairDate;
		this.repairDuedate = repairDuedate;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getStudentfname() {
		return studentfname;
	}
	public void setStudentfname(String studentfname) {
		this.studentfname = studentfname;
	}
	public String getStudentLname() {
		return studentLname;
	}
	public void setStudentLname(String studentLname) {
		this.studentLname = studentLname;
	}
	public String getRepairDetail() {
		return repairDetail;
	}
	public void setRepairDetail(String repairDetail) {
		this.repairDetail = repairDetail;
	}
	public Date getRepairDate() {
		return repairDate;
	}
	public void setRepairDate(Date repairDate) {
		this.repairDate = repairDate;
	}
	public Date getRepairDuedate() {
		return repairDuedate;
	}
	public void setRepairDuedate(Date repairDuedate) {
		this.repairDuedate = repairDuedate;
	}
	
	

}
