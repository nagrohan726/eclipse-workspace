package com.rohan.java8.defaultmethods;

public interface X {

	default void m1() { // public access by default
		System.out.println("m1 inside X");
	}
}
