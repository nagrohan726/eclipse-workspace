package com.rohan.spring.springcoreadvanced.autowiring.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcoreadvanced/autowiring/assignment/config.xml");
		Customer customer = (Customer) context.getBean("customer");
		System.out.println(customer);
		context.close();
	}

}
