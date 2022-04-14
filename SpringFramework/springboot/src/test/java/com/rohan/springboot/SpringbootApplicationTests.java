package com.rohan.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.rohan.springboot.service.Service;

@SpringBootTest
class SpringbootApplicationTests {

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
