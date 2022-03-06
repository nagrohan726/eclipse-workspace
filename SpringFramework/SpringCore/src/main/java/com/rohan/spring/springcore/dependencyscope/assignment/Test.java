package com.rohan.spring.springcore.dependencyscope.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcore/dependencyscope/assignment/config.xml");
		University university = (University) context.getBean("university");
		System.out.println(university);

		System.out.println(university.hashCode());

		University university2 = (University) context.getBean("university");
		System.out.println(university2.hashCode());

		context.close();
	}

}
