package com.cognizant.clinix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.clinix.model.Patient;
import com.cognizant.clinix.service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@GetMapping("/getAll")
	public List<Patient> getAllPatients()
	{ 
		return patientService.getAllPatients();
	}
	
	/*@GetMapping("/getUserDoctors")
	public List<Patient> getAllUserPatients()
	{ 
		return doctorService.getAllUserPatients();
	}
*/

	public PasswordEncoder passwordEncoder() {
		// LOGGER.info("Start");
		return new BCryptPasswordEncoder();
	}
	
	@PutMapping("/editApproval")
	 public void updatePatientApproval(@RequestBody Patient patient){
		 patientService.updatePatientApproval(patient.isApprove(),patient.getPatientId());
	 }

}
