package com.rohan.overriding;

public class Overriding {

	public static void main(String[] args) {

		Parent.doSomething();
		Child.doSomething();

		Parent p = new Parent();
		System.out.println(p.s);

		Child c = new Child();
		System.out.println(c.s);

		Parent c1 = new Child();
		System.out.println(c1.s); // overriding behaves differently for variable and prints parent's value
									// because variables are resolved by compiler at compile time

		Parent c2 = new Child();
		c2.test(); // overriding parent's method to run child's method
	}
}
