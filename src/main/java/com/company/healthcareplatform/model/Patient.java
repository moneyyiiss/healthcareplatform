package com.company.healthcareplatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "patients")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3, max = 100)
	private String name;
	
	@Size(max = 100)
	private String city;
	
	@NotNull
	@Email
	@Size(max = 100)
	private String email;
	
	@NotNull
	@Size(min = 10, max = 15)
	private String phoneNumber;
	
	@NotNull
	private String symptom;
	
	

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(Long id, @NotNull @Size(min = 3, max = 100) String name, @Size(max = 100) String city,
			@NotNull @Email @Size(max = 100) String email, @NotNull @Size(min = 10, max = 15) String phoneNumber,
			@NotNull String symptom) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.symptom = symptom;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}
	
	
}

