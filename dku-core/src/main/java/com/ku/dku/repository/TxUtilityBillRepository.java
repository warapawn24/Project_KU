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
	
	//keyword
	@Query(value = "SELECT * " + "FROM tx_utility_bill " + "WHERE " + "student_id LIKE CONCAT('%' ,:key ,'%') OR "
			+ "student_fname LIKE CONCAT('%' ,:key ,'%') OR " + "student_lname LIKE CONCAT('%' ,:key ,'%') HAVING " 
			+ "utility_status = :code OR " + "utility_status = :code2 "
			+ "ORDER BY " + "rec_id DESC " + "LIMIT 0,1", nativeQuery = true)
	Iterable<TxUtilityBill> findTxUtilityBillByKeywordDESC(@Param("key") String key, @Param("code") String status,
			@Param("code2") String status2);
}
