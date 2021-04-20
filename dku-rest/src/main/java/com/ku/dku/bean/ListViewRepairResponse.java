package com.ku.dku.bean;

import java.util.List;

public class ListViewRepairResponse {

	private List<ViewRepairStatusWaitResponse> wait;
	private List<ViewRepairStatusDoneResponse> done;
	
	
	public ListViewRepairResponse() {
		super();
	}
	public ListViewRepairResponse(List<ViewRepairStatusWaitResponse> wait, List<ViewRepairStatusDoneResponse> done) {
		super();
		this.wait = wait;
		this.done = done;
	}
	public List<ViewRepairStatusWaitResponse> getWait() {
		return wait;
	}
	public void setWait(List<ViewRepairStatusWaitResponse> wait) {
		this.wait = wait;
	}
	public List<ViewRepairStatusDoneResponse> getDone() {
		return done;
	}
	public void setDone(List<ViewRepairStatusDoneResponse> done) {
		this.done = done;
	}

	
	
}
