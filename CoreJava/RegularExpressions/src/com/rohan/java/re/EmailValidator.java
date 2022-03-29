package com.rohan.java.re;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+[_.-]+\\w+@[a-zA-Z0-9_.-]+$"); // ^[] -- start with
																						// $ -- end with
																						// \w -- [a-zA-Z0-9]+ -- 1 or
																						// more
		Matcher matcher = pattern.matcher("rohan.nag@gmail.com");

		if (matcher.matches()) {
			System.out.println("Valid email ID");
		} else {
			System.out.println("Invalid email");
		}

	}

}
