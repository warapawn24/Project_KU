package com.ku.dku.controller;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.AdminRepairShowDetailRequest;
import com.ku.dku.bean.AdminRepairShowDetailResponse;
import com.ku.dku.bean.CreateRepairNumberRequest;
import com.ku.dku.bean.ListRepairRequest;
import com.ku.dku.bean.ListRepairResponse;
import com.ku.dku.bean.RepairRequest;
import com.ku.dku.bean.RepairResponse;
import com.ku.dku.bean.RepairStatusResponse;
import com.ku.dku.entity.TxRepairNotification;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.TxRepairNotificationRepository;
import com.ku.dku.repository.TxStudentRepository;
import com.ku.dku.service.RepairService;

@RestController
@RequestMapping(value = "/user/repair")
public class RepairController {
	@Autowired private RepairService repairService;
	@Autowired private TxRepairNotificationRepository txRepairNotificationRepository;
	@Autowired private TxStudentRepository txStudentRepository;
	
	
	private ThreadPoolExecutor executor;

	@PostConstruct
	public void setup() {
		executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
	}
	
	//สร้างเลขที่ใบ
	@RequestMapping(value = "/createNoRepair", method = RequestMethod.POST)
	public @ResponseBody RepairResponse  createNo(@RequestBody CreateRepairNumberRequest request) {
		RepairResponse response = new RepairResponse();
		
		boolean create = repairService.createNo(request.getStudentId());
		
		
		TxStudent getStudent = txStudentRepository.findByStudentId(request.getStudentId());
		if (create) {
			TxRepairNotification getData = txRepairNotificationRepository.findByStudentId(request.getStudentId());
			response.setRepairId(getData.getRecId());
			response.setStudentId(getData.getStudentId());
			response.setRoomId(getStudent.getStudentRoom());
			response.setYear(getData.getYear());
			response.setYearNumber(getData.getYearNumber());
			response.setStudentFname(getStudent.getStudentFname());
			response.setStudentLname(getStudent.getStudentLname());
			response.setStatusResponse("success");
		}
		else {
			response.setStatusResponse("failed");
		}
		
		
		return response;
		
	}
	
	//กรอกข้อมูลการแจ้งซ่อม
	@RequestMapping(value = "/addRepairData", method = RequestMethod.POST)
	public @ResponseBody RepairStatusResponse repairNoti(@RequestBody RepairRequest request) {
		RepairStatusResponse response = new RepairStatusResponse();
		
		TxRepairNotification txRepairNotification = new TxRepairNotification();
		txRepairNotification.setRoomId(request.getRoomId());
		txRepairNotification.setStudentId(request.getStudentId());
		txRepairNotification.setStudentFname(request.getStudentFname());
		txRepairNotification.setStudentLname(request.getStudentLname());
		txRepairNotification.setRepairPhone(request.getRepairPhone());
		txRepairNotification.setRepairList(request.getRepairList());
		boolean repair = repairService.repair(txRepairNotification);
		
		if (repair) {
			txRepairNotification.setRepairStatus("not approved");
			response.setStatusResponse("success");
		}else {
			response.setStatusResponse("failed");
		}
		
		return response;
	}
	
	//หน้า List การแจ้งซ่อม
	@GetMapping(value = "/repairDetail")
	public @ResponseBody ListRepairResponse listRepair() {
		ListRepairResponse response = new ListRepairResponse();
		
		Iterable<TxRepairNotification> listRepair = repairService.listRepair("approved");
		for (TxRepairNotification txRepairNotification : listRepair) {
			response.setRoomId(txRepairNotification.getRoomId());
			response.setStudentfname(txRepairNotification.getStudentFname());
			response.setStudentLname(txRepairNotification.getStudentLname());
			response.setRepairDetail(txRepairNotification.getRepairList());
			response.setRepairDate(txRepairNotification.getRepairDate());
			response.setRepairDuedate(txRepairNotification.getRepairDuedate());
			
			
		}
	
		return response;
		
	}
	
	//AdminListการแจ้งซ่อม
	@PostMapping(value = "/adminRepairDetail")
	public @ResponseBody AdminRepairShowDetailResponse adminListRepair(@RequestBody AdminRepairShowDetailRequest request) {
		AdminRepairShowDetailResponse response = new AdminRepairShowDetailResponse();
		
		Iterable<TxRepairNotification> listRepair = repairService.findByStatus(request.getRepairStatus(),request.getRepairList());
		for (TxRepairNotification txRepairNotification : listRepair) {
			response.setRoomId(txRepairNotification.getRoomId());
			response.setRepairDate(txRepairNotification.getRepairDate());
			response.setRepairId(txRepairNotification.getRecId());
			response.setRepairList(txRepairNotification.getRepairList());
			response.setStudentId(txRepairNotification.getStudentId());
			response.setRepairStatus(txRepairNotification.getRepairStatus());

		}
	
		return response;
		
	}
	
}
