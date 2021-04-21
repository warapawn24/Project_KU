package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.MsFileOther;

public interface MsFileOtherRepository extends JpaRepository<MsFileOther, Long> {

	MsFileOther findByRecId(long recId);
	
}
