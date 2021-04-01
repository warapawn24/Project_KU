package com.ku.dku.bean;

public class LoginResponse {
	private long studentIdResponse;
	private String studentFnameResponse;
	private String studentLnameResponse;
	private String statusResponse;
	private String fileName;
	private String fileType;
	private String studentPhoneResponse;
	private long studentRoomResponse;
	
	
	public LoginResponse() {
		super();
	}
	public LoginResponse(long studentIdResponse, String studentFnameResponse, String studentLnameResponse,
			String statusResponse, String fileName, String fileType, String studentPhoneResponse,
			long studentRoomResponse) {
		super();
		this.studentIdResponse = studentIdResponse;
		this.studentFnameResponse = studentFnameResponse;
		this.studentLnameResponse = studentLnameResponse;
		this.statusResponse = statusResponse;
		this.fileName = fileName;
		this.fileType = fileType;
		this.studentPhoneResponse = studentPhoneResponse;
		this.studentRoomResponse = studentRoomResponse;
	}
	public long getStudentIdResponse() {
		return studentIdResponse;
	}
	public void setStudentIdResponse(long studentIdResponse) {
		this.studentIdResponse = studentIdResponse;
	}
	public String getStudentFnameResponse() {
		return studentFnameResponse;
	}
	public void setStudentFnameResponse(String studentFnameResponse) {
		this.studentFnameResponse = studentFnameResponse;
	}
	public String getStudentLnameResponse() {
		return studentLnameResponse;
	}
	public void setStudentLnameResponse(String studentLnameResponse) {
		this.studentLnameResponse = studentLnameResponse;
	}
	public String getStatusResponse() {
		return statusResponse;
	}
	public void setStatusResponse(String statusResponse) {
		this.statusResponse = statusResponse;
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
	public String getStudentPhoneResponse() {
		return studentPhoneResponse;
	}
	public void setStudentPhoneResponse(String studentPhoneResponse) {
		this.studentPhoneResponse = studentPhoneResponse;
	}
	public long getStudentRoomResponse() {
		return studentRoomResponse;
	}
	public void setStudentRoomResponse(long studentRoomResponse) {
		this.studentRoomResponse = studentRoomResponse;
	}
	
	
	
	
	
	
	
	
	
	

}
