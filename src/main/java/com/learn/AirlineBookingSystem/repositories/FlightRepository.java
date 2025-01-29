package com.learn.AirlineBookingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.AirlineBookingSystem.entities.Flight;

public interface FlightRepository  extends JpaRepository<Flight, Integer> {

}
