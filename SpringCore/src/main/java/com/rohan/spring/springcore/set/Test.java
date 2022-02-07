package com.rohan.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) context.getBean("cardealer");
		System.out.println("Car Dealer: " + carDealer.getName());
		System.out.println("Car Models: " + carDealer.getModels());

		context.close();
	}

}
