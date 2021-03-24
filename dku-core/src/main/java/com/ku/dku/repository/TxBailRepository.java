package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ku.dku.entity.TxBail;

public interface TxBailRepository extends JpaRepository<TxBail, Long> {

	TxBail findByRecId(long recId);
	
	TxBail findByStudentId(long studentId);
	
	@Query(value = "SELECT * FROM tx_student WHERE " + "student_id = :studentId " + "HAVING "
			+ "bail_status = :status ", nativeQuery = true)
	public TxBail findByStudentIdHAVINGBailStatus(@Param("studentId") long studentId, @Param("status") String status); 
	
	
}
