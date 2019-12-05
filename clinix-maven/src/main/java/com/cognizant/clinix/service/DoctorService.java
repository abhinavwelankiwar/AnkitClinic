package com.cognizant.clinix.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cognizant.clinix.controller.AuthenticationController;
import com.cognizant.clinix.model.Doctor;
import com.cognizant.clinix.model.MedicareService;
import com.cognizant.clinix.repository.DoctorRepository;

@Component
public class DoctorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private DoctorRepository doctorRepository;

	public List<Doctor> getAllDoctors() {
		return doctorRepository.findAll();
	}

	public List<Doctor> getAllUserDoctors() {
		return doctorRepository.getAllDoctorsForUser();
	}

	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public void updateDoctorApproval(boolean approve, long doctor_id) {
		doctorRepository.updateDoctorApproval(approve, doctor_id);
	}

	public List<Doctor> getDoctorsByMedicareService(MedicareService medicareService) {
		return doctorRepository.getAllDoctorsForMedicareService(medicareService);
	}
	
	public Doctor getDoctor(long id){
		return doctorRepository.getOne((int) id);
	}

}
