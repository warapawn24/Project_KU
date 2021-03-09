package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.TxReserveDetail;

public interface TxReserveDetailRepository extends JpaRepository<TxReserveDetail,Long> {
	
	TxReserveDetail findByRecId(long recId);

}
