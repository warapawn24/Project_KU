package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ku.dku.entity.MsBuildingSix;

public interface MsBuildingSixRepository extends JpaRepository<MsBuildingSix, Long> {

	MsBuildingSix findByRecId(long recId);
	MsBuildingSix findByBuildingId(long buildingId);
	
	MsBuildingSix findByRoomId(long roomId); 
	Iterable<MsBuildingSix> findByFloorId(long floorId);
}
