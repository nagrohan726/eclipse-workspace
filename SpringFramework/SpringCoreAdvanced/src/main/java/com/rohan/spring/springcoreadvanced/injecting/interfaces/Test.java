package com.rohan.spring.springcoreadvanced.injecting.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcoreadvanced/injecting/interfaces/config.xml");
		OrderBO bo = (OrderBO) context.getBean("bo");
		bo.placeOrder();
		context.close();
	}

}
