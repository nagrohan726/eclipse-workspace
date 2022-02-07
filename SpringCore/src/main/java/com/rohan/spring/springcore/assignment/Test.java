package com.rohan.spring.springcore.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcore/assignment/config.xml");
		ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingCart");
		System.out.println(shoppingCart);

		context.close();
	}

}
