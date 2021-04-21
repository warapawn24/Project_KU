package com.ku.dku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.AdminCheckOTPRequest;
import com.ku.dku.bean.AdminForgotPasswordRequest;
import com.ku.dku.bean.AdminForgotPasswordResponse;
import com.ku.dku.bean.AdminLoginRequest;
import com.ku.dku.bean.AdminLoginResponse;
import com.ku.dku.bean.AdminSendOtpRequest;
import com.ku.dku.bean.ChangePasswordRequest;
import com.ku.dku.bean.ChangePasswordResponse;
import com.ku.dku.bean.LoginRequest;
import com.ku.dku.bean.LoginResponse;
import com.ku.dku.entity.LkRole;
import com.ku.dku.entity.MsFile;
import com.ku.dku.entity.TxOfficer;
import com.ku.dku.entity.TxStudent;
import com.ku.dku.repository.LkRoleRepository;
import com.ku.dku.repository.TxOfficerRepository;
import com.ku.dku.service.LoginService;
import com.ku.dku.service.NotificationService;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(value = "/adminAuth")
public class AdminAuthController {

	@Autowired private NotificationService notificationService;
	@Autowired private TxOfficerRepository txOfficerRepository;
	@Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired private LoginService loginService;
	@Autowired private LkRoleRepository lkRoleRepository;
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(AdminAuthController.class);
	
	//login
	@CrossOrigin(origins = "http://192.168.43.126:8080")
	@RequestMapping(value = "/adminLogin",method = RequestMethod.POST)
	public @ResponseBody AdminLoginResponse adminlogin(@RequestBody AdminLoginRequest request, HttpServletRequest req ) {
		AdminLoginResponse response = new AdminLoginResponse();
		
		try {
		TxOfficer txOfficer = new TxOfficer();
		txOfficer.setOfficerUsername(request.getOfficerUsername());
		txOfficer.setOfficerPassword(request.getOfficerPassword());
		boolean login = loginService.adminLogin(txOfficer,request.getLoginFrom());
		
			
		String getData = txOfficer.getOfficerUsername();
		if (login) {
			
			TxOfficer getTxOfficer = txOfficerRepository.findByOfficerUsername(getData);			
			
			req.getSession().setAttribute("username", getTxOfficer.getOfficerUsername());
			req.getSession().setAttribute("officerFname",getTxOfficer.getOfficerFname());
			req.getSession().setAttribute("officerLname", getTxOfficer.getOfficerLname());
			req.getSession().setAttribute("officerId",getTxOfficer.getRecId());
			
			System.out.println(req.getSession().getAttribute("username"));
			System.out.println("Hello");
			
			response.setOfficerIdResponse(getTxOfficer.getRecId());
			response.setOfficerFnameResponse(getTxOfficer.getOfficerFname());
			response.setOfficerLnameResponse(getTxOfficer.getOfficerLname());
			response.setOfficerLoginfirst(getTxOfficer.getOfficerLoginfirstchange());
			
			LkRole role = lkRoleRepository.findByRecId(getTxOfficer.getOfficerRoleId());
			response.setOfficerRole(role.getRoleName());
			
			response.setStatusResponse("success");
			
			//getFiles
//			MsFile files = fileService.getFile(getTxStudent.getStudentId());
////			response.setFileData(files.getFileData());
//			response.setFileType(files.getFileType());
//			response.setFileName(files.getFileName());
		}
			else {
			response.setStatusResponse("failed");
				}
		} catch (Exception e) {
			e.printStackTrace();
			response.setStatusResponse("longin failed");
		}
		
		return response;
	}
	
	// เปลี่ยนpassword
		@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
		public @ResponseBody ChangePasswordResponse changePassword(@RequestBody ChangePasswordRequest request) {
			ChangePasswordResponse response = new ChangePasswordResponse();

			TxOfficer officer = txOfficerRepository.findByRecId(request.getOfficerId());
			// มีid
			if (officer != null) {

				String oldPassword = officer.getOfficerPassword();
				
				// ชื่อเหมือนเดิมก็เปลี่ยนรหัสได้
				
					if (bCryptPasswordEncoder.matches(request.getOldPassword(), oldPassword)) {

						officer.setOfficerPassword(bCryptPasswordEncoder.encode(request.getNewPassword()));
						txOfficerRepository.save(officer);
						response.setStatusResponse("success");
					} else {

						response.setStatusResponse("Notsuccess");
					}
			}
//				// เปลี่ยนชื่อด้วย,เปลี่ยนรหัส
//				else {
//					if (finduserName == null) {
//
//						if (bCryptPasswordEncoder.matches(request.getOldPassword(), oldPassword)) {
//
//							user.setUserName(request.getUserName());
//							user.setUserPassword(bCryptPasswordEncoder.encode(request.getNewPassword()));
//							userRepository.save(user);
//							response.setStatusResponse("success");
//						} else {
//
//							response.setStatusResponse("Notsuccess");
//						}
//					} // ชื่อซ้ำ
//					else {
//						response.setStatusResponse("useUserName");
//					}
//				}
//
//			}
			// ไม่มีUserนั้น
			else {
				response.setStatusResponse("userNull");
			}

			return response;

		}
	
	@RequestMapping(value = "/sendOTP",method = RequestMethod.POST)
	public @ResponseBody AdminForgotPasswordResponse forgot(@RequestBody AdminSendOtpRequest request) {
		AdminForgotPasswordResponse response = new AdminForgotPasswordResponse();
		
		TxOfficer txOfficer = txOfficerRepository.findByOfficerEmail(request.getOfficerEmail());
		if (txOfficer != null) {
			try {
				notificationService.sendMail(txOfficer);
				response.setStatusResponse("success");

			} catch (Exception e) {
				logger.info("Error" + e.getMessage());
				response.setStatusResponse("Notsuccess");
			}
		} else {
			response.setStatusResponse("EmailNull");
		}
		
		
		return response;
		
	}
	
	@RequestMapping(value = "/checkOTP",method = RequestMethod.POST)
	public @ResponseBody AdminForgotPasswordResponse checkOTP(@RequestBody AdminCheckOTPRequest request) {
		AdminForgotPasswordResponse response = new AdminForgotPasswordResponse();

		TxOfficer txOfficer = txOfficerRepository.findByOfficerEmail(request.getEmail());
		if (txOfficer != null) {
			TxOfficer officerOtp = txOfficerRepository.findByOfficerOtp(request.getOtpCode());

		if (officerOtp != null) {
			
			
			System.out.println("Otp: " + officerOtp.getOfficerOtp());
			if (officerOtp.getOfficerOtp().equals(request.getOtpCode())&& officerOtp.getOfficerEmail().equals(request.getEmail())) {
				response.setStatusResponse("match");
			} else {
				response.setStatusResponse("Notmatch");
			}
	//ifOTP		
		}else {
			response.setStatusResponse("Notmatch");
		}

			} else {
			response.setStatusResponse("UserEmailNull");
		}
		return response;
	}
	
	// ที่ใส่รหัสOTP
		@RequestMapping(value = "/forgotPassword",method = RequestMethod.POST)
		public @ResponseBody AdminForgotPasswordResponse forgotPassword(@RequestBody AdminForgotPasswordRequest request) {
			AdminForgotPasswordResponse response = new AdminForgotPasswordResponse();
			
			TxOfficer txOfficer = txOfficerRepository.findByOfficerEmail(request.getOfficerEmail());
			
			if (txOfficer!=null) {
				
				if (request.getNewPassword().equals(request.getConfirmPassword())) {
					txOfficer.setOfficerPassword(bCryptPasswordEncoder.encode(request.getNewPassword()));
					txOfficerRepository.save(txOfficer);
					
					response.setStatusResponse("success");
				}else {
					response.setStatusResponse("password Notmatch");
				}
				
			}else {
				response.setStatusResponse("UserEmailNull");
			}
			
			return response;
			
		}
		
		
}
