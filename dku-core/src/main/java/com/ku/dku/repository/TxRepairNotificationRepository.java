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
	
		
}
