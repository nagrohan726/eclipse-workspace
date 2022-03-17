package com.rohan.overloading;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("Default Main Method"); // JVM runs main with this signature
		main(10);
	}

	public static void main(int args) {
		System.out.println("Overloaded Main Method");
	}

}
