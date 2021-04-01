package com.ku.dku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.AddOfficerProfileRequest;
import com.ku.dku.bean.AddOfficerProfileResponse;
import com.ku.dku.entity.TxOfficer;
import com.ku.dku.service.AdminProfileService;

@RestController
@RequestMapping(value = "/adminProfile")
public class AdminProfileController {

	@Autowired private AdminProfileService adminProfileService;
	
	@RequestMapping(value = "/updateProfile",method = RequestMethod.POST)
	public @ResponseBody AddOfficerProfileResponse updateProfile(@RequestBody AddOfficerProfileRequest request) {
		
		AddOfficerProfileResponse response = new AddOfficerProfileResponse();
		
		TxOfficer txOfficer = new TxOfficer();
		txOfficer.setOfficerEmail(request.getOfficerEmail());
		txOfficer.setOfficerFname(request.getOfficerFname());
		txOfficer.setOfficerLname(request.getOfficerLname());
		txOfficer.setOfficerUsername(request.getOfficerUsername());
		txOfficer.setOfficerPassword(request.getOfficerPassword());
		txOfficer.setOfficerRoleId(request.getOfficerRoleId());
		
		if (request.getOfficerPassword().equals(request.getConfirmPassword())) {
		boolean update = adminProfileService.updateOfficer(txOfficer);
		
			
			if (update) {
				response.setStatusResponse("success");
			}
			else {
				response.setStatusResponse("failed");
			}
		}else {
			response.setStatusResponse("password not match");
		}
		
		return response;
		
	}
}
