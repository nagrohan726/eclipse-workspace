package com.rohan.inheritance;

public class Test {

	public static void main(String[] args) {

		String[] projects = new String[] { "Flight Reservation", "Check In" };
//		Manager manager = new Manager(1, "John", "Travel", 1000000, projects, 2000000);
		Manager manager = new Manager(1, "John", "Travel", 1000000, projects);
		System.out.println(manager.id);
		System.out.println(manager.name);
		System.out.println(manager.dept);
		System.out.println(manager.salary);
		manager.work();

		Developer developer = new Developer(2, "Rohan", "Travel", 2000000, "Full Stack Java Developer and React");
		developer.work();

		String[] tools = new String[] { "Selenium", "etc." };
		Tester tester = new Tester(3, "Shalini", "Travel", 3000000, tools);
		tester.work();
	}

}
