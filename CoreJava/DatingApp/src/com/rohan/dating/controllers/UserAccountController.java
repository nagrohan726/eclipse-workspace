package com.rohan.dating.controllers;

import com.rohan.dating.dao.UserAccountDAO;
import com.rohan.dating.dao.UserAccountDAOImpl;
import com.rohan.dating.model.Interest;
import com.rohan.dating.model.UserAccount;

public class UserAccountController {

	public static void main(String[] args) {

		UserAccountController controller = new UserAccountController();
//		controller.registerUser();
//		controller.findAllUsers();
		controller.findMatchingUsers();

	}

	public void registerUser() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setAge(20);
		userAccount.setCity("Kolkata");
		userAccount.setCountry("India");
		userAccount.setEmail("a@b.com");
		userAccount.setGender("M");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("1234567980");
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("watching movies");
		interest.setHobbies("playing chess");
		userAccount.setInterest(interest);
		dao.save(userAccount);
		System.out.println(dao.findById(1));
	}

	public void findAllUsers() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		createUsers(dao);

		dao.delete(1);

		System.out.println(dao.findAll());
	}

	public void findMatchingUsers() {
		UserAccountDAO dao = new UserAccountDAOImpl();
		createUsers(dao);

		System.out.println(dao.findMatches(20, "Kolkata"));
	}

	private void createUsers(UserAccountDAO dao) {
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setUserName("bob");
		userAccount.setAge(30);
		userAccount.setCity("Kolkata");
		userAccount.setCountry("India");
		userAccount.setEmail("a@b.com");
		userAccount.setGender("M");
		userAccount.setPassword("password");
		userAccount.setPhoneNumber("1234567980");
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("watching movies");
		interest.setHobbies("playing chess");
		userAccount.setInterest(interest);
		dao.save(userAccount);

		UserAccount userAccount2 = new UserAccount();
		userAccount2.setId(2);
		userAccount2.setUserName("john");
		userAccount2.setAge(20);
		userAccount2.setCity("Kolkata");
		userAccount2.setCountry("India");
		userAccount2.setEmail("a@b.com");
		userAccount2.setGender("M");
		userAccount2.setPassword("password");
		userAccount2.setPhoneNumber("1234567980");
		dao.save(userAccount2);
	}

}
