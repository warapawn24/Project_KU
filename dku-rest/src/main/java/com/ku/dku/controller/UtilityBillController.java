package com.ku.dku.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.LastUtilityBillDetailResponse;
import com.ku.dku.bean.ListLastUtilityBillDetailResponse;
import com.ku.dku.bean.ListLastUtilityBillThreeResponse;
import com.ku.dku.bean.UtilityBillRequest;
import com.ku.dku.bean.UtilityBillResponse;
import com.ku.dku.entity.TxUtilityBill;
import com.ku.dku.service.UtilityBillService;

@RestController
@RequestMapping(value = "/user/utilityBill")
public class UtilityBillController {

	@Autowired private UtilityBillService utilityBillService;
	
	@RequestMapping(value = "/utilityData",method = RequestMethod.POST)
	public @ResponseBody UtilityBillResponse utilityData(@RequestBody UtilityBillRequest request) {
		
		UtilityBillResponse response = new UtilityBillResponse();
		
		TxUtilityBill utilityBill = utilityBillService.TopBill(request.getStudentId());
		
		response.setUtilityDatePresent(utilityBill.getUtilityDate());
		response.setUtilityElectricbillPresent(utilityBill.getUtilityElectricbill());
		response.setUtilityWaterPresent(utilityBill.getUtilityWater());
		response.setUtilityFinesPresent(utilityBill.getUtilityFines());
		response.setUtilityTotalPresent(utilityBill.getUtilityTotal());
		response.setUtilityStatusPresent(utilityBill.getUtilityStatus());
		response.setUtilityId(utilityBill.getRecId());
		
		
		//3อันย้อนหลัง
		List<ListLastUtilityBillThreeResponse> utilityRetroact = new ArrayList<ListLastUtilityBillThreeResponse>();
		Iterable<TxUtilityBill> listUtilityBill = utilityBillService.TopThreeBill(request.getStudentId());
		for (TxUtilityBill txUtilityBill : listUtilityBill) {
			ListLastUtilityBillThreeResponse detail = new ListLastUtilityBillThreeResponse();
			
			detail.setUtilityId(txUtilityBill.getRecId());
			detail.setUtilityDateRetroact(txUtilityBill.getUtilityDate());
			detail.setUtilityStatusRetroact(txUtilityBill.getUtilityStatus());
			detail.setUtilityTotalRetroact(txUtilityBill.getUtilityTotal());
			
			utilityRetroact.add(detail);
			response.setUtilityRetroact(utilityRetroact);
			
			
		}
		
		
		
		return response;
	}
	
	
	//หน้าdetail
	@RequestMapping(value = "/utilityRetroactDetail",method = RequestMethod.POST)
	public @ResponseBody LastUtilityBillDetailResponse detail(@RequestBody UtilityBillRequest request) {
		LastUtilityBillDetailResponse response = new LastUtilityBillDetailResponse();
		
		List<ListLastUtilityBillDetailResponse> detail = new ArrayList<ListLastUtilityBillDetailResponse>();
		Iterable<TxUtilityBill> listUtilityBill = utilityBillService.TopThreeBill(request.getStudentId());
		for (TxUtilityBill txUtilityBill : listUtilityBill) {
			ListLastUtilityBillDetailResponse utilityRetroact = new ListLastUtilityBillDetailResponse();
			
			utilityRetroact.setUtilityId(txUtilityBill.getRecId());
			utilityRetroact.setUtilityDateRetroact(txUtilityBill.getUtilityDate());
			utilityRetroact.setUtilityElectricbillRetroact(txUtilityBill.getUtilityElectricbill());
			utilityRetroact.setUtilityWaterRetroact(txUtilityBill.getUtilityWater());
			utilityRetroact.setUtilityFinesRetroact(txUtilityBill.getUtilityFines());
			utilityRetroact.setUtilityTotalRetroact(txUtilityBill.getUtilityTotal());
			utilityRetroact.setUtilityStatusRetroact(txUtilityBill.getUtilityStatus());
			
			detail.add(utilityRetroact);
			response.setDetail(detail);
		}
		
		return response;
		
	}
}
