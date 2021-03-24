package com.ku.dku.bean;

import java.util.List;

public class UpdateBailRequest {

	private long bailId;
	private String bailPhone;
	private List<ListBailTypeRequest> bailTypeRequest;
	private String baillNote;
	private List<ListBailEquipmentRequest> bailEquipmentRequest;
	private String bailAccouctnum;
	private String bailAccouctnumConfirm;
	private String bailBank;
	private String termName;
	private Integer year;
	
	
	
	public UpdateBailRequest() {
		super();
	}
	public UpdateBailRequest(long bailId, String bailPhone, List<ListBailTypeRequest> bailTypeRequest, String baillNote,
			List<ListBailEquipmentRequest> bailEquipmentRequest, String bailAccouctnum, String bailAccouctnumConfirm,
			String bailBank, String termName, Integer year) {
		super();
		this.bailId = bailId;
		this.bailPhone = bailPhone;
		this.bailTypeRequest = bailTypeRequest;
		this.baillNote = baillNote;
		this.bailEquipmentRequest = bailEquipmentRequest;
		this.bailAccouctnum = bailAccouctnum;
		this.bailAccouctnumConfirm = bailAccouctnumConfirm;
		this.bailBank = bailBank;
		this.termName = termName;
		this.year = year;
	}
	public long getBailId() {
		return bailId;
	}
	public void setBailId(long bailId) {
		this.bailId = bailId;
	}
	public String getBailPhone() {
		return bailPhone;
	}
	public void setBailPhone(String bailPhone) {
		this.bailPhone = bailPhone;
	}
	public List<ListBailTypeRequest> getBailTypeRequest() {
		return bailTypeRequest;
	}
	public void setBailTypeRequest(List<ListBailTypeRequest> bailTypeRequest) {
		this.bailTypeRequest = bailTypeRequest;
	}
	public String getBaillNote() {
		return baillNote;
	}
	public void setBaillNote(String baillNote) {
		this.baillNote = baillNote;
	}
	public List<ListBailEquipmentRequest> getBailEquipmentRequest() {
		return bailEquipmentRequest;
	}
	public void setBailEquipmentRequest(List<ListBailEquipmentRequest> bailEquipmentRequest) {
		this.bailEquipmentRequest = bailEquipmentRequest;
	}
	public String getBailAccouctnum() {
		return bailAccouctnum;
	}
	public void setBailAccouctnum(String bailAccouctnum) {
		this.bailAccouctnum = bailAccouctnum;
	}
	public String getBailAccouctnumConfirm() {
		return bailAccouctnumConfirm;
	}
	public void setBailAccouctnumConfirm(String bailAccouctnumConfirm) {
		this.bailAccouctnumConfirm = bailAccouctnumConfirm;
	}
	public String getBailBank() {
		return bailBank;
	}
	public void setBailBank(String bailBank) {
		this.bailBank = bailBank;
	}
	public String getTermName() {
		return termName;
	}
	public void setTermName(String termName) {
		this.termName = termName;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	
	
}
