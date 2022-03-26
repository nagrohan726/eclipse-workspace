package com.rohan.java8.methodref.constructors;

public class Test {

	public static void main(String[] args) {

		MyInterface f1 = s -> new MyClass(s);
		f1.get("Using Lamdas");

		MyInterface f2 = MyClass::new;
		f2.get("Using Constructor Mapping");

	}

}
