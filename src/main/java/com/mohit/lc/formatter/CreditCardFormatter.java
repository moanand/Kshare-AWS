package com.mohit.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.mohit.lc.api.CreditCard;

public class CreditCardFormatter implements Formatter<CreditCard> {

	@Override
	public String print(CreditCard card, Locale locale) {

		return null;
	}

	@Override
	public CreditCard parse(String cardText, Locale locale) throws ParseException {

		return null;
	}

}
