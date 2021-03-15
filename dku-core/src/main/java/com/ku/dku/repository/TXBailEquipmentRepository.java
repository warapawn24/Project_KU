package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.TxBailEquipment;

public interface TXBailEquipmentRepository extends JpaRepository<TxBailEquipment, Long> {
	
	TxBailEquipment findByRecId(long recId);
	
	TxBailEquipment findByBailId(long bailId);

}
