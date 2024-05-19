package com.company.healthcareplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.healthcareplatform.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
