package com.ku.dku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.ProfileRequest;
import com.ku.dku.bean.ProfileResponse;
import com.ku.dku.entity.MsFile;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.TxStudentRepository;
import com.ku.dku.service.FileService;
import com.ku.dku.service.ProfileService;

@RestController
@RequestMapping(value = "/user/auth")
public class ProfileController {
	@Autowired private TxStudentRepository txStudentRepository;
	@Autowired private ProfileService profileService;
	@Autowired private FileService fileService;
	
	@RequestMapping(value = "/profile",method = RequestMethod.POST)
	public @ResponseBody ProfileResponse profile(@RequestBody ProfileRequest request ) {
		ProfileResponse response = new ProfileResponse();
		
		TxStudent txStudent = profileService.profile(request.getStudentIdRequest());
		
		response.setStudentFname(txStudent.getStudentFname());
		response.setStudentLname(txStudent.getStudentLname());
		response.setRecId(txStudent.getRecId());
		response.setStudentFaculty(txStudent.getStudentFaculty());
		response.setStudentRoom(txStudent.getStudentRoom());
		response.setStudentBranch(txStudent.getStudentBranch());
		response.setStudentId(txStudent.getStudentId());
		response.setLoginDate(txStudent.getStudentLogindate());
		
		//getFiles
		MsFile files = fileService.getFile(txStudent.getStudentId());
		response.setFileData(files.getFileData());
		response.setFileName(files.getFileName());
		
		return response;
	}
	
}
