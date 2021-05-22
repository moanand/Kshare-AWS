package com.mohit.lc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.mohit.lc.api.EmailDTO;
import com.mohit.lc.api.UserInfoDTO;
import com.mohit.lc.service.LcAppCalculatorService;
import com.mohit.lc.services.LcAppEmailServiceImpl;

@Controller
public class EmailController {

	@Autowired
	private LcAppEmailServiceImpl lcAppEmailServiceImpl;

	@Autowired
	private LcAppCalculatorService lcAppCalculatorService;

	@RequestMapping("/send-email")
	public String showEmailPage(@ModelAttribute("emailInfo") EmailDTO email) {
		return "email-page";
	}

	@RequestMapping("/process-email")
	public String sendEmail(@SessionAttribute("userInfo") UserInfoDTO userInfoDTO,

			@ModelAttribute("email") EmailDTO email) {
		String result = lcAppCalculatorService.calculateResult(userInfoDTO.getUserName(), userInfoDTO.getCrushName());
		lcAppEmailServiceImpl.sendEmail(userInfoDTO.getUserName(), email.getUserEmail(), result);

		return "success-email-page";
	}
}
