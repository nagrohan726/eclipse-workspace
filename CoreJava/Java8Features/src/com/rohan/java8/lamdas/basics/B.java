package com.rohan.java8.lamdas.basics;
@FunctionalInterface
public interface B extends A {

//	void myMethod1();	// already has an abstract method in parent interface

	void myMethod(); // allowed because identical method as in parent

}
