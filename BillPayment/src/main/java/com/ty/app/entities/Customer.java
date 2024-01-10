package com.ty.app.entities;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	private String customerId;
	private String customerNamee;
	private String caddress;
	private String rrnumber;
	private String unitConsumed;
	private String billAmount;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerNamee() {
		return customerNamee;
	}

	public void setCustomerNamee(String customerNamee) {
		this.customerNamee = customerNamee;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getRrnumber() {
		return rrnumber;
	}

	public void setRrnumber(String rrnumber) {
		this.rrnumber = rrnumber;
	}

	public String getUnitConsumed() {
		return unitConsumed;
	}

	public void setUnitConsumed(String unitConsumed) {
		this.unitConsumed = unitConsumed;
	}

	public String getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}

}
