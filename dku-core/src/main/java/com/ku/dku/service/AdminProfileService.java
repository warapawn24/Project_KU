package com.ku.dku.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.ku.dku.constant.LookupConstant;
import com.ku.dku.entity.LkStatus;
import com.ku.dku.entity.TxOfficer;

import com.ku.dku.repository.TxOfficerRepository;

@Service
public class AdminProfileService {

	@Autowired private TxOfficerRepository txOfficerRepository;

	@Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public boolean updateOfficer(TxOfficer officer) {
		
		TxOfficer txOfficer = new TxOfficer();
		long startOfficerId = 1;
		
		
		Integer loginfirstchange = 0;
		
		if (txOfficer.getRecId()==1) {
			txOfficer.setOfficerId(startOfficerId);
			txOfficer.setOfficerFname(officer.getOfficerFname());
			txOfficer.setOfficerLname(officer.getOfficerLname());
			txOfficer.setOfficerEmail(officer.getOfficerEmail());
			txOfficer.setOfficerUsername(officer.getOfficerUsername());
			txOfficer.setOfficerPassword(bCryptPasswordEncoder.encode(officer.getOfficerPassword()));
			txOfficer.setOfficerRoleId(officer.getOfficerRoleId());
			txOfficer.setOfficerLoginfirstchange(loginfirstchange);
			txOfficer.setOfficerStatus(LookupConstant.LK_STATUS_ACTIVE);
			
			txOfficerRepository.save(txOfficer);
		}else {
			
			txOfficer.setOfficerFname(officer.getOfficerFname());
			txOfficer.setOfficerLname(officer.getOfficerLname());
			txOfficer.setOfficerEmail(officer.getOfficerEmail());
			txOfficer.setOfficerUsername(officer.getOfficerUsername());
			txOfficer.setOfficerPassword(bCryptPasswordEncoder.encode(officer.getOfficerPassword()));
			txOfficer.setOfficerRoleId(officer.getOfficerRoleId());
			txOfficer.setOfficerLoginfirstchange(loginfirstchange);
			txOfficer.setOfficerStatus(LookupConstant.LK_STATUS_ACTIVE);
			
			txOfficerRepository.save(txOfficer);
		}
		
		
		return true;
		
	}
	
	public TxOfficer findByOfficerId(long officerId) {
		TxOfficer officer = txOfficerRepository.findByRecId(officerId);
		
		return officer;
	}
	
	public boolean changeOfficerStatus(TxOfficer officer) {
		
		TxOfficer txOfficer = txOfficerRepository.findByRecId(officer.getRecId());
		
		txOfficer.setOfficerStatus(officer.getOfficerStatus());
		txOfficerRepository.save(txOfficer);
		
		return true;
	}
}
