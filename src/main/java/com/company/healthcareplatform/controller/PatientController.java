package com.company.healthcareplatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.healthcareplatform.model.Patient;
import com.company.healthcareplatform.service.PatientService;

@RestController
@RequestMapping("/api/patients")
public class PatientController {
	@Autowired
	private final PatientService patientService;

    
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @PostMapping("/")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient) {
        Patient newPatient = patientService.addPatient(patient);
        return ResponseEntity.ok(newPatient);
    }
}
