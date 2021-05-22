package com.mohit.lc.api;

import java.math.BigDecimal;

public class Amount {
	private BigDecimal billAmount;
	private String localeDefintion;

	public BigDecimal getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(BigDecimal billAmount) {
		this.billAmount = billAmount;
	}

	public String getLocaleDefintion() {
		return localeDefintion;
	}

	public void setLocaleDefintion(String localeDefintion) {
		this.localeDefintion = localeDefintion;
	}

	@Override
	public String toString() {
		return getBillAmount() + " " + getLocaleDefintion();
	}
}
