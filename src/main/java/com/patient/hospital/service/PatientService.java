package com.patient.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patient.hospital.entity.PatientDetails;
import com.patient.hospital.repo.PatientRepository;

@Service
public class PatientService {

	
	@Autowired
	private PatientRepository patientRepository;


	public PatientDetails createPatientDetails(PatientDetails patientDetails) {
		
		PatientDetails save = patientRepository.save(patientDetails);
		
		if(save != null) {
			System.out.println("save" + save);
			return patientDetails;
		}
		
		return null;
	}


	public List<PatientDetails> getAllPatients() {
		
		List<PatientDetails> all = patientRepository.findAll();
		
		return all;
	}


	public PatientDetails getPatientById(Long id) {
		
		Optional<PatientDetails> byId = patientRepository.findById(id);
		
		return byId.get();
	}
	
}
