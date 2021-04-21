package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ku.dku.entity.MsFee;
import com.ku.dku.entity.TxBail;

public interface MsFeeRepository extends JpaRepository<MsFee, Long> {

	MsFee findByRecId(long rceId);
	
	@Query(value = "SELECT * FROM ms_fee WHERE " + "term_id = :termId AND "+ "type_id = :typeId ", nativeQuery = true)
	public MsFee findByTermIdANDTypeId(@Param("termId") long termId, @Param("typeId") long typeId); 
	
	
}
