package com.learn.AirlineBookingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.AirlineBookingSystem.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
