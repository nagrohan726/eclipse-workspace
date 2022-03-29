package com.rohan.dating.dao;

import java.util.List;

import com.rohan.dating.model.UserAccount;

public interface UserAccountDAO {

	void save(UserAccount userAccount); // all methods in interface are public by default

	UserAccount findById(int id);

	List<UserAccount> findAll();

	List<UserAccount> findMatches(int age, String city);

	void delete(int id);

}
