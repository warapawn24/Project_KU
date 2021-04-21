package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ku.dku.entity.MsBuildingThree;


public interface MsBuildingThreeRepository extends JpaRepository<MsBuildingThree,Long> {

	MsBuildingThree findByRecId(long recId);
	MsBuildingThree findByBuildingId(long buildingId);
	
	MsBuildingThree findByRoomId(long roomId); 
	
	Iterable<MsBuildingThree> findByFloorId(long floorId);
}
