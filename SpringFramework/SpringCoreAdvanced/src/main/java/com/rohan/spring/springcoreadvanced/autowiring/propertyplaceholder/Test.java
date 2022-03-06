package com.rohan.spring.springcoreadvanced.autowiring.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcoreadvanced/propertyplaceholder/config.xml");
		MyDAO dao = (MyDAO) context.getBean("myDAO");
		System.out.println(dao);
		context.close();
	}

}
