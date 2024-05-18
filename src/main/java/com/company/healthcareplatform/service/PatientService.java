package com.company.healthcareplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.healthcareplatform.model.Patient;
import com.company.healthcareplatform.repository.PatientRepository;

@Service
public class PatientService {
	private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
