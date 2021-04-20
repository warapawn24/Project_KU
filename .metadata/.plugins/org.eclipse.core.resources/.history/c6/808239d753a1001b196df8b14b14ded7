package com.ku.dku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ku.dku.entity.MsBuilding;
import com.ku.dku.entity.MsBuildingOne;
import com.ku.dku.repository.MsBuildingEightRepository;
import com.ku.dku.repository.MsBuildingFiveRepository;
import com.ku.dku.repository.MsBuildingFourRepository;
import com.ku.dku.repository.MsBuildingOneRepository;
import com.ku.dku.repository.MsBuildingRepository;
import com.ku.dku.repository.MsBuildingSevenRepository;
import com.ku.dku.repository.MsBuildingSixRepository;
import com.ku.dku.repository.MsBuildingThreeRepository;
import com.ku.dku.repository.MsBuildingTwoRepository;

@Service
public class BuildingService {
	
	@Autowired private MsBuildingEightRepository msBuildingEightRepository;
	@Autowired private MsBuildingFiveRepository msBuildingFiveRepository;
	@Autowired private MsBuildingFourRepository msBuildingFourRepository;	
	@Autowired private MsBuildingOneRepository	msBuildingOneRepository;
	@Autowired private MsBuildingSevenRepository msBuildingSevenRepository;
	@Autowired private MsBuildingSixRepository msBuildingSixRepository;
	@Autowired private MsBuildingThreeRepository msBuildingThreeRepository;
	@Autowired private MsBuildingTwoRepository msBuildingTwoRepository;
	
	
	//GetNumber
	public boolean getNumber (long requestBuildingId,long roomId) {
		
		Integer buildingId = (int) requestBuildingId;
		switch (buildingId) {
		
		 case 1:

			 	MsBuildingOne msBuildingOne = msBuildingOneRepository.findByRoomId(roomId);
			 	
			 	
			    break;
		}
		
		
		
		return false;
		
	}

		
}
