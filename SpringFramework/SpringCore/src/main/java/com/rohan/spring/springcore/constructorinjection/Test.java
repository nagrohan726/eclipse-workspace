package com.rohan.spring.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcore/constructorinjection/config.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
		context.close();
	}

}
