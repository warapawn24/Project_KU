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
		
		txOfficer.setOfficerFname(officer.getOfficerFname());
		txOfficer.setOfficerLname(officer.getOfficerLname());
		txOfficer.setOfficerEmail(officer.getOfficerEmail());
		txOfficer.setOfficerUsername(officer.getOfficerUsername());
		txOfficer.setOfficerPassword(bCryptPasswordEncoder.encode(officer.getOfficerPassword()));
		txOfficer.setOfficerRoleId(officer.getOfficerRoleId());
		txOfficer.setOfficerStatus(LookupConstant.LK_STATUS_ACTIVE);
		
		txOfficerRepository.save(txOfficer);
		
		return true;
		
	}
}
