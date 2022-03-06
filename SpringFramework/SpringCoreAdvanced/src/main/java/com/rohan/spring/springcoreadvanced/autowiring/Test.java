package com.rohan.spring.springcoreadvanced.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcoreadvanced/autowiring/config.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
		context.close();
	}

}
