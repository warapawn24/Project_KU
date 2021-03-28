package com.ku.dku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ku.dku.entity.TxUtilityBill;
import com.ku.dku.repository.TxUtilityBillRepository;

@Service
public class UtilityBillService {

	@Autowired private TxUtilityBillRepository txUtilityBillRepository;
	
	public Iterable<TxUtilityBill> TopThreeBill(long studentId){
	
		Iterable<TxUtilityBill> topThreeBaill = txUtilityBillRepository.TopThreeStudentIdOrderByRecIdDESC(studentId);		
		
		return topThreeBaill;
		
	}
	
	public TxUtilityBill TopBill(long studentId){
		
		TxUtilityBill topBill = txUtilityBillRepository.TopTxUtilityBillOrderByRecIdDESC(studentId);
		
		return topBill;
		
	}
}
