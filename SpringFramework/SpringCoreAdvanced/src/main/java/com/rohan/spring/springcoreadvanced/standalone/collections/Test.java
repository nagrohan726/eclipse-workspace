package com.rohan.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcoreadvanced/standalone/collections/config.xml");
		ProductsList productsList = (ProductsList) context.getBean("productsList");
		System.out.println(productsList);
		context.close();
	}

}
