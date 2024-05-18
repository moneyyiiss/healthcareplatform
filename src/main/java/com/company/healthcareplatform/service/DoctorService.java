package com.company.healthcareplatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.healthcareplatform.model.Doctor;
import com.company.healthcareplatform.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private final DoctorRepository doctorRepository;
	
	public DoctorService(DoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}
	
	public Doctor addDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	public List<Doctor> findDoctorsBySymptomAndLocation(String symptom, String location){
		String specialty = mapSymptomToSpecialty(symptom);
		return doctorRepository.findByCityAndSpeciality(location, specialty);
	}
	
	private String mapSymptomToSpecialty(String symptom) {
        // This method should map symptoms to specialties
        switch (symptom) {
            case "Arthritis":
            case "Back Pain":
            case "Tissue injuries":
                return "Orthopedic";
            case "Dysmenorrhea":
                return "Gynecology";
            case "Skin infection":
            case "Skin burn":
                return "Dermatology";
            case "Ear pain":
                return "ENT specialist";
            default:
                return "Unknown"; // handle unknown cases or throw exception
        }
    }
	
}
