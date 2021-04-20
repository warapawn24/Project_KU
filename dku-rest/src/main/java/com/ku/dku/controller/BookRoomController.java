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
import com.ku.dku.bean.checkStatusStudentResponse;
import com.ku.dku.constant.LookupConstant;
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
		
	
	
//	@RequestMapping(value ="/buildingData",method = RequestMethod.POST)
//	public @ResponseBody ListFloorByBuildingResponse buildingData(@RequestBody RoomDataRequest request) {
//		ListFloorByBuildingResponse respoonse = new ListFloorByBuildingResponse();
//		
//		List<Long> roomFloorList = new ArrayList<Long>();
//		Iterable<MsBuilding> findBuilding = msBuildingRepository.findByBuildingId(request.getBuildingIdRequest());
//		for (MsBuilding building : findBuilding) {
//			
//			if (!roomFloorList.contains(building.getRomFloor())) {
//				roomFloorList.add(building.getRomFloor());
//				long roomFloor = building.getRomFloor();
//				System.out.println("roomFloor"+roomFloor);
//				
//				List<ListBuildingDataResponse> buildingListData = new ArrayList<ListBuildingDataResponse>();
//				ListBuildingDataResponse buildingData = new ListBuildingDataResponse();
//				List<RoomDataResponse> listRoom = new ArrayList<RoomDataResponse>();
//				Iterable<MsBuilding> listBuilding = buildingService.listBuilding(request.getBuildingIdRequest(),roomFloor);
//				System.out.println("showroomFloor: "+roomFloor);
//				buildingData.setRoomFloor(roomFloor);
//				
//				
//				for (MsBuilding msBuilding : listBuilding) {
//					RoomDataResponse roomDataResponse = new RoomDataResponse();
//					roomDataResponse.setRecId(msBuilding.getRecId());
//					roomDataResponse.setRoomId(msBuilding.getRoomId());
//					listRoom.add(roomDataResponse);
//					buildingData.setListRoom(listRoom);
//					buildingListData.add(buildingData);
//				}
//				respoonse.setListBuilding(buildingListData);
//			}
//			
//			
//		}
//		
//		return respoonse;
//		
//	}
	
	
	
	//จองห้อง
	@RequestMapping(value = "/reserve",method = RequestMethod.POST)
	public @ResponseBody BookRoomResponse reserve(@RequestBody BookRoomRequest request) {
		
		BookRoomResponse response = new BookRoomResponse();
		
		boolean bookRoom = bookRooomService.bookRoom(request.getRoomIdRequest(), request.getStudentIdRequest());
		
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
