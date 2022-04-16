package com.rohan.springboot.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.rohan.springboot.demo.service.Service;

@SpringBootTest
class CustomDemoApplicationTests {

	@Autowired
	ApplicationContext context;

//	@Test
//	void contextLoads() {
//	}

	@Test
	void testService() {
		Service service = context.getBean(Service.class);
		service.save();
	}

}
