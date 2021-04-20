package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.ku.dku.entity.TxSetDateBail;

public interface TxSetDateBailRepository extends JpaRepository<TxSetDateBail, Long> {

	TxSetDateBail findByRecId(long recId);
	
	@Query(value = "SELECT * " + "FROM tx_set_date_bail " + "ORDER BY " + "rec_id DESC "
			+ "LIMIT 0,1",nativeQuery = true)
	TxSetDateBail TopTxSetDateBailOrderByRecIdDESC();
}
