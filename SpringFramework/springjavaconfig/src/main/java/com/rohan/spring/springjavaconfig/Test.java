package com.rohan.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//		context.register(null);
//		Dao dao = context.getBean(Dao.class);
//		dao.create();
		Service svc = context.getBean(Service.class);
		System.out.println(svc.hashCode());
		svc.save();

		Service svc2 = context.getBean(Service.class);
		System.out.println(svc2.hashCode());
//		svc2.save();

		context.close();

	}

}
