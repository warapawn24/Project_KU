package com.ku.dku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ku.dku.entity.MsBuilding;
import com.ku.dku.repository.MsBuildingRepository;

@Service
public class BuildingService {
	
	@Autowired private MsBuildingRepository msBuildingRepository;
	
	public Iterable<MsBuilding> listBuilding(long buildingId,long roomFloor){
		
		Iterable<MsBuilding> getListBuilding = msBuildingRepository.findAllByRecIdOrderByRecIdASC(buildingId,roomFloor);
		
		return getListBuilding;
		
	}
	
	// SortSaleId
		public Iterable<MsBuilding> listAllBuilding() {
			return msBuildingRepository.findAll();
		}


		
}
