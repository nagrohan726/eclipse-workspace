package com.rohan.spring.springcore.lc.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcore/lc/assignment/config.xml");
		context.close();
	}

}
