package com.learn.AirlineBookingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.AirlineBookingSystem.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer>{

}
