package com.patient.hospital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.patient.hospital.entity.PatientDetails;

public interface PatientRepository extends JpaRepository<PatientDetails, Long>{
	
	
}
