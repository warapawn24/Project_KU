package com.ku.dku.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.BailAmountResponse;
import com.ku.dku.bean.CheckStatusRequest;
import com.ku.dku.bean.CheckStatusResponse;
import com.ku.dku.bean.CreateBailResponse;
import com.ku.dku.bean.CreatebailRequest;
import com.ku.dku.bean.DetailBailStatusRequest;
import com.ku.dku.bean.DetailBailStatusResponse;
import com.ku.dku.bean.ListBailEquipmentRequest;
import com.ku.dku.bean.ListBailTotalResponse;
import com.ku.dku.bean.ListBailTypeRequest;
import com.ku.dku.bean.UpdateBailRequest;
import com.ku.dku.bean.UpdateBailResponse;
import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.LkTerm;
import com.ku.dku.entity.TxBail;
import com.ku.dku.repository.LkTermRepository;
import com.ku.dku.repository.TxBailRepository;
import com.ku.dku.service.BailService;

@RestController
@RequestMapping(value = "/user/bail")
public class BailController {

	@Autowired private BailService bilService;
	@Autowired private TxBailRepository txBailRepository;
	@Autowired private LkTermRepository lkTermRepository;
	
	@GetMapping(value = "/getTermsData")
	public @ResponseBody Iterable<LkTerm> getTermsData(){
		
		Iterable<LkTerm> getData = bilService.getListTerm();
		return getData;
		
	}
	
	//สร้างใบ
	@RequestMapping(value = "/createBail",method = RequestMethod.POST)
	public @ResponseBody CreateBailResponse createBail(@RequestBody CreatebailRequest request) {
		CreateBailResponse response = new CreateBailResponse();
		
		
		long studentId = request.getStudentId();
		
		boolean create = bilService.createBail(studentId);
		
		TxBail bail = txBailRepository.findByStudentId(studentId);
		
	if (bail.getStudentId() == studentId) {
		
		if (create) {
			response.setBailId(bail.getRecId());
			response.setBailDate(bail.getBailDate());
			response.setRoomId(bail.getRoomId());
			response.setStudenId(bail.getStudentId());
			response.setStudentFname(bail.getStudentFname());
			response.setStudentLname(bail.getStudentLname());
			response.setBailStatus(bail.getBailStatus());
			
			response.setStatusResponse("success");
		}else {
			response.setStatusResponse("failed");
		}
	}
	
	
		

	
		
		return response;
		
	}
	
	//กรอกและบันทึกข้อมูล
	@RequestMapping(value = "/updateBailData",method = RequestMethod.POST)
	public @ResponseBody UpdateBailResponse updateBail(@RequestBody UpdateBailRequest request) {
		UpdateBailResponse response = new UpdateBailResponse();
		
		TxBail txBail = new TxBail();
		txBail.setRecId(request.getBailId());
		txBail.setBailPhone(request.getBailPhone());
		txBail.setBaillNote(request.getBaillNote());
		txBail.setBailAccouctnum(request.getBailAccouctnum());
		txBail.setBailBank(request.getBailBank());
		txBail.setTermName(request.getTermName());
		txBail.setYear(request.getYear());
		
		//forData
		
		List<ListBailTypeRequest> bailTypeRequest =request.getBailTypeRequest();
		
		List<ListBailEquipmentRequest> bailEquipmentRequest =request.getBailEquipmentRequest();
		
		boolean updateData = bilService.updateBailData(txBail, bailTypeRequest, bailEquipmentRequest);
	if (request.getBailAccouctnum().equals(request.getBailAccouctnumConfirm())) {
		
		if (updateData) {
			response.setStatusResponse("success");
		}
		else {
			response.setStatusResponse("failed");
		}
		
	}else {
		response.setStatusResponse("Accouctnum Not Match");
	}
		return response;
		
		
}	
	
	//เช็คสถานะ
	@RequestMapping(value = "/checkStatus",method = RequestMethod.POST)
	public @ResponseBody CheckStatusResponse checkStatus(@RequestBody CheckStatusRequest request) {
		
		CheckStatusResponse response = new CheckStatusResponse();
		
		TxBail txBail = txBailRepository.findByStudentId(request.getStudentId());
		
		if (txBail == null) {
			response.setStatusResponse(LookupConstant.BAIL_STATUS_NOTALREADY);
		}else {
			response.setStatusResponse(LookupConstant.BAIL_STATUS_ALREADYDONE);
		}
		
		
		return response;
		
	}
	
	@RequestMapping(value = "/detailBailStatus",method = RequestMethod.POST)
	public @ResponseBody DetailBailStatusResponse detailBailStatus(@RequestBody DetailBailStatusRequest request) {
		
		DetailBailStatusResponse response = new DetailBailStatusResponse();
		
		TxBail txBail = txBailRepository.findByStudentId(request.getStudentId());
		
		//รอดำเนินการ
		if (txBail.getBailStatus().equals(LookupConstant.BAIL_STATUS_WAITING)) {
			response.setBailDate(txBail.getBailDate());
			response.setBailStatus(txBail.getBailStatus());
		}
		
		//ไม่อนุมัติ
		if (txBail.getBailStatus().equals(LookupConstant.BAIL_STATUS_NOTAPPROVED)) {
			response.setBailDate(txBail.getBailDate());
			response.setBailStatus(txBail.getBailStatus());
			response.setBailNotation(txBail.getBailNotation());
		}
		
		//อนุมัติ
		List<BailAmountResponse> listBailTotal = new ArrayList<BailAmountResponse>();
		if (txBail.getBailStatus().equals(LookupConstant.BAIL_STATUS_APPROVE)) {
			BailAmountResponse bailAmount = new BailAmountResponse();
			List<ListBailTotalResponse> detail = new ArrayList<ListBailTotalResponse>();
		
			ListBailTotalResponse bailTotal = new ListBailTotalResponse();
			
			response.setBailDate(txBail.getBailDate());
			response.setBailStatus(txBail.getBailStatus());
			bailTotal.setBailWater(txBail.getBailWater());
			bailTotal.setBailElectricbill(txBail.getBailElectricbill());
			bailTotal.setBailOther(txBail.getBailOther());
			
			detail.add(bailTotal);
			//Listใหญ่
			bailAmount.setBailAmount(txBail.getBailTotal());
			bailAmount.setDetail(detail);
			
			listBailTotal.add(bailAmount);
			response.setBailTotal(listBailTotal);
			
		}
		
		return response;
		
	}
	
	
	
}
