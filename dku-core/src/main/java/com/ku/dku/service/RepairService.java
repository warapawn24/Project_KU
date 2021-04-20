package com.ku.dku.service;

import java.nio.channels.SeekableByteChannel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.MsRepairYear;
import com.ku.dku.entity.TxOfficer;
import com.ku.dku.entity.TxRepairNotification;
import com.ku.dku.repository.MsRepairYearRepository;
import com.ku.dku.repository.TxOfficerRepository;
import com.ku.dku.repository.TxRepairNotificationRepository;

@Service
public class RepairService {
	@Autowired private TxRepairNotificationRepository txRepairNotificationRepository;
	@Autowired private MsRepairYearRepository msRepairYearRepository;
	@Autowired private TxOfficerRepository txOfficerRepository;
	
	public boolean repair(TxRepairNotification repairData) {
	
		
		TxRepairNotification txRepair = txRepairNotificationRepository.findByStudentId(repairData.getStudentId());
		txRepair.setRoomId(repairData.getRoomId());
		txRepair.setStudentFname(repairData.getStudentFname());
		txRepair.setStudentLname(repairData.getStudentLname());
		txRepair.setRepairPhone(repairData.getRepairPhone());
		txRepair.setRepairList(repairData.getRepairList());
		txRepair.setRepairStatus(LookupConstant.REPAIR_STATUS_NOTALREADY);
		txRepairNotificationRepository.save(txRepair);
		
		
		return true;
		
	}
	
	
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public MsRepairYear getNextNumber(int curentYear) {
		Date date = new Date();
		String dateString = new SimpleDateFormat("yyy-MM-dd HH:mm:ss.SSS").format(date);
		System.out.println("getNextNumber():Date=" + dateString);
		MsRepairYear year = msRepairYearRepository.findByYear(curentYear);
		if (year == null) {
			year = new MsRepairYear();
			year.setYear(curentYear);
			year.setNumber(0);
		}
		System.out.println("getNextNumber(): get current number=" + year.getNumber());
		int num = (year.getNumber() + 1);
		year.setNumber(num);
		year = msRepairYearRepository.save(year);
		System.out.println("getNextNumber(): get number changed=" + year.getNumber());
		return year;
	}
	
	
	private ThreadPoolExecutor executor;
	@PostConstruct
	public void setup() {
		executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
	}
	public boolean createNo(long studentId) {
		int curyear = Calendar.getInstance(new Locale("en", "EN")).get(Calendar.YEAR);
		curyear += 543;
		MsRepairYear year = getNextNumber(curyear);
		int num = year.getNumber();
		
		TxRepairNotification txRepairNotification = new TxRepairNotification();
		long millies = System.currentTimeMillis();
		Date date = new Date(millies);
		txRepairNotification.setStudentId(studentId);
		txRepairNotification.setRepairDate(date);
		txRepairNotification.setYearNumber(num);
		txRepairNotification.setYear(curyear);
		txRepairNotification.setRepairStatus(LookupConstant.REPAIR_STATUS_NOTALREADY);
		txRepairNotificationRepository.save(txRepairNotification);
		
		
		return true;
		
	}
	
	
	public Iterable<TxRepairNotification> listRepair(String status){
		
		Iterable<TxRepairNotification> repairList = txRepairNotificationRepository.findAllByRepairStatusOrderByRecIdDESC(status);
		
		return repairList;
		
	}
	
	public Iterable<TxRepairNotification> findByStatus(String status,String keyword){
		
		Iterable<TxRepairNotification> findByStatus = txRepairNotificationRepository.findAllByRepairStatusAndListOrderByRecIdDESC(status, keyword);
		return findByStatus;
		
	}
	
	//เพิ่มกำหนดการ
	public boolean addDate(TxRepairNotification repair) {
		
		TxRepairNotification addData = txRepairNotificationRepository.findByRecId(repair.getRecId());
		
		addData.setRepairDuedate(repair.getRepairDuedate());
		addData.setOfficerUsername(repair.getOfficerUsername());
		addData.setRepairStatus(LookupConstant.REPAIR_STATUS_WAIT);
		txRepairNotificationRepository.save(addData);
	
		return true;
		
	}
	
	//ViewStudent
	public Iterable<TxRepairNotification> view(long studentId,String status){
		Iterable<TxRepairNotification> view = txRepairNotificationRepository.findByStudentIdHAVINGRepairStatusOrderByRecIdDESC(studentId, status);
		return view;
	}
	
	//เปลี่ยนstatus
	public boolean changeStatus(long repairId,String status) {
		
		TxRepairNotification change = txRepairNotificationRepository.findByRecId(repairId);
		change.setRepairStatus(status);
		txRepairNotificationRepository.save(change);
		
		return true;
	}
}
