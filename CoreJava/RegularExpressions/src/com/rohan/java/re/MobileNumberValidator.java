package com.rohan.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberValidator {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("^\\d{10}$");
		Matcher matcher = pattern.matcher("6784651232");

		if (matcher.matches()) {
			System.out.println("Valid Mobile Number");
		} else {
			System.out.println("Invalid Mobile Number");
		}

		String mobileNumber = "+916459781230";
		if (mobileNumber.matches("^[+]?\\d{2}\s?\\d{10}$")) {
			System.out.println("Valid Mobile Number: " + mobileNumber);
		} else {
			System.out.println("Invalid Mobile Number: " + mobileNumber);
		}

	}

}
