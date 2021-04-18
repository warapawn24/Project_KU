package com.ku.dku.bean;

public class ChangePasswordRequest {
	private long officerId;
	private String newPassword;
	private String oldPassword;
	
	
	public ChangePasswordRequest() {
		super();
	}
	public ChangePasswordRequest(long officerId, String newPassword, String oldPassword) {
		super();
		this.officerId = officerId;
		this.newPassword = newPassword;
		this.oldPassword = oldPassword;
	}
	public long getOfficerId() {
		return officerId;
	}
	public void setOfficerId(long officerId) {
		this.officerId = officerId;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getOldPassword() {
		return oldPassword;
	}
	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}
	
	
}
