package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.TxUtilityBill;

public interface TxUtilityBillRepository extends JpaRepository<TxUtilityBill,Long> {

	TxUtilityBill findByRecId(long recId);
	
}
