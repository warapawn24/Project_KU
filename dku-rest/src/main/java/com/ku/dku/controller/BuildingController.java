package com.ku.dku.controller;

import java.io.IOException;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ku.dku.bean.AdminUpdatePhotoRequest;
import com.ku.dku.bean.AdminUpdateRelationResponse;
import com.ku.dku.bean.AdminUpdateUtilityDetailRequest;
import com.ku.dku.bean.AdminUpdateUtilityDetailResponse;
import com.ku.dku.bean.BuildingDataRequest;
import com.ku.dku.bean.BuildingDataResponse;
import com.ku.dku.bean.GetAllBuildingResponse;
import com.ku.dku.bean.GetNumberBuildingRequest;
import com.ku.dku.bean.GetNumberBuildingResponse;
import com.ku.dku.bean.ListAdminUpdatePhotoRequest;
import com.ku.dku.bean.ListBuildingDataResponse;
import com.ku.dku.bean.ListGetAllBuildingResponse;
import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.LkBuilding;
import com.ku.dku.entity.MsBuilding;
import com.ku.dku.entity.MsBuildingEight;
import com.ku.dku.entity.MsBuildingFive;
import com.ku.dku.entity.MsBuildingFour;
import com.ku.dku.entity.MsBuildingOne;
import com.ku.dku.entity.MsBuildingSeven;
import com.ku.dku.entity.MsBuildingSix;
import com.ku.dku.entity.MsBuildingThree;
import com.ku.dku.entity.MsBuildingTwo;
import com.ku.dku.entity.MsFileOther;
import com.ku.dku.entity.MsPublicRelation;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.entity.TxUtilityBill;
import com.ku.dku.repository.LkBuildingRepository;
import com.ku.dku.repository.MsBuildingEightRepository;
import com.ku.dku.repository.MsBuildingFiveRepository;
import com.ku.dku.repository.MsBuildingFourRepository;
import com.ku.dku.repository.MsBuildingOneRepository;
import com.ku.dku.repository.MsBuildingRepository;
import com.ku.dku.repository.MsBuildingSevenRepository;
import com.ku.dku.repository.MsBuildingSixRepository;
import com.ku.dku.repository.MsBuildingThreeRepository;
import com.ku.dku.repository.MsBuildingTwoRepository;
import com.ku.dku.repository.MsFileOtherRepository;
import com.ku.dku.repository.TxStudentRepository;
import com.ku.dku.repository.TxUtilityBillRepository;
import com.ku.dku.service.BuildingService;
import com.ku.dku.service.FileService;

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
	
	@Autowired private FileService fileService;
	@Autowired private MsFileOtherRepository msFileOtherRepository;
	@Autowired private LkBuildingRepository lkBuildingRepository;

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
	
	//เพิ่มค่าน้ำค่าไฟ
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
	
	
	//เพิ่มรูปยังไม่เสร็จ
	@RequestMapping(value = "/updatePhoto",method = RequestMethod.POST)
	public @ResponseBody AdminUpdateRelationResponse update(@RequestParam("upload")List<AdminUpdatePhotoRequest> upload,@RequestParam("file") MultipartFile file) throws IOException {
		AdminUpdateRelationResponse response = new AdminUpdateRelationResponse();
		
		String message = "";

		

		MsFileOther fileOther = fileService.storeOther(file);
				if (fileOther!=null) {
					
					List<AdminUpdatePhotoRequest> listUpload = upload;
					for (int i = 0; i < listUpload.size(); i++) {
						AdminUpdatePhotoRequest upRequest = listUpload.get(i);
						
						LkBuilding building = lkBuildingRepository.findByBuildingId(upRequest.getBuildingId());
						building.setFileId(fileOther.getRecId());
						
					}
					
					message = "Uploaded the file successfully: " + file.getOriginalFilename();												
					
						response.setStatusResponse(message);
					}else {
						
						response.setStatusResponse(LookupConstant.RESPONSE_STATUS_FAILED);
					}

	
				return response;
		
	}
	
	
	
	//ข้อมูลตึก
		@RequestMapping(value = "/buildingData",method = RequestMethod.POST)
		public @ResponseBody ListBuildingDataResponse buildingData(@RequestBody BuildingDataRequest request) {
			ListBuildingDataResponse response = new ListBuildingDataResponse();
			
			List<BuildingDataResponse> listRoom = new ArrayList<BuildingDataResponse>();
			
			Integer buildingId = (int) request.getBuildingId();
			switch (buildingId) {
			
			 case 1:

				 	Iterable<MsBuildingOne> listBuildingOne = msBuildingOneRepository.findByFloorId(request.getFloorId());
				 	
				 	for (MsBuildingOne msBuildingOne : listBuildingOne) {
						
				 	BuildingDataResponse data = new BuildingDataResponse();
				 		
						data.setRecId(msBuildingOne.getRecId());
				 		data.setRoomId(msBuildingOne.getRoomId());

				 		//หาว่างกี่ที่
				 		int availability = msBuildingOne.getBuildingTotal()-msBuildingOne.getNumber();
				 		data.setAvailability(availability);
				 		
				 		listRoom.add(data);
				 		response.setListRoom(listRoom);
				 		response.setRoomFloor(request.getFloorId());
					}
				 	  break;
				   
			 case 2:

				 Iterable<MsBuildingTwo> listBuildingTwo = msBuildingTwoRepository.findByFloorId(request.getFloorId());
				 	
				 	for (MsBuildingTwo msBuildingTwo : listBuildingTwo) {
						
				 	BuildingDataResponse data = new BuildingDataResponse();
				 		
						data.setRecId(msBuildingTwo.getRecId());
				 		data.setRoomId(msBuildingTwo.getRoomId());
				 		//หาว่างกี่ที่
				 		int availability = msBuildingTwo.getBuildingTotal()-msBuildingTwo.getNumber();
				 		data.setAvailability(availability);
				 		listRoom.add(data);
				 		response.setListRoom(listRoom);
				 		response.setRoomFloor(request.getFloorId());
					}
				 	  break;
			 case 3:

				 	Iterable<MsBuildingThree> listBuildingThree = msBuildingThreeRepository.findByFloorId(request.getFloorId());
				 	for (MsBuildingThree msBuildingThree : listBuildingThree) {
				 		BuildingDataResponse data = new BuildingDataResponse();
				 		data.setRecId(msBuildingThree.getRecId());
				 		data.setRoomId(msBuildingThree.getRoomId());
				 		//หาว่างกี่ที่
				 		int availability = msBuildingThree.getBuildingTotal()-msBuildingThree.getNumber();
				 		data.setAvailability(availability);
				 		
				 		listRoom.add(data);
				 		response.setListRoom(listRoom);
				 		response.setRoomFloor(request.getFloorId());
					}
					
				    break;
			 case 4:

				 	Iterable<MsBuildingFour> msBuildingFour = msBuildingFourRepository.findByFloorId(request.getFloorId());
				 	for (MsBuildingFour msBuildingFour2 : msBuildingFour) {
						
				 		BuildingDataResponse data = new BuildingDataResponse();
				 		data.setRecId(msBuildingFour2.getRecId());
				 		data.setRoomId(msBuildingFour2.getRoomId());
				 		//หาว่างกี่ที่
				 		int availability = msBuildingFour2.getBuildingTotal()-msBuildingFour2.getNumber();
				 		data.setAvailability(availability);
				 		
				 		listRoom.add(data);
				 		response.setListRoom(listRoom);
				 		response.setRoomFloor(request.getFloorId());
					}
				 	
				    break;
				    
			 case 5:

				 	Iterable<MsBuildingFive> listBuildingFive = msBuildingFiveRepository.findByFloorId(request.getFloorId());
				 	for (MsBuildingFive msBuildingFive2 : listBuildingFive) {
						
				 		BuildingDataResponse data = new BuildingDataResponse();
				 		data.setRecId(msBuildingFive2.getRecId());
				 		data.setRoomId(msBuildingFive2.getRoomId());
				 		//หาว่างกี่ที่
				 		int availability = msBuildingFive2.getBuildingTotal()-msBuildingFive2.getNumber();
				 		data.setAvailability(availability);
				 		
				 		listRoom.add(data);
				 		response.setListRoom(listRoom);
				 		response.setRoomFloor(request.getFloorId());
					}
				 	
				    break;
				    
			 case 6:

				 	Iterable<MsBuildingSix> listBuildingSix = msBuildingSixRepository.findByFloorId(request.getFloorId());
				 	for (MsBuildingSix msBuildingSix : listBuildingSix) {
						
				 		BuildingDataResponse data = new BuildingDataResponse();
				 		data.setRecId(msBuildingSix.getRecId());
				 		data.setRoomId(msBuildingSix.getRoomId());
				 		//หาว่างกี่ที่
				 		int availability = msBuildingSix.getBuildingTotal()-msBuildingSix.getNumber();
				 		data.setAvailability(availability);
				 		listRoom.add(data);
				 		response.setListRoom(listRoom);
				 		response.setRoomFloor(request.getFloorId());
					}
				    break;
				    
			 case 7:

				 	Iterable<MsBuildingSeven> listBuildingSeven = msBuildingSevenRepository.findByFloorId(request.getFloorId());
				 	for (MsBuildingSeven msBuildingSeven : listBuildingSeven) {
						
				 		BuildingDataResponse data = new BuildingDataResponse();
				 		data.setRecId(msBuildingSeven.getRecId());
				 		data.setRoomId(msBuildingSeven.getRoomId());
				 		//หาว่างกี่ที่
				 		int availability = msBuildingSeven.getBuildingTotal()-msBuildingSeven.getNumber();
				 		data.setAvailability(availability);
				 		
				 		listRoom.add(data);
				 		response.setListRoom(listRoom);
				 		response.setRoomFloor(request.getFloorId());
					}
				    break;
				    
			 case 8:

				 	Iterable<MsBuildingEight> msBuildingEight = msBuildingEightRepository.findByFloorId(request.getFloorId());
				 	for (MsBuildingEight msBuildingEight2 : msBuildingEight) {
				 		BuildingDataResponse data = new BuildingDataResponse();
				 		data.setRecId(msBuildingEight2.getRecId());
				 		data.setRoomId(msBuildingEight2.getRoomId());
				 		//หาว่างกี่ที่
				 		int availability = msBuildingEight2.getBuildingTotal()-msBuildingEight2.getNumber();
				 		data.setAvailability(availability);
				 		
				 		listRoom.add(data);
				 		response.setListRoom(listRoom);
				 		response.setRoomFloor(request.getFloorId());
					}
				 
				    break;

			}
			
			
			
			return response;
			
			
		}
		
		
	@RequestMapping(value = "/getAllBuilding",method = RequestMethod.GET)
	public @ResponseBody ListGetAllBuildingResponse getAll() {
		
		
		ListGetAllBuildingResponse response = new ListGetAllBuildingResponse();
		List<GetAllBuildingResponse> detail = new ArrayList<GetAllBuildingResponse>();
		Iterable<LkBuilding> building = lkBuildingRepository.findAll();
		for (LkBuilding lkBuilding : building) {
			
			GetAllBuildingResponse data = new GetAllBuildingResponse();
			data.setBuildingId(lkBuilding.getRecId());
			data.setBuildingName(lkBuilding.getBuildingName());
			
			detail.add(data);
			response.setDetail(detail);
		}
		return response;
	}
	
}
