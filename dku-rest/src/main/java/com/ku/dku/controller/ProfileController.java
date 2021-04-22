package com.ku.dku.controller;

import java.text.ParseException;
import java.util.List;

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

import com.ku.dku.bean.AdminUpdateDataStudentRequest;
import com.ku.dku.bean.AdminUpdateDataStudentResponse;
import com.ku.dku.bean.FileStatusResponse;
import com.ku.dku.bean.ListAdminUpdateDataStudentRequest;
import com.ku.dku.bean.ProfileRequest;
import com.ku.dku.bean.ProfileResponse;
import com.ku.dku.constant.LookupConstant;
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
	
	//adminUpdateData
	@RequestMapping(value = "/adminUpdateData",method = RequestMethod.POST)
	public @ResponseBody AdminUpdateDataStudentResponse update(@RequestBody ListAdminUpdateDataStudentRequest request) throws ParseException {
		
		AdminUpdateDataStudentResponse response = new AdminUpdateDataStudentResponse();
		
		List<AdminUpdateDataStudentRequest> studentDataRequest = request.getStudentDataRequest();
		
		boolean updateData = profileService.updateStudentData(studentDataRequest);	
		if (updateData) {
			response.setStatusResponse(LookupConstant.RESPONSE_STATUS_SUCCESS);
		}else {
			response.setStatusResponse(LookupConstant.RESPONSE_STATUS_FAILED);
		}
		
		return response;
		
		
	}
	
	
	@PostMapping(value = "/uploadFile")
	public ResponseEntity<FileStatusResponse> uploadFile(@RequestParam("file") MultipartFile file) {
		String message = "";

		try {
			fileService.storeOther(file);
			message = "Uploaded the file successfully: " + file.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.OK).body(new FileStatusResponse(message));

		} catch (Exception e) {
			message = "Could not upload the file: ";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new FileStatusResponse(message));
		}

	}
}
