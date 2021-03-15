package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.LkTerm;

public interface LkTermRepository extends JpaRepository<LkTerm,Long> {

	LkTerm findByRecId(long recId);
	
	LkTerm findByTermId(long termId);
}
