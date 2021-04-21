package com.ku.dku.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.AdminUpdateUtilityDetailRequest;
import com.ku.dku.bean.AdminUpdateUtilityDetailResponse;
import com.ku.dku.bean.BuildingDataRequest;
import com.ku.dku.bean.BuildingDataResponse;
import com.ku.dku.bean.GetNumberBuildingRequest;
import com.ku.dku.bean.GetNumberBuildingResponse;

import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.MsBuilding;
import com.ku.dku.entity.MsBuildingEight;
import com.ku.dku.entity.MsBuildingFive;
import com.ku.dku.entity.MsBuildingFour;
import com.ku.dku.entity.MsBuildingOne;
import com.ku.dku.entity.MsBuildingSeven;
import com.ku.dku.entity.MsBuildingSix;
import com.ku.dku.entity.MsBuildingThree;
import com.ku.dku.entity.MsBuildingTwo;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.entity.TxUtilityBill;
import com.ku.dku.repository.MsBuildingEightRepository;
import com.ku.dku.repository.MsBuildingFiveRepository;
import com.ku.dku.repository.MsBuildingFourRepository;
import com.ku.dku.repository.MsBuildingOneRepository;
import com.ku.dku.repository.MsBuildingRepository;
import com.ku.dku.repository.MsBuildingSevenRepository;
import com.ku.dku.repository.MsBuildingSixRepository;
import com.ku.dku.repository.MsBuildingThreeRepository;
import com.ku.dku.repository.MsBuildingTwoRepository;
import com.ku.dku.repository.TxStudentRepository;
import com.ku.dku.repository.TxUtilityBillRepository;
import com.ku.dku.service.BuildingService;

@RestController
@RequestMapping(value = "/user/buildiing")
public class BuildingController {
	
	@Autowired private BuildingService buildingService;
	@Autowired private MsBuildingRepository msBuildingRepository;
	
	@Autowired private MsBuildingEightRepository msBuildingEightRepository;
	@Autowired private MsBuildingFiveRepository msBuildingFiveRepository;
	@Autowired private MsBuildingFourRepository msBuildingFourRepository;	
	@Autowired private MsBuildingOneRepository	msBuildingOneRepository;
	@Autowired private MsBuildingSevenRepository msBuildingSevenRepository;
	@Autowired private MsBuildingSixRepository msBuildingSixRepository;
	@Autowired private MsBuildingThreeRepository msBuildingThreeRepository;
	@Autowired private MsBuildingTwoRepository msBuildingTwoRepository;
	

	@RequestMapping(value = "/listBuilding",method = RequestMethod.GET)
	public @ResponseBody Iterable<MsBuilding> getBuilding() {

		return msBuildingRepository.findAll();
	}
	
	//getNumber
	@RequestMapping(value = "/getNumber",method = RequestMethod.POST)
	public @ResponseBody GetNumberBuildingResponse getNumber(@RequestBody GetNumberBuildingRequest request) {
		GetNumberBuildingResponse response = new GetNumberBuildingResponse();
		
		Integer buildingId = (int) request.getBuildingId();
		switch (buildingId) {
		
		 case 1:

			 	MsBuildingOne msBuildingOne = msBuildingOneRepository.findByRoomId(request.getRoomId());
			 	if (msBuildingOne==null) {
			 		response.setNumber(null);
				}else {
					
					response.setNumber(msBuildingOne.getNumber());
				}
			 	
			 	
			    break;
			   
		 case 2:

			 	MsBuildingTwo msBuildingTwo = msBuildingTwoRepository.findByRoomId(request.getRoomId());
			 	if (msBuildingTwo==null) {
			 		response.setNumber(null);
				}else {
					
					response.setNumber(msBuildingTwo.getNumber());
				}
			    break;
		 case 3:

			 	MsBuildingThree msBuildingThree = msBuildingThreeRepository.findByRoomId(request.getRoomId());
				if (msBuildingThree==null) {
			 		response.setNumber(null);
				}else {
					
					response.setNumber(msBuildingThree.getNumber());
				}
			    break;
		 case 4:

			 	MsBuildingFour msBuildingFour = msBuildingFourRepository.findByRoomId(request.getRoomId());
			 	if (msBuildingFour==null) {
			 		response.setNumber(null);
				}else {
					
					response.setNumber(msBuildingFour.getNumber());
				}
			    break;
			    
		 case 5:

			 	MsBuildingFive msBuildingFive = msBuildingFiveRepository.findByRoomId(request.getRoomId());
			 	if (msBuildingFive==null) {
			 		response.setNumber(null);
				}else {
					
					response.setNumber(msBuildingFive.getNumber());
				}
			    break;
			    
		 case 6:

			 	MsBuildingSix msBuildingSix = msBuildingSixRepository.findByRoomId(request.getRoomId());
			 	if (msBuildingSix==null) {
			 		response.setNumber(null);
				}else {
					
					response.setNumber(msBuildingSix.getNumber());
				}
			    break;
			    
		 case 7:

			 	MsBuildingSeven msBuildingSeven = msBuildingSevenRepository.findByRoomId(request.getRoomId());
			 	if (msBuildingSeven==null) {
			 		response.setNumber(null);
				}else {
					
					response.setNumber(msBuildingSeven.getNumber());
				}
			    break;
			    
		 case 8:

			 	MsBuildingEight msBuildingEight = msBuildingEightRepository.findByRoomId(request.getRoomId());
			 	if (msBuildingEight==null) {
			 		response.setNumber(null);
				}else {
					
					response.setNumber(msBuildingEight.getNumber());
				}
			    break;

		}
		
		
		
		return response;
		
		
	}
	
	@Autowired private TxStudentRepository txStudentRepository;

	@Autowired private TxUtilityBillRepository txUtilityBillRepository;
	
	@RequestMapping(value = "/updateDetail")
	public @ResponseBody AdminUpdateUtilityDetailResponse updateDetail(@RequestBody AdminUpdateUtilityDetailRequest request) {
		
		AdminUpdateUtilityDetailResponse response = new AdminUpdateUtilityDetailResponse();
		
		
		
		Date date = new Date();
		
		long officerId = 0;
		
		Iterable<TxStudent> listTxStudent = txStudentRepository.findByStudentRoom(request.getRoomId());
		for (TxStudent txStudent : listTxStudent) {
			TxUtilityBill txUtilityBill = new TxUtilityBill();
			
//			ListAdminUpdateUtilityDetail addData = new ListAdminUpdateUtilityDetail();
			
			txUtilityBill.setStudentId(txStudent.getStudentId());
			txUtilityBill.setStudentFname(txStudent.getStudentFname());
			txUtilityBill.setStudentLname(txStudent.getStudentLname());
			txUtilityBill.setUtilityDate(request.getUtilityDate());
			txUtilityBill.setUtilityStartdate(request.getUtilityStartdate());
			txUtilityBill.setUtilityDuedate(request.getUtilityDuedate());
			txUtilityBill.setRoomId(request.getRoomId());
			txUtilityBill.setUtilityElectricbill(request.getUtilityElectric());
			txUtilityBill.setUtilityWater(request.getUtilityWater());
			txUtilityBill.setUtilityTotal(request.getUtilityTotal());
			txUtilityBill.setOfficerId(officerId);
			txUtilityBill.setUtilityStatus(LookupConstant.UTILITY_STATUS_UNPAID);
			
			txUtilityBillRepository.save(txUtilityBill);
			
			
		}
		
		response.setStatusResponse("success");
		return response;
		
		
	}
	
	
}
