package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.TxBailType;

public interface TxBailTypeRepository extends JpaRepository<TxBailType, Long>{
	
	TxBailType findByRecId(long recId);
	
	TxBailType findByBailId(long bailId);
}
