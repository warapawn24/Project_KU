package com.ku.dku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ku.dku.bean.AddOfficerProfileRequest;
import com.ku.dku.bean.AddOfficerProfileResponse;
import com.ku.dku.bean.ChangeOfficerStatusRequest;
import com.ku.dku.bean.ChangeOfficerStatusResponse;
import com.ku.dku.bean.FileStatusResponse;
import com.ku.dku.bean.ShowInfoRequest;
import com.ku.dku.bean.ShowInfoResponse;
import com.ku.dku.entity.LkRole;
import com.ku.dku.entity.MsFile;
import com.ku.dku.entity.TxOfficer;
import com.ku.dku.repository.LkRoleRepository;
import com.ku.dku.repository.MsFileRepository;
import com.ku.dku.service.AdminProfileService;
import com.ku.dku.service.FileService;

@RestController
@RequestMapping(value = "/adminProfile")
public class AdminProfileController {

	@Autowired private AdminProfileService adminProfileService;
	@Autowired private LkRoleRepository lkRoleRepository;
	@Autowired private FileService fileService;
	
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
	
	@RequestMapping(value = "/showInfo",method = RequestMethod.POST)
	public @ResponseBody ShowInfoResponse showInfo(@RequestBody ShowInfoRequest request) {
		
		ShowInfoResponse response = new ShowInfoResponse();
		
		TxOfficer findByOfficerId = adminProfileService.findByOfficerId(request.getOfficerId());
		
		response.setOfficerId(findByOfficerId.getRecId());
		response.setOfficerFname(findByOfficerId.getOfficerFname());
		response.setOfficerLname(findByOfficerId.getOfficerLname());
		response.setOfficerStatus(findByOfficerId.getOfficerStatus());
		//หาrole
		LkRole role = lkRoleRepository.findByRecId(findByOfficerId.getOfficerRoleId());
		
		response.setOfficerRole(role.getRoleName());
		response.setOfficerEmail(findByOfficerId.getOfficerEmail());
		
		return response;
	}
	
	@RequestMapping(value = "/changeOfficerStatus",method = RequestMethod.POST)
	public @ResponseBody ChangeOfficerStatusResponse change(@RequestBody ChangeOfficerStatusRequest request) {
		ChangeOfficerStatusResponse response = new ChangeOfficerStatusResponse();
		
		TxOfficer txOfficer = new TxOfficer();
		txOfficer.setRecId(request.getOfficerId());
		txOfficer.setOfficerStatus(request.getOfficerStatus());
		
		boolean changeStatus = adminProfileService.changeOfficerStatus(txOfficer);
		
		if (changeStatus) {
			response.setStatusResponse("success");
		}else {
			response.setStatusResponse("failed");
		}
		
		return response;
	}
	
	
	@PostMapping(value = "/uploadFile")
	public ResponseEntity<FileStatusResponse> uploadFile(@RequestParam("file") MultipartFile file,
			@RequestParam("studentId") long txStudentId) {
		String message = "";

		try {
			fileService.store(file, txStudentId);
			message = "Uploaded the file successfully: " + file.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.OK).body(new FileStatusResponse(message));

		} catch (Exception e) {
			message = "Could not upload the file: ";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new FileStatusResponse(message));
		}

	}
	
	
	
	@GetMapping("/getFile")
	public ResponseEntity<byte[]> getFile(@RequestParam("studentId") long txStudentId) {
		MsFile file = fileService.getFile(txStudentId);

		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFileName() + "\"")
				.body(file.getFileData());
	}
}
