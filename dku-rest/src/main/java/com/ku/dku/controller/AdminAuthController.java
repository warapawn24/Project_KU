package com.ku.dku.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ku.dku.bean.AdminCheckOTPRequest;
import com.ku.dku.bean.AdminForgotPasswordRequest;
import com.ku.dku.bean.AdminForgotPasswordResponse;
import com.ku.dku.bean.AdminSendOtpRequest;
import com.ku.dku.entity.TxOfficer;
import com.ku.dku.repository.TxOfficerRepository;
import com.ku.dku.service.NotificationService;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/adminAuth")
public class AdminAuthController {

	@Autowired private NotificationService notificationService;
	@Autowired private TxOfficerRepository txOfficerRepository;
	@Autowired private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	private org.slf4j.Logger logger = LoggerFactory.getLogger(AdminAuthController.class);
	
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
