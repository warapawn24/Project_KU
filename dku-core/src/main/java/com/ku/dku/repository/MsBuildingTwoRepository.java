package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ku.dku.entity.MsBuildingTwo;

public interface MsBuildingTwoRepository extends JpaRepository<MsBuildingTwo, Long> {

	MsBuildingTwo findByRecId(long recId);
	MsBuildingTwo findByBuildingId(long buildingId);
	MsBuildingTwo findByRoomId(long roomId); 
}
