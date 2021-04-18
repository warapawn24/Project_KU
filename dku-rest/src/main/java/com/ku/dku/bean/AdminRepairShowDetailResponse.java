package com.ku.dku.bean;

import java.util.Date;

public class AdminRepairShowDetailResponse {

	private long repairId;
	private long studentId;
	private long roomId;
	private Date repairDate;
	private String repairList;
	private String repairStatus;
	
	
	public AdminRepairShowDetailResponse() {
		super();
	}
	public AdminRepairShowDetailResponse(long repairId, long studentId, long roomId, Date repairDate, String repairList,
			String repairStatus) {
		super();
		this.repairId = repairId;
		this.studentId = studentId;
		this.roomId = roomId;
		this.repairDate = repairDate;
		this.repairList = repairList;
		this.repairStatus = repairStatus;
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
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public Date getRepairDate() {
		return repairDate;
	}
	public void setRepairDate(Date repairDate) {
		this.repairDate = repairDate;
	}
	public String getRepairList() {
		return repairList;
	}
	public void setRepairList(String repairList) {
		this.repairList = repairList;
	}
	public String getRepairStatus() {
		return repairStatus;
	}
	public void setRepairStatus(String repairStatus) {
		this.repairStatus = repairStatus;
	}
	
	
}
