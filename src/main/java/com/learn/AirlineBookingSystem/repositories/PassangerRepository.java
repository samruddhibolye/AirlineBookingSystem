package com.learn.AirlineBookingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.AirlineBookingSystem.entities.Passanger;

public interface PassangerRepository extends JpaRepository<Passanger, Integer>{

}
