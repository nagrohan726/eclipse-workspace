package com.rohan.cnp.model;

import java.math.BigDecimal;

public class Coupon {

	private int id;
	private String code;
	private BigDecimal discount;
	private String expDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	@Override
	public String toString() {
		return "<h1>Coupon Details</h1><b>ID:</b> " + id + "<br/><b>Coupon code:</b> " + code + "<br/><b>Discount:</b> "
				+ discount + "<br/><b>Expiry Date:</b> " + expDate;
	}

}
