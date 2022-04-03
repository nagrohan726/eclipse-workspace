package com.rohan.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.springjdbc.employee.dao.EmployeeDao;
import com.rohan.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");

//		int result;
		Employee employee = new Employee(3, "Inamul", "Hasan");
//		result = dao.create(employee);
//		System.out.println("Number of records inserted are: " + result);

		employee.setFirstName("Bob");
		employee.setLastName("Fegurson");
//		result = dao.update(employee);
//		System.out.println("Number of records updated are: " + result);

//		result = dao.delete(3);
//		System.out.println("Number of records deleted are: " + result);

//		employee = dao.read(1);
//		System.out.println(employee);

		List<Employee> result = dao.read();
		System.out.println(result);

	}

}
