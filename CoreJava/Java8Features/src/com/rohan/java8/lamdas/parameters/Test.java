package com.rohan.java8.lamdas.parameters;

public class Test {

	public static void main(String[] args) {

		Sum s = (n1, n2) -> System.out.println("Sum is: "+(n1 + n2));
		s.add(10, 20);
	}

}
