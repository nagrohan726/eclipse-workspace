package com.rohan.spring.springorm.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.rohan.spring.springorm.passenger.dao.PassengerDAO;
import com.rohan.spring.springorm.passenger.entity.Passenger;

@Component("passengerDAO")
public class PassengerDAOImpl implements PassengerDAO {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(Passenger passenger) {
		Integer result = (Integer) hibernateTemplate.save(passenger);
		return result;
	}

	@Override
	public Passenger read(int id) {
		Passenger passenger = hibernateTemplate.get(Passenger.class, id);
		return passenger;
	}

	@Override
	public List<Passenger> read() {
		List<Passenger> passengers = hibernateTemplate.loadAll(Passenger.class);
		return passengers;
	}

	@Override
	@Transactional
	public void update(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}

	@Override
	@Transactional
	public void delete(Passenger passenger) {
		hibernateTemplate.delete(passenger);
	}

}
