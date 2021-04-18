package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.TxOfficer;

public interface TxOfficerRepository extends JpaRepository<TxOfficer, Long> {

	TxOfficer findByRecId(long recId);
	
	
	
	TxOfficer findByOfficerEmail(String officerEmail);
	
	TxOfficer findByOfficerOtp(String officerOtp);
	
	TxOfficer findByOfficerUsername(String officerUserName);
}
