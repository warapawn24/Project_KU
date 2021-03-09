package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.TxReserve;

public interface TxReserveRepository extends JpaRepository<TxReserve,Long> {

	TxReserve findByRecId(long recId);
}
