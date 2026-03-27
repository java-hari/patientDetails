package com.patient.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.patient.hospital.entity.PatientDetails;
import com.patient.hospital.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {

	
	@Autowired
	private PatientService patientService;
	
	@PostMapping("/create")
	public PatientDetails createPatient(@RequestBody PatientDetails patientDetails) {
		
		return patientService.createPatientDetails(patientDetails);		
		
	}
	
	@GetMapping("/read")
	public List<PatientDetails> getAllPatientDetails() {
		
		return patientService.getAllPatients();
	}
	
	@GetMapping("/getId")
	public PatientDetails getPatientById(@RequestParam Long id) {
		return patientService.getPatientById(id);
	}
	
	
	@GetMapping
	public String testConnection() {
		return "Success";
	}
	
	
	

}
