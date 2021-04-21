package com.ku.dku.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.AdminViewReserveRequest;
import com.ku.dku.bean.AdminViewReserveResponse;
import com.ku.dku.bean.BookRoomDataRequest;
import com.ku.dku.bean.BookRoomDataResponse;
import com.ku.dku.bean.BookRoomRequest;
import com.ku.dku.bean.BookRoomResponse;
import com.ku.dku.bean.CheckStatusResponse;
import com.ku.dku.bean.CheckStatusStudentRequest;
import com.ku.dku.bean.ListAdminViewReserveResponse;
import com.ku.dku.bean.ListBuildingDataResponse;
import com.ku.dku.bean.ListFloorByBuildingResponse;
import com.ku.dku.bean.ReserveReceiptRequest;
import com.ku.dku.bean.ReserveReceiptResponse;
import com.ku.dku.bean.RoomDataRequest;
import com.ku.dku.bean.RoomDataResponse;
import com.ku.dku.bean.SetDateBookRoomRequest;
import com.ku.dku.bean.SetDateBookRoomResponse;
import com.ku.dku.bean.ViewDataReserve;
import com.ku.dku.bean.checkStatusStudentResponse;
import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.LkBuilding;
import com.ku.dku.entity.LkRole;
import com.ku.dku.entity.LkTerm;
import com.ku.dku.entity.LkType;
import com.ku.dku.entity.MsBuilding;
import com.ku.dku.entity.MsBuildingEight;
import com.ku.dku.entity.MsBuildingFive;
import com.ku.dku.entity.MsBuildingFour;
import com.ku.dku.entity.MsBuildingOne;
import com.ku.dku.entity.MsBuildingSeven;
import com.ku.dku.entity.MsBuildingSix;
import com.ku.dku.entity.MsBuildingThree;
import com.ku.dku.entity.MsBuildingTwo;
import com.ku.dku.entity.MsFee;
import com.ku.dku.entity.TxOfficer;
import com.ku.dku.entity.TxReserve;
import com.ku.dku.entity.TxSetDate;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.LkBuildingRepository;
import com.ku.dku.repository.LkRoleRepository;
import com.ku.dku.repository.LkTermRepository;
import com.ku.dku.repository.LkTypeRepository;
import com.ku.dku.repository.MsBuildingEightRepository;
import com.ku.dku.repository.MsBuildingFiveRepository;
import com.ku.dku.repository.MsBuildingFourRepository;
import com.ku.dku.repository.MsBuildingOneRepository;
import com.ku.dku.repository.MsBuildingRepository;
import com.ku.dku.repository.MsBuildingSevenRepository;
import com.ku.dku.repository.MsBuildingSixRepository;
import com.ku.dku.repository.MsBuildingThreeRepository;
import com.ku.dku.repository.MsBuildingTwoRepository;
import com.ku.dku.repository.MsFeeRepository;
import com.ku.dku.repository.TxOfficerRepository;
import com.ku.dku.repository.TxReserveRepository;
import com.ku.dku.repository.TxSetDateRepository;
import com.ku.dku.service.BookRooomService;
import com.ku.dku.service.BuildingService;

@RestController
@RequestMapping(value = "/user/bookRoom")
public class BookRoomController {

	@Autowired private BookRooomService bookRooomService;
	@Autowired private BuildingService buildingService;
	@Autowired private MsBuildingRepository msBuildingRepository;
	@Autowired private LkTermRepository lkTermRepository;
	@Autowired private TxReserveRepository txReserveRepository;
	@Autowired private TxOfficerRepository txOfficerRepository;
	@Autowired private LkRoleRepository lkRoleRepository;
	@Autowired private MsFeeRepository msFeeRepository;
	@Autowired private LkTypeRepository lkTypeRepository;
	@Autowired private TxSetDateRepository txSetDateRepository;
	
	@Autowired private MsBuildingEightRepository msBuildingEightRepository;
	@Autowired private MsBuildingFiveRepository msBuildingFiveRepository;
	@Autowired private MsBuildingFourRepository msBuildingFourRepository;	
	@Autowired private MsBuildingOneRepository	msBuildingOneRepository;
	@Autowired private MsBuildingSevenRepository msBuildingSevenRepository;
	@Autowired private MsBuildingSixRepository msBuildingSixRepository;
	@Autowired private MsBuildingThreeRepository msBuildingThreeRepository;
	@Autowired private MsBuildingTwoRepository msBuildingTwoRepository;
	
	@Autowired private LkBuildingRepository lkBuildingRepository;
	
	
	

	//ข้อมูลของแต่ละห้อง
	@RequestMapping(value = "/viewStudentReserve")
	public @ResponseBody BookRoomDataResponse view(@RequestBody BookRoomDataRequest request) {
		BookRoomDataResponse response = new BookRoomDataResponse();
		
		List<ViewDataReserve> detailStudent = new ArrayList<ViewDataReserve>();
		
		Integer buildingId = (int) request.getBuildingId();
		switch (buildingId) {
		
		 case 1:

			 	MsBuildingOne msBuildingOne = msBuildingOneRepository.findByRoomId(request.getRoomId());
			 	
			 	TxSetDate setDate = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 	
			 	long termId = setDate.getTermId();
		 		
		 		MsFee fee = msFeeRepository.findByTermIdANDTypeId(termId, msBuildingOne.getTypeId());
		 		
		 		response.setPrice(fee.getFeePrice());
		 		response.setFloor(msBuildingOne.getFloorId());
		 		response.setRoomId(msBuildingOne.getRoomId());
		 		response.setTotalPeople(msBuildingOne.getBuildingTotal());
		 		
		 		//ชื่อตึก
		 		LkBuilding building = lkBuildingRepository.findByBuildingId(buildingId);
		 		response.setBuildingName(building.getBuildingName());
		 		
		 		LkType type = lkTypeRepository.findByRecId(msBuildingOne.getTypeId());
		 		response.setTypeName(type.getTypeName());
		 		//ข้อมูลนิสิต
		 		Iterable<TxReserve> listReserve = txReserveRepository.findByRoomIdODERBYRecIdDESC(request.getRoomId());
		 		for (TxReserve txReserve : listReserve) {
		 			ViewDataReserve dataReserve = new ViewDataReserve();
					dataReserve.setStudentId(txReserve.getStudentId());
					dataReserve.setStudentFname(txReserve.getStudentFname());
					dataReserve.setStudentLname(txReserve.getStudentLname());
					
					detailStudent.add(dataReserve);
					response.setDetailStudent(detailStudent);
				}
			 	
			 	
			    break;
			   
		 case 2:

			 	MsBuildingTwo msBuildingTwo = msBuildingTwoRepository.findByRoomId(request.getRoomId());

			 	TxSetDate setDate2 = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 	long termId2 = setDate2.getTermId();
		 		
		 		MsFee fee2 = msFeeRepository.findByTermIdANDTypeId(termId2, msBuildingTwo.getTypeId());
		 		
		 		response.setPrice(fee2.getFeePrice());
		 		response.setFloor(msBuildingTwo.getFloorId());
		 		response.setRoomId(msBuildingTwo.getRoomId());
		 		response.setTotalPeople(msBuildingTwo.getBuildingTotal());
		 		
		 		//ชื่อตึก
		 		LkBuilding building2 = lkBuildingRepository.findByBuildingId(buildingId);
		 		response.setBuildingName(building2.getBuildingName());
		 		
		 		LkType type2 = lkTypeRepository.findByRecId(msBuildingTwo.getTypeId());
		 		response.setTypeName(type2.getTypeName());
		 		//ข้อมูลนิสิต
		 		Iterable<TxReserve> listReserve2 = txReserveRepository.findByRoomIdODERBYRecIdDESC(request.getRoomId());
		 		for (TxReserve txReserve : listReserve2) {
		 			ViewDataReserve dataReserve = new ViewDataReserve();
					dataReserve.setStudentId(txReserve.getStudentId());
					dataReserve.setStudentFname(txReserve.getStudentFname());
					dataReserve.setStudentLname(txReserve.getStudentLname());
					
					detailStudent.add(dataReserve);
					response.setDetailStudent(detailStudent);
				}
			 	
			    break;
		 case 3:

			 	MsBuildingThree msBuildingThree = msBuildingThreeRepository.findByRoomId(request.getRoomId());

			 	TxSetDate setDate3 = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 	long termId3 = setDate3.getTermId();
		 		
		 		MsFee fee3 = msFeeRepository.findByTermIdANDTypeId(termId3, msBuildingThree.getTypeId());
		 		
		 		response.setPrice(fee3.getFeePrice());
		 		response.setFloor(msBuildingThree.getFloorId());
		 		response.setRoomId(msBuildingThree.getRoomId());
		 		response.setTotalPeople(msBuildingThree.getBuildingTotal());
		 		
		 		//ชื่อตึก
		 		LkBuilding building3 = lkBuildingRepository.findByBuildingId(buildingId);
		 		response.setBuildingName(building3.getBuildingName());
		 		
		 		LkType type3 = lkTypeRepository.findByRecId(msBuildingThree.getTypeId());
		 		response.setTypeName(type3.getTypeName());
		 		//ข้อมูลนิสิต
		 		Iterable<TxReserve> listReserve3 = txReserveRepository.findByRoomIdODERBYRecIdDESC(request.getRoomId());
		 		for (TxReserve txReserve : listReserve3) {
		 			ViewDataReserve dataReserve = new ViewDataReserve();
					dataReserve.setStudentId(txReserve.getStudentId());
					dataReserve.setStudentFname(txReserve.getStudentFname());
					dataReserve.setStudentLname(txReserve.getStudentLname());
					
					detailStudent.add(dataReserve);
					response.setDetailStudent(detailStudent);
				}
			 	
			    break;
		 case 4:

			 	MsBuildingFour msBuildingFour = msBuildingFourRepository.findByRoomId(request.getRoomId());
				TxSetDate setDate4 = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 	long termId4 = setDate4.getTermId();
		 		
		 		MsFee fee4 = msFeeRepository.findByTermIdANDTypeId(termId4, msBuildingFour.getTypeId());
		 		
		 		response.setPrice(fee4.getFeePrice());
		 		response.setFloor(msBuildingFour.getFloorId());
		 		response.setRoomId(msBuildingFour.getRoomId());
		 		response.setTotalPeople(msBuildingFour.getBuildingTotal());
		 		
		 		//ชื่อตึก
		 		LkBuilding building4 = lkBuildingRepository.findByBuildingId(buildingId);
		 		response.setBuildingName(building4.getBuildingName());
		 		
		 		LkType type4 = lkTypeRepository.findByRecId(msBuildingFour.getTypeId());
		 		response.setTypeName(type4.getTypeName());
		 		//ข้อมูลนิสิต
		 		Iterable<TxReserve> listReserve4 = txReserveRepository.findByRoomIdODERBYRecIdDESC(request.getRoomId());
		 		for (TxReserve txReserve : listReserve4) {
		 			ViewDataReserve dataReserve = new ViewDataReserve();
					dataReserve.setStudentId(txReserve.getStudentId());
					dataReserve.setStudentFname(txReserve.getStudentFname());
					dataReserve.setStudentLname(txReserve.getStudentLname());
					
					detailStudent.add(dataReserve);
					response.setDetailStudent(detailStudent);
				}
			 	
			    break;
			    
		 case 5:

			 	MsBuildingFive msBuildingFive = msBuildingFiveRepository.findByRoomId(request.getRoomId());
			 	TxSetDate setDate5 = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 	long termId5 = setDate5.getTermId();
		 		
		 		MsFee fee5 = msFeeRepository.findByTermIdANDTypeId(termId5, msBuildingFive.getTypeId());
		 		
		 		response.setPrice(fee5.getFeePrice());
		 		response.setFloor(msBuildingFive.getFloorId());
		 		response.setRoomId(msBuildingFive.getRoomId());
		 		response.setTotalPeople(msBuildingFive.getBuildingTotal());
		 		
		 		//ชื่อตึก
		 		LkBuilding building5 = lkBuildingRepository.findByBuildingId(buildingId);
		 		response.setBuildingName(building5.getBuildingName());
		 		
		 		LkType type5 = lkTypeRepository.findByRecId(msBuildingFive.getTypeId());
		 		response.setTypeName(type5.getTypeName());
		 		//ข้อมูลนิสิต
		 		Iterable<TxReserve> listReserve5 = txReserveRepository.findByRoomIdODERBYRecIdDESC(request.getRoomId());
		 		for (TxReserve txReserve : listReserve5) {
		 			ViewDataReserve dataReserve = new ViewDataReserve();
					dataReserve.setStudentId(txReserve.getStudentId());
					dataReserve.setStudentFname(txReserve.getStudentFname());
					dataReserve.setStudentLname(txReserve.getStudentLname());
					
					detailStudent.add(dataReserve);
					response.setDetailStudent(detailStudent);
				}
			 	
			    break;
		 case 6:

			 	MsBuildingSix msBuildingSix = msBuildingSixRepository.findByRoomId(request.getRoomId());
			 	TxSetDate setDate6 = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 	long termId6 = setDate6.getTermId();
		 		
		 		MsFee fee6 = msFeeRepository.findByTermIdANDTypeId(termId6, msBuildingSix.getTypeId());
		 		
		 		response.setPrice(fee6.getFeePrice());
		 		response.setFloor(msBuildingSix.getFloorId());
		 		response.setRoomId(msBuildingSix.getRoomId());
		 		response.setTotalPeople(msBuildingSix.getBuildingTotal());
		 		
		 		//ชื่อตึก
		 		LkBuilding building6 = lkBuildingRepository.findByBuildingId(buildingId);
		 		response.setBuildingName(building6.getBuildingName());
		 		
		 		LkType type6 = lkTypeRepository.findByRecId(msBuildingSix.getTypeId());
		 		response.setTypeName(type6.getTypeName());
		 		//ข้อมูลนิสิต
		 		Iterable<TxReserve> listReserve6 = txReserveRepository.findByRoomIdODERBYRecIdDESC(request.getRoomId());
		 		for (TxReserve txReserve : listReserve6) {
		 			ViewDataReserve dataReserve = new ViewDataReserve();
					dataReserve.setStudentId(txReserve.getStudentId());
					dataReserve.setStudentFname(txReserve.getStudentFname());
					dataReserve.setStudentLname(txReserve.getStudentLname());
					
					detailStudent.add(dataReserve);
					response.setDetailStudent(detailStudent);
				}
			 	
			    break;
			    
		 case 7:

			 	MsBuildingSeven msBuildingSeven = msBuildingSevenRepository.findByRoomId(request.getRoomId());
			 	TxSetDate setDate7 = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 	long termId7 = setDate7.getTermId();
		 		
		 		MsFee fee7 = msFeeRepository.findByTermIdANDTypeId(termId7, msBuildingSeven.getTypeId());
		 		
		 		response.setPrice(fee7.getFeePrice());
		 		response.setFloor(msBuildingSeven.getFloorId());
		 		response.setRoomId(msBuildingSeven.getRoomId());
		 		response.setTotalPeople(msBuildingSeven.getBuildingTotal());
		 		
		 		//ชื่อตึก
		 		LkBuilding building7 = lkBuildingRepository.findByBuildingId(buildingId);
		 		response.setBuildingName(building7.getBuildingName());
		 		
		 		LkType type7 = lkTypeRepository.findByRecId(msBuildingSeven.getTypeId());
		 		response.setTypeName(type7.getTypeName());
		 		//ข้อมูลนิสิต
		 		Iterable<TxReserve> listReserve7 = txReserveRepository.findByRoomIdODERBYRecIdDESC(request.getRoomId());
		 		for (TxReserve txReserve : listReserve7) {
		 			ViewDataReserve dataReserve = new ViewDataReserve();
					dataReserve.setStudentId(txReserve.getStudentId());
					dataReserve.setStudentFname(txReserve.getStudentFname());
					dataReserve.setStudentLname(txReserve.getStudentLname());
					
					detailStudent.add(dataReserve);
					response.setDetailStudent(detailStudent);
				}
			    break;
			    
		 case 8:

			 	MsBuildingEight msBuildingEight = msBuildingEightRepository.findByRoomId(request.getRoomId());
			 	TxSetDate setDate8 = txSetDateRepository.TopTxSetDateOrderByRecIdDESC();
			 	long termId8 = setDate8.getTermId();
		 		
		 		MsFee fee8 = msFeeRepository.findByTermIdANDTypeId(termId8, msBuildingEight.getTypeId());
		 		
		 		response.setPrice(fee8.getFeePrice());
		 		response.setFloor(msBuildingEight.getFloorId());
		 		response.setRoomId(msBuildingEight.getRoomId());
		 		response.setTotalPeople(msBuildingEight.getBuildingTotal());
		 		
		 		//ชื่อตึก
		 		LkBuilding building8 = lkBuildingRepository.findByBuildingId(buildingId);
		 		response.setBuildingName(building8.getBuildingName());
		 		
		 		LkType type8 = lkTypeRepository.findByRecId(msBuildingEight.getTypeId());
		 		response.setTypeName(type8.getTypeName());
		 		//ข้อมูลนิสิต
		 		Iterable<TxReserve> listReserve8 = txReserveRepository.findByRoomIdODERBYRecIdDESC(request.getRoomId());
		 		for (TxReserve txReserve : listReserve8) {
		 			ViewDataReserve dataReserve = new ViewDataReserve();
					dataReserve.setStudentId(txReserve.getStudentId());
					dataReserve.setStudentFname(txReserve.getStudentFname());
					dataReserve.setStudentLname(txReserve.getStudentLname());
					
					detailStudent.add(dataReserve);
					response.setDetailStudent(detailStudent);
				}
			    break;

		}
		return response;
		
		
	}
	
	
	
	
	
	//จองห้อง
	@RequestMapping(value = "/reserve",method = RequestMethod.POST)
	public @ResponseBody BookRoomResponse reserve(@RequestBody BookRoomRequest request,HttpSession session) {
		
		BookRoomResponse response = new BookRoomResponse();
		
		TxReserve txReserve = new TxReserve();
		txReserve.setStudentFname((String)session.getAttribute("studentFname"));
		txReserve.setStudentLname((String)session.getAttribute("studentLname"));
		txReserve.setStudentId((long)session.getAttribute("studentId"));
		
		boolean bookRoom = bookRooomService.bookRoom(request.getBuildingId(), request.getRoomId(),txReserve);
		
		if (bookRoom) {
			
			response.setStatusResponse(LookupConstant.RESPONSE_STATUS_SUCCESS);
		}
		else {
			response.setStatusResponse(LookupConstant.RESPONSE_STATUS_FAILED);
		}
		return response;
	}
	
	
	//checkStatus
	@RequestMapping(value = "/checkStatusStudent",method = RequestMethod.POST)
	public @ResponseBody checkStatusStudentResponse checkStatusStudent(@RequestBody CheckStatusStudentRequest request) {
		checkStatusStudentResponse response = new checkStatusStudentResponse();
		
		TxStudent student = bookRooomService.findByStudentId(request.getStudentId());
		
		response.setStudentId(student.getStudentId());
		response.setStudentStatus(student.getStudentStatus());
		
		TxSetDate setDate = bookRooomService.TopDateData();
		
		response.setStartDate(setDate.getSetReserveStart());
		response.setEndDate(setDate.getSetReserveDue());
		
		
		return response;
		
	}
	
	//SetDate
	@RequestMapping(value = "/setDate",method = RequestMethod.POST)
	public @ResponseBody SetDateBookRoomResponse setDate(@RequestBody SetDateBookRoomRequest request) throws ParseException {
		SetDateBookRoomResponse response = new SetDateBookRoomResponse();
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern ,new Locale("en", "EN"));
		
		Date start = simpleDateFormat.parse(request.getReserveStart());
		Date due = simpleDateFormat.parse(request.getReserveDue());
		
		
		TxSetDate txSetDate = new TxSetDate();
		txSetDate.setSetReserveStart(start);
		txSetDate.setSetReserveDue(due);
		txSetDate.setSetPaymentDue(due);
		txSetDate.setSetPaymentstart(start);
		txSetDate.setTermId(request.getTermId());
		txSetDate.setYear(request.getYear());
		
		boolean setDate = bookRooomService.setDate(txSetDate);
		if (setDate) {
			response.setStatus(LookupConstant.RESPONSE_STATUS_SUCCESS);
		}else {
			response.setStatus(LookupConstant.RESPONSE_STATUS_FAILED);
		}
		return response;
	}
	
	
	
	//GetTerm
	@GetMapping(value = "/termData")
	public @ResponseBody Iterable<LkTerm> getTerm(){
	
		Iterable<LkTerm> term = lkTermRepository.findAll();
		return term;
		
	}
	

	
	//AdminView
	@RequestMapping(value = "/adminReserveSearch",method = RequestMethod.POST)
	public @ResponseBody ListAdminViewReserveResponse view(@RequestBody AdminViewReserveRequest request) {
		ListAdminViewReserveResponse response = new ListAdminViewReserveResponse();
		
		List<AdminViewReserveResponse> detail = new ArrayList<AdminViewReserveResponse>();
		
		Iterable<TxReserve> listTxReserve = bookRooomService.adminView(request.getKeyword(), LookupConstant.RESERVE_STATUS_PAID, LookupConstant.RESERVE_STATUS_UNPAID);
		for (TxReserve txReserve : listTxReserve) {
			AdminViewReserveResponse data = new AdminViewReserveResponse();
			
			data.setReserveId(txReserve.getRecId());
			data.setStudentFname(txReserve.getStudentFname());
			data.setStudentLname(txReserve.getStudentLname());
			data.setStudentId(txReserve.getStudentId());
			data.setRoomId(txReserve.getRoomId());
			data.setReserveStatus(txReserve.getReserveStatus());
			
			//หาMsfee
			MsFee msFee = msFeeRepository.findByRecId(txReserve.getFeeId());
			
			data.setReservePrice(msFee.getFeePrice());
			
			detail.add(data);
			response.setDetail(detail);
			
			
		}
		return response;
		
		
	}
	
	//ส่งไปก่อนView
	@GetMapping(value = "/adminViewReserve")
	public @ResponseBody ListAdminViewReserveResponse viewTotalReserve() {
		ListAdminViewReserveResponse response = new ListAdminViewReserveResponse();
		
		List<AdminViewReserveResponse> detail = new ArrayList<AdminViewReserveResponse>();
		Iterable<TxReserve> listTxReserve = txReserveRepository.findAll();
		
		for (TxReserve txReserve : listTxReserve) {
			AdminViewReserveResponse data = new AdminViewReserveResponse();
			
			data.setReserveId(txReserve.getRecId());
			data.setStudentFname(txReserve.getStudentFname());
			data.setStudentLname(txReserve.getStudentLname());
			data.setStudentId(txReserve.getStudentId());
			data.setRoomId(txReserve.getRoomId());
			data.setReserveStatus(txReserve.getReserveStatus());
			
			//หาMsfee
			MsFee msFee = msFeeRepository.findByRecId(txReserve.getFeeId());
			
			data.setReservePrice(msFee.getFeePrice());
			
			detail.add(data);
			response.setDetail(detail);
		}
		return response;
	}
	
	//createReceipt
	@RequestMapping(value = "/createReceiptReserve",method = RequestMethod.POST)
	public @ResponseBody ReserveReceiptResponse createReceipt(@RequestBody ReserveReceiptRequest request ,HttpSession session) {
		
		ReserveReceiptResponse response = new ReserveReceiptResponse();
		
		TxReserve createReserve = bookRooomService.createReceipt(request.getReserveId(), (long) session.getAttribute("officerId"));
		if (createReserve!=null) {
			
			response.setOfficerFname((String) session.getAttribute("officerFname"));
			response.setOfficerLname((String) session.getAttribute("officerFname"));
			
			TxOfficer txOfficer = txOfficerRepository.findByRecId(createReserve.getOfficerId());
			LkRole lkRole = lkRoleRepository.findByRecId(txOfficer.getOfficerRoleId());
			response.setOfficerRole(lkRole.getRoleName());
			
			response.setReceiptNumber(createReserve.getReceiptNumber());
			response.setReceiptDate(createReserve.getReceiptDate());
			response.setRoomId(createReserve.getRoomId());
			response.setStudentFname(createReserve.getStudentFname());
			response.setStudentId(createReserve.getStudentId());
			response.setStudentLname(createReserve.getStudentLname());
			response.setReserveDate(createReserve.getReserveDate());
			
			//price
			MsFee msFee = msFeeRepository.findByRecId(createReserve.getFeeId());
			response.setPrice(msFee.getFeePrice());
			
			//term
			LkTerm term = lkTermRepository.findByRecId(createReserve.getTermId());
			response.setTerm(term.getTermName());
			
			//BuildingType
			LkType type = lkTypeRepository.findByRecId(createReserve.getBuildingTypeId());
			response.setBuildingType(type.getTypeName());
			
			response.setYear(createReserve.getYear());
			
		}
		return response;
		
	}
	
}
