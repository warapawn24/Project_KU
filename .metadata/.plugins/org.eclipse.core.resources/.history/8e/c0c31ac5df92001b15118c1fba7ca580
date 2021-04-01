package com.ku.dku.controller;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Logout")
public class LogoutController {

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String check(HttpServletRequest request) {
		JSONObject check = new JSONObject();
		try {
			request.getSession().removeAttribute("username");
		} catch (Exception e) {
			check.put("status", "Notsuccess");
			return check.toString();
		}

		check.put("status", "logoutSuccess");
		return check.toString();

	}
}
