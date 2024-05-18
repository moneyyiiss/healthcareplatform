package com.company.healthcareplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.healthcareplatform.model.Doctor;
import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{
	List<Doctor> findByCityAndSpeciality(String city, String speciality);
}
