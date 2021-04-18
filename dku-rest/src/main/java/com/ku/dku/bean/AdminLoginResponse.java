package com.ku.dku.bean;

public class AdminLoginResponse {
	private long pkIdResponse;
	private long officerIdResponse;
	private String officerFnameResponse;
	private String officerLnameResponse;
	private String statusResponse;
	private String fileName;
	private String fileType;
	
	
	public AdminLoginResponse() {
		super();
	}
	public AdminLoginResponse(long pkIdResponse, long officerIdResponse, String officerFnameResponse,
			String officerLnameResponse, String statusResponse, String fileName, String fileType) {
		super();
		this.pkIdResponse = pkIdResponse;
		this.officerIdResponse = officerIdResponse;
		this.officerFnameResponse = officerFnameResponse;
		this.officerLnameResponse = officerLnameResponse;
		this.statusResponse = statusResponse;
		this.fileName = fileName;
		this.fileType = fileType;
	}
	public long getPkIdResponse() {
		return pkIdResponse;
	}
	public void setPkIdResponse(long pkIdResponse) {
		this.pkIdResponse = pkIdResponse;
	}
	public long getOfficerIdResponse() {
		return officerIdResponse;
	}
	public void setOfficerIdResponse(long officerIdResponse) {
		this.officerIdResponse = officerIdResponse;
	}
	public String getOfficerFnameResponse() {
		return officerFnameResponse;
	}
	public void setOfficerFnameResponse(String officerFnameResponse) {
		this.officerFnameResponse = officerFnameResponse;
	}
	public String getOfficerLnameResponse() {
		return officerLnameResponse;
	}
	public void setOfficerLnameResponse(String officerLnameResponse) {
		this.officerLnameResponse = officerLnameResponse;
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
	
	
	
}
