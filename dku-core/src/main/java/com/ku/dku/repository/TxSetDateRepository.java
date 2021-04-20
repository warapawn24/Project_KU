package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ku.dku.entity.TxSetDate;

public interface TxSetDateRepository extends JpaRepository<TxSetDate, Long> {
	
	TxSetDate findByRecId(long recId);
	
	@Query(value = "SELECT * " + "FROM tx_set_date " + "ORDER BY " + "rec_id DESC "
			+ "LIMIT 0,1",nativeQuery = true)
	TxSetDate TopTxSetDateOrderByRecIdDESC();
	
	@Query(value = "SELECT * " + "FROM tx_set_date " + "WHERE " + "set_status = :status" ,nativeQuery = true)
	TxSetDate findBySetStatus(@Param("status") String status);
	
}
