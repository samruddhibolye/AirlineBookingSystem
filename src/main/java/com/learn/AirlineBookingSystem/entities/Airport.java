package com.learn.AirlineBookingSystem.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Airport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airportId;
	
	@Column(nullable = false)
	private String airportName;
	
	@Column(nullable = false)
	private String location;
	
	@Column(nullable = false)
	private int code;
	
	@Column(nullable = false)
	private String country;

}
