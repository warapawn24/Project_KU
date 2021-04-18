package com.ku.dku.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ku.dku.entity.MsRunningNumber;
import com.ku.dku.repository.MsRunningNumberRepository;

@Service
public class RunningNumberService {

	@Autowired private MsRunningNumberRepository msRunningNumberRepository;
	
	//runningNumber
		@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
		public MsRunningNumber getNextNumber(String description) {
			Date date = new Date();
			String dateString = new SimpleDateFormat("yyy-MM-dd HH:mm:ss.SSS").format(date);
			System.out.println("getNextNumber():Date=" + dateString);
			
			MsRunningNumber number = msRunningNumberRepository.findByDescription(description);
//			MsRunningNumber number = msRunningNumberRepository.findByNumber(findDescrip.getNumber());
			
				
		//error//
		
			if (number == null) {
				number = new MsRunningNumber();
				number.setNumber(0);
				number.setDescription(description);
			}
				System.out.println("getNextNumber(): get current number=" + number.getNumber());
				int num = (number.getNumber() + 1);
				number.setNumber(num);
				number = msRunningNumberRepository.save(number);
				System.out.println("getNextNumber(): get number changed=" +  number.getNumber());
			
			
		
			
		return number;
		}
}
