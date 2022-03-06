package com.rohan.spring.springcore.constructorinjection.ambiguity;

public class Addition {

	Addition(int num1, double num2) {
		System.out.println("Inside Constuctor INT");
		System.out.println(num1);
		System.out.println(num2);
	}

	Addition(double num1, double num2) {
		System.out.println("Inside Constuctor Double");
	}

	Addition(String num1, String num2) {
		System.out.println("Inside Constuctor String");
	}

}
