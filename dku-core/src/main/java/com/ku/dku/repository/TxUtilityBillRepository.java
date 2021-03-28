package com.ku.dku.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ku.dku.entity.TxUtilityBill;

public interface TxUtilityBillRepository extends JpaRepository<TxUtilityBill,Long> {

	TxUtilityBill findByRecId(long recId);
	
	@Query(value = "SELECT * " + "FROM tx_utility_bill " + "WHERE " + "student_id = :studentId "+ "ORDER BY " + "rec_id ASC " + "LIMIT 0,3", nativeQuery = true)
	Iterable<TxUtilityBill> TopThreeStudentIdOrderByRecIdDESC(@Param("studentId") long studentId);
	
	@Query(value = "SELECT * " + "FROM tx_utility_bill "+ "WHERE " + "student_id = :studentId " + "ORDER BY " + "rec_id DESC "
			+ "LIMIT 0,1", nativeQuery = true)
	TxUtilityBill TopTxUtilityBillOrderByRecIdDESC(@Param("studentId") long studentId);
}
