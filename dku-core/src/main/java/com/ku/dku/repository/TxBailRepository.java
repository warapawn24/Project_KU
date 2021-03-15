package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.TxBail;

public interface TxBailRepository extends JpaRepository<TxBail, Long> {

	TxBail findByRecId(long recId);
	
	TxBail findByStudentId(long studentId);
}
