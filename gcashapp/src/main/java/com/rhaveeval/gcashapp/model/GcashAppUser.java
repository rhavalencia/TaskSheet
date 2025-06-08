package com.rhaveeval.gcashapp.model;

import jakarta.persistence.*;

@Entity
@Table (name = "users")
public class GcashAppUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false, unique = true)
	private String email;
	
	@Column(name = "sim_number", nullable = false, unique = true)
	private String number;
	
	@Column(nullable = false)
	private String pin;

	public GcashAppUser() {
		super();
	}
	
	public GcashAppUser(Long id, String name, String email, String number, String pin) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.pin = pin;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}
