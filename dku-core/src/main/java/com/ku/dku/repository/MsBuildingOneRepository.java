package com.ku.dku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ku.dku.entity.MsBuildingOne;

public interface MsBuildingOneRepository extends JpaRepository<MsBuildingOne, Long> {

	MsBuildingOne findByRecId(long recId);
	MsBuildingOne findByBuildingId(long buildingId);
	
	MsBuildingOne findByRoomId(long roomId);
}
