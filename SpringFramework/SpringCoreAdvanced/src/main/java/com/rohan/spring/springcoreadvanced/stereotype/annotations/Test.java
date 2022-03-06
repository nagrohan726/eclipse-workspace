package com.rohan.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcoreadvanced/stereotype/annotations/config.xml");
//		Instructor instructor = (Instructor) context.getBean("instructor");
		Instructor instructor = (Instructor) context.getBean("inst");
		System.out.println(instructor);
//		System.out.println(instructor.hashCode());

		Instructor instructor2 = (Instructor) context.getBean("inst");
//		System.out.println(instructor2.hashCode());
		System.out.println(instructor2);

		context.close();
	}

}
