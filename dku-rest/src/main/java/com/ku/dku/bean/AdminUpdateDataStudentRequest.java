package com.ku.dku.bean;

import java.util.Date;

public class AdminUpdateDataStudentRequest {

	private String studentUsername;
	private String studentPassword;
	private String studentFname;
	private String studentLname;
	private String studentEmail;
	private String studentFaculty;
	private long roomId;
	private long studentFail;
	private String studentLogindate;
	private long studentId;
	private String facultyCode;
	private String studentBranch;
	private String studentStatus;
	
	
	public AdminUpdateDataStudentRequest() {
		super();
	}
	public AdminUpdateDataStudentRequest(String studentUsername, String studentPassword, String studentFname,
			String studentLname, String studentEmail, String studentFaculty, long roomId, long studentFail,
			String studentLogindate, long studentId, String facultyCode, String studentBranch, String studentStatus) {
		super();
		this.studentUsername = studentUsername;
		this.studentPassword = studentPassword;
		this.studentFname = studentFname;
		this.studentLname = studentLname;
		this.studentEmail = studentEmail;
		this.studentFaculty = studentFaculty;
		this.roomId = roomId;
		this.studentFail = studentFail;
		this.studentLogindate = studentLogindate;
		this.studentId = studentId;
		this.facultyCode = facultyCode;
		this.studentBranch = studentBranch;
		this.studentStatus = studentStatus;
	}
	public String getStudentUsername() {
		return studentUsername;
	}
	public void setStudentUsername(String studentUsername) {
		this.studentUsername = studentUsername;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
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
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentFaculty() {
		return studentFaculty;
	}
	public void setStudentFaculty(String studentFaculty) {
		this.studentFaculty = studentFaculty;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public long getStudentFail() {
		return studentFail;
	}
	public void setStudentFail(long studentFail) {
		this.studentFail = studentFail;
	}
	public String getStudentLogindate() {
		return studentLogindate;
	}
	public void setStudentLogindate(String studentLogindate) {
		this.studentLogindate = studentLogindate;
	}
	public long getStudentId() {
		return studentId;
	}
	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}
	public String getFacultyCode() {
		return facultyCode;
	}
	public void setFacultyCode(String facultyCode) {
		this.facultyCode = facultyCode;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public String getStudentStatus() {
		return studentStatus;
	}
	public void setStudentStatus(String studentStatus) {
		this.studentStatus = studentStatus;
	}
	
	
	
	
}
