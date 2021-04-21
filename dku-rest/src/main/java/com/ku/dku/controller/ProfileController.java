package com.ku.dku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
//		response.setFileData(files.getFileData());
		response.setFileType(files.getFileType());
		response.setFileName(files.getFileName());
		
		return response;
	}
	
	@GetMapping("/getFile")
	public ResponseEntity<byte[]> getFile(@RequestParam("studentId") long txStudentId) {
		MsFile file = fileService.getFile(txStudentId);

		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFileName() + "\"")
				.body(file.getFileData());
	}
}
