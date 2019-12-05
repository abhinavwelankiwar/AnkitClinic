package com.cognizant.clinix.service;

import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cognizant.clinix.controller.AuthenticationController;
import com.cognizant.clinix.model.MedicareService;
import com.cognizant.clinix.model.Patient;
import com.cognizant.clinix.repository.MedicareServiceRepository;
import com.cognizant.clinix.repository.PatientRepository;

@Component
public class MedicareServiceService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private MedicareServiceRepository medicareServiceRepository;

	public List<MedicareService> getAllMedicareServices(){
		return medicareServiceRepository.findAll();
	}
	public void addMedicareServices(MedicareService medicareService){
		Random rand = new Random();
		long id = rand.nextInt(10000);
		medicareService.setMedicareServiceId(id);
		medicareServiceRepository.save(medicareService);
	}
	
}
