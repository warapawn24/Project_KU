package com.ku.dku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.CreateBailResponse;
import com.ku.dku.bean.CreatebailRequest;
import com.ku.dku.bean.ListBailEquipmentRequest;
import com.ku.dku.bean.ListBailTypeRequest;
import com.ku.dku.bean.UpdateBailRequest;
import com.ku.dku.bean.UpdateBailResponse;
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
	
	@RequestMapping(value = "/createBail",method = RequestMethod.POST)
	public @ResponseBody CreateBailResponse createBail(@RequestBody CreatebailRequest request) {
		CreateBailResponse response = new CreateBailResponse();
		
		long termId = request.getTermId();
		Integer year = request.getYear();
		long studentId = request.getStudentId();
		
		boolean create = bilService.createBail(termId,year,studentId);
		
		if (create) {
			TxBail bail = txBailRepository.findByStudentId(studentId);
			
			LkTerm term = lkTermRepository.findByTermId(termId);
			response.setBailId(bail.getRecId());
			response.setBailDate(bail.getBailDate());
			response.setRoomId(bail.getRoomId());
			response.setStudenId(bail.getStudentId());
			response.setStudentFname(bail.getStudentFname());
			response.setStudentLname(bail.getStudentLname());
			response.setTermName(term.getTermName());
			response.setYear(bail.getYear());
			response.setStatusResponse("success");
		}else {
			response.setStatusResponse("failed");
		}
		
		return response;
		
	}
	
	@RequestMapping(value = "/updateBailData",method = RequestMethod.POST)
	public @ResponseBody UpdateBailResponse updateBail(@RequestBody UpdateBailRequest request) {
		UpdateBailResponse response = new UpdateBailResponse();
		
		TxBail txBail = new TxBail();
		txBail.setRecId(request.getBailId());
		txBail.setBailPhone(request.getBailPhone());
		txBail.setBaillNote(request.getBaillNote());
		txBail.setBailAccouctnum(request.getBailAccouctnum());
		txBail.setBailBank(request.getBailBank());
		
		//forData
		
		List<ListBailTypeRequest> bailTypeRequest =request.getBailTypeRequest();
		
		List<ListBailEquipmentRequest> bailEquipmentRequest =request.getBailEquipmentRequest();
		
		boolean updateData = bilService.updateBailData(txBail, bailTypeRequest, bailEquipmentRequest);
		
		if (updateData) {
			response.setStatusResponse("success");
		}
		else {
			response.setStatusResponse("failed");
		}
		
		return response;
		
		
	}
	
}
