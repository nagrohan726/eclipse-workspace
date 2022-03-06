package com.rohan.spring.springcoreadvanced.autowiring.propertyplaceholder.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcoreadvanced/propertyplaceholder/assignment/config.xml");
		WebService webservice = (WebService) context.getBean("webservice");
		System.out.println(webservice);
		context.close();
	}

}
