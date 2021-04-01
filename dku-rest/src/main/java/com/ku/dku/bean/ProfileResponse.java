package com.ku.dku.bean;

import java.util.Date;

public class ProfileResponse {
	private String studentFname;
	private String studentLname;
	private long studentId;
	private long recId;
	private String studentFaculty;
	private long studentRoom;
	private String studentBranch;
	private Date loginDate;
	private String fileName;
	private String fileType;
	
	
	public ProfileResponse() {
		super();
	}
	public ProfileResponse(String studentFname, String studentLname, long studentId, long recId, String studentFaculty,
			long studentRoom, String studentBranch, Date loginDate, String fileName, String fileType) {
		super();
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		this.studentId = studentId;
		this.recId = recId;
		this.studentFaculty = studentFaculty;
		this.studentRoom = studentRoom;
		this.studentBranch = studentBranch;
		this.loginDate = loginDate;
		this.fileName = fileName;
		this.fileType = fileType;
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
	public long getRecId() {
		return recId;
	}
	public void setRecId(long recId) {
		this.recId = recId;
	}
	public String getStudentFaculty() {
		return studentFaculty;
	}
	public void setStudentFaculty(String studentFaculty) {
		this.studentFaculty = studentFaculty;
	}
	public long getStudentRoom() {
		return studentRoom;
	}
	public void setStudentRoom(long studentRoom) {
		this.studentRoom = studentRoom;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	
	
	
	
	

	
	
	
	
} 
