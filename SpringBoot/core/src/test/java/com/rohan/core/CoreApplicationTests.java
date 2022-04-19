package com.rohan.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rohan.core.services.PaymentServiceImpl;

@SpringBootTest
class CoreApplicationTests {

	@Autowired
	PaymentServiceImpl service;

	@Test
	void testDependencyInjection() {
		assertNotNull(service.getDao());
	}

}
