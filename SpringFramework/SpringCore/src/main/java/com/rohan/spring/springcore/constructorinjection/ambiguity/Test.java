package com.rohan.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcore/constructorinjection/ambiguity/config.xml");
		context.close();

	}

}
