package com.rohan.springboot.demo.service;

import org.springframework.stereotype.Component;

import com.rohan.springboot.demo.dao.Dao;

@Component
public class Service {

//	@Autowired
	Dao dao;

	Service(Dao dao) {
		System.out.println("Service Created");
		this.dao = dao;
	}

	public void save() {
		dao.create();
	}

}
