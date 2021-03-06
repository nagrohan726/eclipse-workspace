package com.rohan.cnp.model;

import java.math.BigDecimal;

public class Product {

	private int id;
	private String name;
	private String description;
	private BigDecimal price;
	private String couponCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	@Override
	public String toString() {
		return "<h1>Product Details</h1><b>ID:</b> " + id + "<br/><b>Product Name:</b> " + name
				+ "<br/><b>Description:</b> " + description + "<br/><b>Coupon Code:</b> " + couponCode;
	}

}
