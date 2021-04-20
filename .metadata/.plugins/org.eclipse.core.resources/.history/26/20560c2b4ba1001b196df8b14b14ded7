package com.ku.dku.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.LastUtilityBillDetailResponse;
import com.ku.dku.bean.ListLastUtilityBillDetailResponse;
import com.ku.dku.bean.ListLastUtilityBillThreeResponse;
import com.ku.dku.bean.SearchRequest;
import com.ku.dku.bean.UtilityBillRequest;
import com.ku.dku.bean.UtilityBillResponse;
import com.ku.dku.bean.UtilityReceiptRequest;
import com.ku.dku.bean.UtilityReceiptResponse;
import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.LkRole;
import com.ku.dku.entity.TxOfficer;
import com.ku.dku.entity.TxUtilityBill;
import com.ku.dku.repository.LkRoleRepository;
import com.ku.dku.repository.TxOfficerRepository;
import com.ku.dku.service.UtilityBillService;

@RestController
@RequestMapping(value = "/user/utilityBill")
public class UtilityBillController {

	@Autowired private UtilityBillService utilityBillService;
	@Autowired private TxOfficerRepository txOfficerRepository;
	@Autowired private LkRoleRepository lkRoleRepository;
	
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
	
	//Adminsearch
	@RequestMapping(value = "/adminSearch",method = RequestMethod.POST)
	public @ResponseBody Iterable<TxUtilityBill> adminSearch(@RequestBody SearchRequest request){
		
		Iterable<TxUtilityBill> search = utilityBillService.findByKeyword(request.getKeyword(), LookupConstant.UTILITY_STATUS_PAID, LookupConstant.UTILITY_STATUS_UNPAID);
		
		return search;
	}
	
	//AdminReceipt
	@RequestMapping(value = "/createReceipt",method = RequestMethod.POST)
	public @ResponseBody UtilityReceiptResponse receipt(@RequestBody UtilityReceiptRequest request ,HttpSession session) {
		UtilityReceiptResponse response = new UtilityReceiptResponse();
	
		TxUtilityBill createReceipt = utilityBillService.createReceipt(request.getUtilityId(),(long) session.getAttribute("officerId"));
		if (createReceipt!=null) {
			response.setOfficerFname((String) session.getAttribute("officerFname"));
			response.setOfficerLname((String) session.getAttribute("officerFname"));
			
			TxOfficer txOfficer = txOfficerRepository.findByRecId(createReceipt.getOfficerId());
			LkRole lkRole = lkRoleRepository.findByRecId(txOfficer.getOfficerRoleId());
			response.setOfficerRole(lkRole.getRoleName());
			
			response.setReceiptNumber(createReceipt.getReceiptNumber());
			response.setReceiptDate(createReceipt.getReceiptDate());
			response.setRoomId(createReceipt.getRoomId());
			response.setStudentFname(createReceipt.getStudentFname());
			response.setStudentId(createReceipt.getStudentId());
			response.setStudentLname(createReceipt.getStudentLname());
			response.setUtilityDate(createReceipt.getUtilityDate());
			response.setUtilityElectric(createReceipt.getUtilityElectricbill());
			response.setUtilityFines(createReceipt.getUtilityFines());
			response.setUtilityTotal(createReceipt.getUtilityTotal());
			response.setUtilityWater(createReceipt.getUtilityWater());
		}
		
		return response;
	}
}
