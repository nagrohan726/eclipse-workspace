package com.rohan.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) context.getBean("hospital");
		System.out.println("Hospital Name: " + hospital.getName());
		System.out.println("Hospital Departments: " + hospital.getDepartments());
		System.out.println("Hospital Departments: " + hospital.getDepartments().getClass());

		((AbstractApplicationContext) context).close();
	}

}
