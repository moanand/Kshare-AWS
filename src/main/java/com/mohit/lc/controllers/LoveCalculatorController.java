package com.mohit.lc.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mohit.lc.api.UserInfoDTO;
import com.mohit.lc.service.LcAppCalculatorService;

@Controller
@SessionAttributes("userInfo")
public class LoveCalculatorController {

	@Autowired
	private LcAppCalculatorService lcAppCalculatorService;

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("userInfo", new UserInfoDTO());
		return "home";
	}

	@RequestMapping("/process-homepage")
	public String showResultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result,
			HttpServletRequest request) {
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			allErrors.forEach(System.out::println);
			return "home";
		}
		String calculateResult = lcAppCalculatorService.calculateResult(userInfoDTO.getUserName(),
				userInfoDTO.getCrushName());
		HttpSession session = request.getSession();
		session.setAttribute("userName", userInfoDTO.getUserName());
		userInfoDTO.setResult(calculateResult);

		return "result";
	}

}
