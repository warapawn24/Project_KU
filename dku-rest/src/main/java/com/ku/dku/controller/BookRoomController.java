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

import com.ku.dku.bean.BookRoomRequest;
import com.ku.dku.bean.BookRoomResponse;
import com.ku.dku.bean.CheckStatusResponse;
import com.ku.dku.bean.CheckStatusStudentRequest;
import com.ku.dku.bean.ListBuildingDataResponse;
import com.ku.dku.bean.ListFloorByBuildingResponse;
import com.ku.dku.bean.RoomDataRequest;
import com.ku.dku.bean.RoomDataResponse;
import com.ku.dku.bean.SetDateBookRoomRequest;
import com.ku.dku.bean.SetDateBookRoomResponse;
import com.ku.dku.bean.checkStatusStudentResponse;
import com.ku.dku.entity.LkTerm;
import com.ku.dku.entity.MsBuilding;
import com.ku.dku.entity.TxSetDate;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.LkTermRepository;
import com.ku.dku.repository.MsBuildingRepository;
import com.ku.dku.service.BookRooomService;
import com.ku.dku.service.BuildingService;

@RestController
@RequestMapping(value = "/user/bookRoom")
public class BookRoomController {

	@Autowired private BookRooomService bookRooomService;
	@Autowired private BuildingService buildingService;
	@Autowired private MsBuildingRepository msBuildingRepository;
	@Autowired private LkTermRepository lkTermRepository;
	
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
			response.setStatusResponse("success");
		}
		else {
			response.setStatusResponse("failed");
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
	public @ResponseBody SetDateBookRoomResponse setDate(@RequestBody SetDateBookRoomRequest request) {
		SetDateBookRoomResponse response = new SetDateBookRoomResponse();
		
		
		TxSetDate txSetDate = new TxSetDate();
		txSetDate.setSetReserveStart(request.getReserveStart());
		txSetDate.setSetReserveDue(request.getReserveDue());
		txSetDate.setSetPaymentDue(request.getReserveDue());
		txSetDate.setSetPaymentstart(request.getReserveStart());
		txSetDate.setTermId(request.getTermId());
		txSetDate.setYear(request.getYear());
		
		boolean setDate = bookRooomService.setDate(txSetDate);
		if (setDate) {
			response.setStatus("success");
		}else {
			response.setStatus("failed");
		}
		return response;
	}
	
	//GetTerm
	@GetMapping(value = "/termData")
	public @ResponseBody Iterable<LkTerm> getTerm(){
	
		Iterable<LkTerm> term = lkTermRepository.findAll();
		return term;
		
	}
}
