package com.cognizant.clinix.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cognizant.clinix.controller.AuthenticationController;
import com.cognizant.clinix.model.Patient;
import com.cognizant.clinix.repository.PatientRepository;

@Component
public class PatientService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> getAllPatients(){
		return patientRepository.findAll();
	}
	
/*	public List<Patient> getAllUserPatients(){
		return patientRepository.getAllDoctorsForUser();
	}
*/
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	 public void updatePatientApproval(boolean approve,long patient_id){
		 patientRepository.updatePatientApproval(approve,patient_id);
	 }

}
