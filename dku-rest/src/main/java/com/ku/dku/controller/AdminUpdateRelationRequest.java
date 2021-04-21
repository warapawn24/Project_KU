package com.ku.dku.controller;

public class AdminUpdateRelationRequest {

	private String relationName;
	private String description;
	
	
	public AdminUpdateRelationRequest() {
		super();
	}
	public AdminUpdateRelationRequest(String relationName, String description) {
		super();
		this.relationName = relationName;
		this.description = description;
	}
	public String getRelationName() {
		return relationName;
	}
	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
