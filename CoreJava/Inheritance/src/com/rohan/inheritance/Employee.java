package com.rohan.inheritance;

public class Employee {

	int id;
	String name;
	String dept;
	double salary;

	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;

		System.out.println("Inside Employee Constructor");
	}

	protected void work() {
		System.out.println("Common work for everyone");
	}

}
