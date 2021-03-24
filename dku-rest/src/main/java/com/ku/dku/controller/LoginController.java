package com.ku.dku.controller;


import javax.annotation.RegEx;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.LoginRequest;
import com.ku.dku.bean.LoginResponse;
import com.ku.dku.entity.MsFile;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.TxStudentRepository;
import com.ku.dku.service.FileService;
import com.ku.dku.service.LoginService;

@RestController
@RequestMapping(value = "/demo")
public class LoginController {

	@Autowired private LoginService loginService;
	@Autowired private TxStudentRepository studentRepository;
	@Autowired private FileService fileService;
	

	@RequestMapping(value = "/check")
	public String loginSes(HttpServletRequest request) {
		JSONObject obj = new JSONObject();
		obj.put("username", request.getSession().getAttribute("username"));

		return obj.toString();

	}
	
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public @ResponseBody LoginResponse login(@RequestBody LoginRequest request,HttpServletRequest req) {
		LoginResponse response = new LoginResponse();
		
		TxStudent txStudent = new TxStudent();
		txStudent.setStudentUsername(request.getStudentUsername());
		txStudent.setStudentPassword(request.getStudentPassword());
		boolean login = loginService.login(txStudent);
		
		String getData = txStudent.getStudentUsername();
		if (login) {
			
			TxStudent getTxStudent = studentRepository.findByStudentUsername(getData);
			
			req.getSession().setAttribute("username", getTxStudent.getStudentUsername());
			req.getSession().setAttribute("studentFname", getTxStudent.getStudentFname());
			req.getSession().setAttribute("studentLname", getTxStudent.getStudentLname());
			response.setStudentIdResponse(getTxStudent.getStudentId());
			response.setStudentFnameResponse(getTxStudent.getStudentFname());
			response.setStudentLnameResponse(getTxStudent.getStudentLname());
			response.setStatusResponse("success");
			
			//getFiles
			MsFile files = fileService.getFile(getTxStudent.getStudentId());
			response.setFileData(files.getFileData());
			response.setFileName(files.getFileName());
		}
		else {
			response.setStatusResponse("failed");
		}
		return response;
	}
}
