package com.cognizant.clinix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.clinix.model.Doctor;
import com.cognizant.clinix.model.MedicareService;
import com.cognizant.clinix.model.Patient;
import com.cognizant.clinix.service.MedicareServiceService;
import com.cognizant.clinix.service.PatientService;

@RestController
@RequestMapping("/medicareservice")
public class MedicareServiceController {

	@Autowired
	private MedicareServiceService medicareServiceService;
	
	@GetMapping("/getAll")
	public List<MedicareService> getAllMedicareService()
	{ 
		return medicareServiceService.getAllMedicareServices();
	}
	
	@PostMapping("/addMedicareService")
	public void addMedicareServices(@RequestBody MedicareService medicareService){
		medicareServiceService.addMedicareServices(medicareService);
	}
}
