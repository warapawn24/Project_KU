package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.MsFile;

public interface MsFileRepository extends JpaRepository<MsFile, Long> {

	MsFile findByRecId(long recId);
	
	MsFile findByTxStudentId(long txStudentId);
}
