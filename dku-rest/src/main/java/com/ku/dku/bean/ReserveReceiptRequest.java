package com.ku.dku.bean;

public class ReserveReceiptRequest {
	 private long reserveId;

	 
	 
	public ReserveReceiptRequest() {
		super();
	}

	public ReserveReceiptRequest(long reserveId) {
		super();
		this.reserveId = reserveId;
	}

	public long getReserveId() {
		return reserveId;
	}

	public void setReserveId(long reserveId) {
		this.reserveId = reserveId;
	}
	 
	 
}
