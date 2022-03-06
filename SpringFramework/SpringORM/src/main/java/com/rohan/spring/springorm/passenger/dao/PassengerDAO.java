package com.rohan.spring.springorm.passenger.dao;

import java.util.List;

import com.rohan.spring.springorm.passenger.entity.Passenger;

public interface PassengerDAO {

	int create(Passenger passenger);

	Passenger read(int id);

	List<Passenger> read();

	void update(Passenger passenger);

	void delete(Passenger passenger);

}
