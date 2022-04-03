package com.rohan.flightreservation.dao;

import com.rohan.flightreservation.model.Reservation;

public interface ReservationDAO {

	Reservation bookFlight(Reservation reservation);

	Reservation checkIn(long reservationId, int noOfBags);

}
