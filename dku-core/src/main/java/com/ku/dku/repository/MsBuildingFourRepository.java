package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ku.dku.entity.MsBuildingFour;


public interface MsBuildingFourRepository extends JpaRepository<MsBuildingFour,Long> {

	MsBuildingFour findByRecId(long recId);
	MsBuildingFour findByBuildingId(long buildingId);
	
	MsBuildingFour findByRoomId(long roomId);
}
