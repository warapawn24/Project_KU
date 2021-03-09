package com.ku.dku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.TxStudentRepository;

@Service
public class ProfileService {

	@Autowired private TxStudentRepository txStudentRepository;
	
	public TxStudent profile(long studentId) {
		
		TxStudent txStudent = txStudentRepository.findByStudentId(studentId);
		return txStudent;		
	}
}
