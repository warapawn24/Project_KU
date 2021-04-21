package com.ku.dku.bean;

import org.springframework.http.ResponseEntity;

public class RelationViewResponse {

	private long relationId;
	private String relationName;
	private String description;
	private long fileId;
	
	
	public RelationViewResponse() {
		super();
	}
	public RelationViewResponse(long relationId, String relationName, String description, long fileId) {
		super();
		this.relationId = relationId;
		this.relationName = relationName;
		this.description = description;
		this.fileId = fileId;
	}
	public long getRelationId() {
		return relationId;
	}
	public void setRelationId(long relationId) {
		this.relationId = relationId;
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
	public long getFileId() {
		return fileId;
	}
	public void setFileId(long fileId) {
		this.fileId = fileId;
	}
	
	
	
	
	
	
	
}
