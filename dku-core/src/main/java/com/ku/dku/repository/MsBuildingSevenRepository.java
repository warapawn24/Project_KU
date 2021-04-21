package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ku.dku.entity.MsBuildingSeven;


public interface MsBuildingSevenRepository extends JpaRepository<MsBuildingSeven, Long> {

	MsBuildingSeven findByRecId(long recId);
	MsBuildingSeven findByBuildingId(long buildingId);
	
	MsBuildingSeven findByRoomId(long roomId);
	
	Iterable<MsBuildingSeven> findByFloorId(long floorId);
}
