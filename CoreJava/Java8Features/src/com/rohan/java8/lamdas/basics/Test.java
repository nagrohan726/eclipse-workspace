package com.rohan.java8.lamdas.basics;

public class Test {

	public static void main(String[] args) {

//		A a = new C();
//		a.myMethod();

		A a = () -> System.out.println("Inside myMethod");
		a.myMethod();

	}

}
