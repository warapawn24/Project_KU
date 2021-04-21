package com.ku.dku.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ku.dku.entity.TxPost;


public interface TxPostRepository extends JpaRepository<TxPost,Long> {

	TxPost findByRecId(long recId);
	
	
	
	@Query(value = "SELECT * " + "FROM tx_post " + "WHERE " + "student_id = :code " + "ORDER BY "
			+ "rec_id DESC ", nativeQuery = true)
	Iterable<TxPost> findByStudentIdOrderByRecIdDESC(@Param("code") long studentId);
	
	//keyword
		@Query(value = "SELECT * " + "FROM tx_post " + "WHERE " + "student_id LIKE CONCAT('%' ,:key ,'%') OR "
				+ "student_fname LIKE CONCAT('%' ,:key ,'%') OR "+ "rec_id LIKE CONCAT('%' ,:key ,'%') OR " + "student_lname LIKE CONCAT('%' ,:key ,'%') HAVING " 
				+ "post_status = :code OR " + "post_status = :code2 "
				+ "ORDER BY " + "rec_id DESC " + "LIMIT 0,1", nativeQuery = true)
		public TxPost findTxPostByKeywordDESC(@Param("key") String key, @Param("code") String status,
				@Param("code2") String status2);
}
