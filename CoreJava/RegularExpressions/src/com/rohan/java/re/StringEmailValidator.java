package com.rohan.java.re;

public class StringEmailValidator {

	public static void main(String[] args) {

		String email = "rohan.nag@gmail.com";

		if (email.matches("^[a-zA-Z0-9]+[_.-]+\\w+@[a-zA-Z0-9_.-]+\\w+$")) {
			System.out.println("Valid email ID");
		} else {
			System.out.println("Invalid email");
		}

	}

}
