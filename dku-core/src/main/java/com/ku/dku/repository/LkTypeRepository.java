package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.LkType;

public interface LkTypeRepository extends JpaRepository<LkType, Long> {
	
	LkType findByRecId(long recId);

}

