package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ku.dku.entity.TxReserve;
import com.ku.dku.entity.TxSetDate;


public interface TxReserveRepository extends JpaRepository<TxReserve,Long> {

	TxReserve findByRecId(long recId);
	
	//keyword
		@Query(value = "SELECT * " + "FROM tx_reserve " + "WHERE " + "student_id LIKE CONCAT('%' ,:key ,'%') OR "
				+ "student_fname LIKE CONCAT('%' ,:key ,'%') OR " + "student_lname LIKE CONCAT('%' ,:key ,'%') HAVING " 
				+ "reserve_status = :code OR " + "reserve_status = :code2 "
				+ "ORDER BY " + "rec_id DESC "+ "LIMIT 0,1" , nativeQuery = true)
		public Iterable<TxReserve> findTxReserveByKeywordDESC(@Param("key") String key, @Param("code") String status,
				@Param("code2") String status2);
		
		@Query(value = "SELECT * " + "FROM tx_reserve " + "WHERE " + "room_id = :roomId "+ "ORDER BY " + "rec_id DESC " ,nativeQuery = true)
		Iterable<TxReserve> findByRoomIdODERBYRecIdDESC(@Param("roomId") long roomId);
}
