package com.learn.AirlineBookingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learn.AirlineBookingSystem.entities.Airport;

public interface AirportRepository extends JpaRepository<Airport, Integer> {

}
