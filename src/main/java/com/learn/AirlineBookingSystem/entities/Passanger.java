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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passanger {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passangerId;
	
	@Column(nullable = false)
	private String passangerName;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(nullable = false)
	private int age;
	
	@Column(nullable = false)
	private String passportNumber;
	
	@Column(nullable = false)
	private String nationality;
	
	@OneToMany(mappedBy = "passanger",cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	private List<Ticket> tickets;
	
	

}
