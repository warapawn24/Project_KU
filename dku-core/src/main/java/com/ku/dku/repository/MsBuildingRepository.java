package com.ku.dku.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ku.dku.entity.MsBuilding;

public interface MsBuildingRepository extends JpaRepository<MsBuilding, Long> {
	MsBuilding findByRecId(long recId);
	Iterable<MsBuilding>  findByBuildingId(long buildingId);

	@Query(value = "SELECT * " + "FROM ms_building " + "WHERE " + "building_id = :code " + "AND "
			+ "rom_floor = :roomFloor " + "ORDER BY " + "rec_id ASC ", nativeQuery = true)
	Iterable<MsBuilding> findAllByRecIdOrderByRecIdASC(@Param("code") long buildingId,@Param("roomFloor") long roomFloor);
	
	@Query("FROM MsBuilding")
	List<MsBuilding> findAllOrderByMsBuildingASC(Sort sort);
}
