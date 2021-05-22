
package com.mohit.lc.serviceImpl;

import org.springframework.stereotype.Service;

import com.mohit.lc.constants.LcAppConstant;
import com.mohit.lc.service.LcAppCalculatorService;

@Service
public class LcAppCalculatorServiceImpl implements LcAppCalculatorService {

	@Override
	public String calculateResult(String username, String crushname) {

		char ret;

		int length = (username + crushname).toCharArray().length;
		int baseFlameLength = LcAppConstant.LC_APP_CALCULATION_PARAMETER.toCharArray().length;

		int rem = length % baseFlameLength;
		if (rem == 0) {
			ret = 'F';
		} else {
			ret = LcAppConstant.LC_APP_CALCULATION_PARAMETER.charAt(rem);
		}

		String calculate = calculate(ret);

		return calculate;
	}

	public String calculate(int calResult) {

		String finalResult = null;

		if (calResult == 'L') {
			finalResult = LcAppConstant.L_CHAR_MEANING;
		} else if (calResult == 'A') {
			finalResult = LcAppConstant.A_CHAR_MEANING;
		} else if (calResult == 'M') {
			finalResult = LcAppConstant.M_CHAR_MEANING;
		} else if (calResult == 'E') {
			finalResult = LcAppConstant.E_CHAR_MEANING;
		} else if (calResult == 'S') {
			finalResult = LcAppConstant.S_CHAR_MEANING;
		}

		return finalResult;
	}

}
