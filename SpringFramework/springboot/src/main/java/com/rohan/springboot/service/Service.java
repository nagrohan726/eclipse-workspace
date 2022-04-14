package com.rohan.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rohan.springboot.dao.Dao;

@Component
public class Service {

	Dao dao;

	@Autowired
	Service(Dao dao) {
		System.out.println("Service Bean Created");
		this.dao = dao;
	}

	public void save() {
		dao.create();
	}

}
