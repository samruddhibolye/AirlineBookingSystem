package com.learn.AirlineBookingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.AirlineBookingSystem.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
