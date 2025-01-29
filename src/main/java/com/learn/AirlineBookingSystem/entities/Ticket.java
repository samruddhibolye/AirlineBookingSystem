package com.learn.AirlineBookingSystem.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ticketId;
	
	@Column(nullable = false)
	private String seatNo;
	
	@Column(nullable = false)
	private String ticketClass;
	
	@OneToMany(mappedBy = "tickets" ,cascade =  {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	private List<Booking> bookings;
	
	@ManyToOne
	private Passanger passanger;
	
	@ManyToOne
	private Flight flights;

}
