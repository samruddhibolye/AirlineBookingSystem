package com.learn.AirlineBookingSystem.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	
	@Column(nullable = false)
	private String flightNumber;
	
	@Column(nullable = false)
	private String depatureTime;
	
	@Column(nullable = false)
	private String arrivalTime;
	
	@Column(nullable = false)
	private String destination;
	
	@Column(nullable = false)
	private String status;
	
	@OneToMany(mappedBy = "flights",cascade ={CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	private List<Ticket> tickets;

}
