package com.mohit.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.mohit.lc.api.Phone;

public class PhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("Inside print method of formatter...");
		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String phoneText, Locale locale) throws ParseException {
		Phone phone = new Phone();
		// Split the string received from the user
		String[] p = phoneText.split("-");

		// check if phone number/string contains "-"
		int index = phoneText.indexOf("-");

		// If the string doesn't have a "-" or starts with "-", add 91 before it
		if (index == -1 || phoneText.startsWith("-")) {
			// If the "-" is not found, then add 91 as the default country code
			phone.setCountryCode("91");

			if (phoneText.startsWith("-")) {
				phone.setUserNumber(p[1]);
			} else {
				phone.setUserNumber(p[0]);
			}
		} else {
			// Extract the country code and set it to the phone class COuntryCode Property
			phone.setCountryCode(p[0]);
			phone.setUserNumber(p[1]);
		}
		return phone;
	}

}
