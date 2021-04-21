package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.LkBuilding;

public interface LkBuildingRepository extends JpaRepository<LkBuilding,Long> {

	LkBuilding findByRecId(long recId);
	
	LkBuilding findByBuildingId(long buildingId);
	
	
}
