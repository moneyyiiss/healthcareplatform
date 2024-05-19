package com.company.healthcareplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.healthcareplatform.model.Doctor;
import com.company.healthcareplatform.service.DoctorService;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
	
	@Autowired
	private final DoctorService doctorService;
	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
	@PostMapping("/")
	public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor){
		Doctor newDoctor = doctorService.addDoctor(doctor);
		return ResponseEntity.ok(newDoctor);
	}
	
	
	
	@GetMapping("/suggest")
	public ResponseEntity<?> suggestDoctors(@RequestParam String symptom, @RequestParam String location){
		try {
			return ResponseEntity.ok(doctorService.findDoctorsBySymptomAndLocation(symptom,  location));
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Error finding doctors: " + e.getMessage());
		}
	}
	
	
}
