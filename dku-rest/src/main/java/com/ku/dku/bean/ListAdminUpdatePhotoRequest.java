package com.ku.dku.bean;

import java.util.List;

public class ListAdminUpdatePhotoRequest {

	private List<AdminUpdatePhotoRequest> upload;

	
	public ListAdminUpdatePhotoRequest() {
		super();
	}

	public ListAdminUpdatePhotoRequest(List<AdminUpdatePhotoRequest> upload) {
		super();
		this.upload = upload;
	}

	public List<AdminUpdatePhotoRequest> getUpload() {
		return upload;
	}

	public void setUpload(List<AdminUpdatePhotoRequest> upload) {
		this.upload = upload;
	}
	
	
}
