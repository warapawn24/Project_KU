package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.TxBail;
import com.ku.dku.entity.TxStudent;

public interface TxStudentRepository extends JpaRepository<TxStudent, Long>{
	
	TxStudent findByStudentUsername(String StudentUsername);
	TxStudent findByRecId(long recId);
	
	
	TxStudent findByStudentId(long studentId);
	
	

}
