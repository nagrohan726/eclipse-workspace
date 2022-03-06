package com.rohan.spring.springorm.passenger.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rohan.spring.springorm.passenger.dao.PassengerDAO;
import com.rohan.spring.springorm.passenger.entity.Passenger;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/rohan/spring/springorm/passenger/test/config.xml");
		PassengerDAO dao = (PassengerDAO) context.getBean("passengerDAO");

		Passenger passenger = new Passenger();

		/*
		 * passenger.setId(1); passenger.setFirstName("Rohan");
		 * passenger.setLastName("Nag");
		 */

		passenger.setId(2);
		passenger.setFirstName("Khushboo");
		passenger.setLastName("Kumari");

		dao.create(passenger);
		System.out.println("Record created!");

		List<Passenger> table = dao.read();
		System.out.println("Passenger record: ");
		for (Passenger psngr : table) {
			System.out.println(psngr);
		}

		passenger.setId(2);
		passenger.setFirstName("Khushboo");
		passenger.setLastName("Nag");

		dao.update(passenger);
		System.out.println("Record updated!");

		table = dao.read();
		System.out.println("Passenger record: ");
		for (Passenger psngr : table) {
			System.out.println(psngr);
		}

		passenger.setId(2);
//		passenger.setFirstName("Khushboo");
//		passenger.setLastName("Nag");

		dao.delete(passenger);
		System.out.println("Record deleted!");

		passenger = dao.read(1);
		System.out.println(passenger);

		context.close();
	}

}
