package com.ku.dku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.BuildingDataRequest;
import com.ku.dku.bean.BuildingDataResponse;
import com.ku.dku.entity.MsBuilding;
import com.ku.dku.repository.MsBuildingRepository;
import com.ku.dku.service.BuildingService;

@RestController
@RequestMapping(value = "/user/buildiing")
public class BuildingController {
	
	@Autowired private BuildingService buildingService;
	@Autowired private MsBuildingRepository msBuildingRepository;
	

	@RequestMapping(value = "/listBuilding",method = RequestMethod.GET)
	public @ResponseBody Iterable<MsBuilding> getBuilding() {

		return msBuildingRepository.findAll();
	}
	
	
}
