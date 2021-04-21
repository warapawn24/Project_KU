package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.MsBuildingEight;




public interface MsBuildingEightRepository extends JpaRepository<MsBuildingEight, Long> {

	MsBuildingEight findByRecId(long recId);
	MsBuildingEight findByBuildingId(long buildingId);
	
	MsBuildingEight findByRoomId(long roomId);
	
	Iterable<MsBuildingEight> findByFloorId(long floorId);
}
