package com.learn.AirlineBookingSystem.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	
	@CreationTimestamp
	private LocalDateTime bookingDate;
	
	@Column(nullable = false)
	private String paymentStatus;
	
	@Column(nullable = false)
	private int totalCost;
	
	@ManyToOne
	private User user;
	
	@ManyToOne()
	private Ticket tickets;

}
