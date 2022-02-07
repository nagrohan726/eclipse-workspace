package com.rohan.spring.springcore.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcore/properties/config.xml");
		Student countriesAndLangs = (Student) context.getBean("countriesAndLangs");
		System.out.println(countriesAndLangs);

		context.close();
	}

}
