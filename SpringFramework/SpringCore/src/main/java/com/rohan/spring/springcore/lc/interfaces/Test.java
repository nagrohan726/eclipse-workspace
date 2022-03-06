package com.rohan.spring.springcore.lc.interfaces;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcore/lc/interfaces/config.xml");
		Patient patient = (Patient) context.getBean("patient");
		System.out.println(patient);
		// context.registerShutdownHook();

		context.close();
	}

}
