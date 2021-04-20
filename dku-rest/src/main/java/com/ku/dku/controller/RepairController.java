package com.ku.dku.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.AdminAddDateRepairRequest;
import com.ku.dku.bean.AdminAddDateRepairResponse;
import com.ku.dku.bean.AdminRepairShowDetailRequest;
import com.ku.dku.bean.AdminRepairShowDetailResponse;
import com.ku.dku.bean.ChangeStatusRepairRequest;
import com.ku.dku.bean.ChangeStatusRepairResponse;
import com.ku.dku.bean.CreateRepairNumberRequest;
import com.ku.dku.bean.ListAdminRepairShowResponse;
import com.ku.dku.bean.ListRepairRequest;
import com.ku.dku.bean.ListRepairResponse;
import com.ku.dku.bean.ListViewRepairResponse;
import com.ku.dku.bean.RepairRequest;
import com.ku.dku.bean.RepairResponse;
import com.ku.dku.bean.RepairStatusResponse;
import com.ku.dku.bean.ViewRepairRequest;
import com.ku.dku.bean.ViewRepairStatusDoneResponse;
import com.ku.dku.bean.ViewRepairStatusWaitResponse;
import com.ku.dku.constant.LookupConstant;
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
	
	//เพิ่มกำหนดการเข้าซ่อม
	@RequestMapping(value = "/adminAddDate", method = RequestMethod.POST)
	public @ResponseBody AdminAddDateRepairResponse addDate(@RequestBody AdminAddDateRepairRequest request,HttpSession session) throws ParseException {
				AdminAddDateRepairResponse response = new AdminAddDateRepairResponse();
				
				
				String pattern = "yyyy-MM-dd";
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern ,new Locale("en", "EN"));
				
				Date due = simpleDateFormat.parse(request.getRepairDuedate());
				
				TxRepairNotification repair = new TxRepairNotification();
				repair.setOfficerUsername((String)session.getAttribute("username"));
				repair.setRepairDuedate(due);
				repair.setRecId(request.getRepairId());
				
				boolean addDate = repairService.addDate(repair);
				if (addDate) {
					
					response.setStatusResponse(LookupConstant.RESPONSE_STATUS_SUCCESS);
				}else {
					response.setStatusResponse(LookupConstant.RESPONSE_STATUS_FAILED);
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
			txRepairNotification.setRepairStatus(LookupConstant.REPAIR_STATUS_WAIT);
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
	public @ResponseBody ListAdminRepairShowResponse adminListRepair(@RequestBody AdminRepairShowDetailRequest request) {
		
		ListAdminRepairShowResponse response = new ListAdminRepairShowResponse();
		
		List<AdminRepairShowDetailResponse> detail =new ArrayList<AdminRepairShowDetailResponse>();
		Iterable<TxRepairNotification> listRepair = repairService.findByStatus(request.getRepairStatus(),request.getRepairList());
		for (TxRepairNotification txRepairNotification : listRepair) {
			AdminRepairShowDetailResponse data = new AdminRepairShowDetailResponse();
			data.setRoomId(txRepairNotification.getRoomId());
			data.setRepairDate(txRepairNotification.getRepairDate());
			data.setRepairId(txRepairNotification.getRecId());
			data.setRepairList(txRepairNotification.getRepairList());
			data.setStudentId(txRepairNotification.getStudentId());
			data.setRepairStatus(txRepairNotification.getRepairStatus());

			detail.add(data);
			response.setDetail(detail);
		}
	
		return response;
		
	}

	 
	 //StudentView
	@RequestMapping(value = "/viewRepair", method = RequestMethod.POST)
	public @ResponseBody ListViewRepairResponse view(@RequestBody ViewRepairRequest request) {
		
		ListViewRepairResponse response = new ListViewRepairResponse();
		
		List<ViewRepairStatusWaitResponse> wait = new ArrayList<ViewRepairStatusWaitResponse>();
		Iterable<TxRepairNotification> listRepairWait = repairService.view(request.getStudentId(), LookupConstant.REPAIR_STATUS_WAIT);
		for (TxRepairNotification txRepairNotification : listRepairWait) {
			ViewRepairStatusWaitResponse data = new ViewRepairStatusWaitResponse();
			data.setRepairDate(txRepairNotification.getRepairDate());
			data.setRepairDuedate(txRepairNotification.getRepairDuedate());
			data.setRepairList(txRepairNotification.getRepairList());
			
			wait.add(data);
			response.setWait(wait);
		}
		
		//done
		List<ViewRepairStatusDoneResponse> done = new ArrayList<ViewRepairStatusDoneResponse>();
		Iterable<TxRepairNotification> listRepairDone = repairService.view(request.getStudentId(), LookupConstant.REPAIR_STATUS_DONE);
		for (TxRepairNotification txRepairNotification2 : listRepairDone) {
			ViewRepairStatusDoneResponse doneData = new ViewRepairStatusDoneResponse();
			doneData.setRepairDate(txRepairNotification2.getRepairDate());
			doneData.setRepairDuedate(txRepairNotification2.getRepairDuedate());
			doneData.setRepairList(txRepairNotification2.getRepairList());
			
			done.add(doneData);
			response.setDone(done);
		}
		
		return response;
		
	}
			
	//changeStatus
	@RequestMapping(value = "/changeStatus", method = RequestMethod.POST)
	public @ResponseBody ChangeStatusRepairResponse changeStatus(@RequestBody ChangeStatusRepairRequest request) {
			ChangeStatusRepairResponse response = new ChangeStatusRepairResponse();
			
			boolean changeStatus = repairService.changeStatus(request.getRepairId(), request.getStatus());
			
			if (changeStatus) {
				
				response.setStatusResponse(LookupConstant.RESPONSE_STATUS_SUCCESS);
			}else {
				response.setStatusResponse(LookupConstant.RESPONSE_STATUS_FAILED);
			}
		
		return response;
		
	}
		
	
	




}
