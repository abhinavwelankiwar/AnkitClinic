package com.cognizant.clinix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.clinix.model.Doctor;
import com.cognizant.clinix.model.MedicareService;
import com.cognizant.clinix.service.DoctorService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/getAll")
	public List<Doctor> getAllDoctors()
	{ 
		return doctorService.getAllDoctors();
	}
	
	@GetMapping("/getUserDoctors")
	public List<Doctor> getAllUserDoctors()
	{ 
		return doctorService.getAllUserDoctors();
	}


	public PasswordEncoder passwordEncoder() {
		// LOGGER.info("Start");
		return new BCryptPasswordEncoder();
	}
	
	@PutMapping("/editApproval")
	 public void updateDoctorApproval(@RequestBody Doctor doctor){
		 doctorService.updateDoctorApproval(doctor.isApprove(),doctor.getDoctorId());
	 }
	
	@PostMapping(value = "/getDoctorsByMedicareService")
	 public List<Doctor> getDoctorsByMedicareService(@RequestBody MedicareService medicareService){
		return doctorService.getDoctorsByMedicareService(medicareService);
	}
	
	@GetMapping(value = "/get/{id}")
	public Doctor getDoctor(@PathVariable long id){
		return doctorService.getDoctor(id);
	}

}
