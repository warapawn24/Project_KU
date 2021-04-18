package com.ku.dku.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.Fidelity;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.MsRepairYear;
import com.ku.dku.entity.MsRunningNumber;
import com.ku.dku.entity.TxUtilityBill;
import com.ku.dku.repository.MsRunningNumberRepository;
import com.ku.dku.repository.TxUtilityBillRepository;

@Service
public class UtilityBillService {

	@Autowired private TxUtilityBillRepository txUtilityBillRepository;
	@Autowired private MsRunningNumberRepository msRunningNumberRepository;
	@Autowired private RunningNumberService runningNumberService;
	
	public Iterable<TxUtilityBill> TopThreeBill(long studentId){
	
		Iterable<TxUtilityBill> topThreeBaill = txUtilityBillRepository.TopThreeStudentIdOrderByRecIdDESC(studentId);		
		
		return topThreeBaill;
		
	}
	
	public TxUtilityBill TopBill(long studentId){
		
		TxUtilityBill topBill = txUtilityBillRepository.TopTxUtilityBillOrderByRecIdDESC(studentId);
		
		return topBill;
		
	}
	
	public Iterable<TxUtilityBill> findByKeyword(String key , String status, String status2){
		
		Iterable<TxUtilityBill> keyword = txUtilityBillRepository.findTxUtilityBillByKeywordDESC(key, status, status2);
		
		return keyword;
		
	}
	
	//createReceipt
	public TxUtilityBill createReceipt(long utilityId,long officerId) {
		MsRunningNumber description = runningNumberService.getNextNumber("utility_receipt");
		int number = description.getNumber();
		
		TxUtilityBill txUtilityBill = txUtilityBillRepository.findByRecId(utilityId);

		long millies = System.currentTimeMillis();
		Date date = new Date(millies);

		txUtilityBill.setReceiptDate(date);
		txUtilityBill.setReceiptNumber(number);
		txUtilityBill.setOfficerId(officerId);
		txUtilityBill.setUtilityStatus(LookupConstant.UTILITY_STATUS_PAID);
		txUtilityBillRepository.save(txUtilityBill);
		
		return txUtilityBill;
		
	}
	
	//
}
