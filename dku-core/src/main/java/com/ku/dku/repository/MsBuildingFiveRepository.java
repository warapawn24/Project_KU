package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ku.dku.entity.MsBuildingFive;


public interface MsBuildingFiveRepository extends JpaRepository<MsBuildingFive, Long> {

	MsBuildingFive findByRecId(long recId);
	MsBuildingFive findByBuildingId(long buildingId);
	
	MsBuildingFive findByRoomId(long roomId);
}
