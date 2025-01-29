package com.learn.AirlineBookingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.AirlineBookingSystem.entities.User;

public interface UserRepository  extends JpaRepository<User, Integer> {
	
	
	
	

}
