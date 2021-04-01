package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.TxLoginStudent;

public interface TxLoginStudentRepository extends JpaRepository<TxLoginStudent,Long> {

	TxLoginStudent findByRecId(long recId);
	
	TxLoginStudent findByStudentId(long studentId);
}
