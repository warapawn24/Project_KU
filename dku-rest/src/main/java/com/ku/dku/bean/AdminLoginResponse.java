package com.ku.dku.bean;

public class AdminLoginResponse {
	
	private long officerIdResponse;
	private String officerFnameResponse;
	private String officerLnameResponse;
	private String statusResponse;
	private Integer officerLoginfirst;
	private String officerRole;
	
	
	public AdminLoginResponse() {
		super();
	}
	public AdminLoginResponse(long officerIdResponse, String officerFnameResponse, String officerLnameResponse,
			String statusResponse, Integer officerLoginfirst, String officerRole) {
		super();
		this.officerIdResponse = officerIdResponse;
		this.officerFnameResponse = officerFnameResponse;
		this.officerLnameResponse = officerLnameResponse;
		this.statusResponse = statusResponse;
		this.officerLoginfirst = officerLoginfirst;
		this.officerRole = officerRole;
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
	public Integer getOfficerLoginfirst() {
		return officerLoginfirst;
	}
	public void setOfficerLoginfirst(Integer officerLoginfirst) {
		this.officerLoginfirst = officerLoginfirst;
	}
	public String getOfficerRole() {
		return officerRole;
	}
	public void setOfficerRole(String officerRole) {
		this.officerRole = officerRole;
	}
	
	
	
	
}
