package com.ku.dku.bean;

import java.util.List;

public class ListGetAllBuildingResponse {
		private List<GetAllBuildingResponse> detail;

		
		
		public ListGetAllBuildingResponse() {
			super();
		}

		public ListGetAllBuildingResponse(List<GetAllBuildingResponse> detail) {
			super();
			this.detail = detail;
		}

		public List<GetAllBuildingResponse> getDetail() {
			return detail;
		}

		public void setDetail(List<GetAllBuildingResponse> detail) {
			this.detail = detail;
		}
		
		
}
