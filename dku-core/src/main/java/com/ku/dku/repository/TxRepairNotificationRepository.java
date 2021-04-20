package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ku.dku.entity.TxRepairNotification;

public interface TxRepairNotificationRepository extends JpaRepository<TxRepairNotification, Long> {
	TxRepairNotification findByRecId(long recId);
	
	TxRepairNotification findByStudentId(long studentId);
	
	// GetหาตามStatusที่กำหนด
		@Query(value = "SELECT * " + "FROM tx_repair_notification " + "WHERE " + "repair_status = :code " + "ORDER BY "
				+ "rec_id DESC ", nativeQuery = true)
		Iterable<TxRepairNotification> findAllByRepairStatusOrderByRecIdDESC(@Param("code") String status);
	
		// GetหาตามStatusที่กำหนด
				@Query(value = "SELECT * " + "FROM tx_repair_notification " + "WHERE " + "repair_list LIKE CONCAT('%' ,:key ,'%') " + "HAVING "+ "repair_status = :code " + "ORDER BY "
						+ "rec_id DESC ", nativeQuery = true)
				Iterable<TxRepairNotification> findAllByRepairStatusAndListOrderByRecIdDESC(@Param("code") String status,@Param("key") String keyword);	
	
	// GetหาตามStusent,Statusที่กำหนด
	@Query(value = "SELECT * " + "FROM tx_repair_notification " + "WHERE "+ "student_id = :studentId HAVING " + "repair_status = :code " + "ORDER BY "
						+ "rec_id DESC ", nativeQuery = true)
	Iterable<TxRepairNotification> findByStudentIdHAVINGRepairStatusOrderByRecIdDESC(@Param("studentId") long studentId,@Param("code") String status);
}
