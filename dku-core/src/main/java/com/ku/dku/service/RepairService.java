package com.ku.dku.service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ku.dku.entity.MsRepairYear;
import com.ku.dku.entity.TxRepairNotification;
import com.ku.dku.repository.MsRepairYearRepository;
import com.ku.dku.repository.TxRepairNotificationRepository;

@Service
public class RepairService {
	@Autowired private TxRepairNotificationRepository txRepairNotificationRepository;
	@Autowired private MsRepairYearRepository msRepairYearRepository;
	
	public boolean repair(TxRepairNotification repairData) {
	
		TxRepairNotification txRepair = new TxRepairNotification();
		txRepair.setRoomId(repairData.getRoomId());
		txRepair.setRepairDate(repairData.getRepairDate());
		txRepair.setStudentId(repairData.getStudentId());
		txRepair.setStudentFname(repairData.getStudentFname());
		txRepair.setStudentLname(repairData.getStudentLname());
		txRepair.setRepairPhone(repairData.getRepairPhone());
		txRepair.setRepairList(repairData.getRepairList());
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
		txRepairNotification.setRepairStatus("not approved");
		txRepairNotificationRepository.save(txRepairNotification);
		
		
		return true;
		
	}
	
	
	public Iterable<TxRepairNotification> listRepair(String status){
		
		Iterable<TxRepairNotification> repairList = txRepairNotificationRepository.findAllByRepairStatusOrderByRecIdDESC(status);
		
		return repairList;
		
	}
}
