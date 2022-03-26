package com.rohan.java8.functions;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Hello"));
		System.out.println(f.apply("Rohan"));

	}

}
