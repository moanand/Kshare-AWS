package com.mohit.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mohit.lc.api.CommunicationDTO;
import com.mohit.lc.api.Phone;
import com.mohit.lc.api.UserRegistrationInfoDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegisterationPage(@ModelAttribute("userRegInfo") UserRegistrationInfoDTO userRegInfoDTO) {
		// Load saved user data from the database
		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("123456789");

		CommunicationDTO dto = new CommunicationDTO();
		dto.setPhone(phone);

		userRegInfoDTO.setCommunicationDTO(dto);
		return "registration-page";
	}

	@RequestMapping("/register-success")
	public String registerSuccessPage(@Valid @ModelAttribute("userRegInfo") UserRegistrationInfoDTO userInfoDTOs,
			BindingResult result) {
		if (result.hasErrors()) {
			List<ObjectError> allErrors = result.getAllErrors();
			allErrors.forEach(System.out::println);

			return "registration-page";
		}
		return "registeration-success";
	}

}
