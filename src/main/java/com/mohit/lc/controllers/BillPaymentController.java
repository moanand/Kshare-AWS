package com.mohit.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mohit.lc.api.Bill;

@Controller
public class BillPaymentController {

	@RequestMapping("/payment")
	public String payCreditCardBill(@ModelAttribute("cardInfo") Bill bill) {
		return "bill-page";
	}

	@RequestMapping("/generate-bill")
	public String showSuccessBillPage(@ModelAttribute("cardInfo") Bill bill) {
		return "bill-success-page";
	}
}
