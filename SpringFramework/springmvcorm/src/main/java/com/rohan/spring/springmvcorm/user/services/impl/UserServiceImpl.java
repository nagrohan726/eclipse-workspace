package com.rohan.spring.springmvcorm.user.services.impl;

import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohan.spring.springmvcorm.user.dao.UserDao;
import com.rohan.spring.springmvcorm.user.entity.User;
import com.rohan.spring.springmvcorm.user.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

	@Override
	@Transactional // Better to have in the services layer as multiple dao statements might exist
	public int save(User user) {
		// Business Logic
		return dao.create(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> users = dao.findUsers();
		Collections.sort(users);
		return users;
	}

	@Override
	public User getUser(Integer id) {
		return dao.findUser(id);
	}

}
