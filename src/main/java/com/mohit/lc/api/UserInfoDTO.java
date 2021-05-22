package com.mohit.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = "User name can't be empty")
	@Size(min = 3, max = 15, message = "Your name should have characters between 3-15")
	private String userName;
	@NotBlank(message = "Crush name can't be empty")
	@Size(min = 3, max = 15, message = "Crush name should have characters between 3-15")
	private String crushName;
	@AssertTrue(message = "Please accept TnC")
	private boolean acceptTnC;

	private String result;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}

	public boolean isAcceptTnC() {
		return acceptTnC;
	}

	public void setAcceptTnC(boolean acceptTnC) {
		this.acceptTnC = acceptTnC;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
