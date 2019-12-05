package com.cognizant.clinix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.clinix.model.Appointment;
import com.cognizant.clinix.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;
	
	/*@GetMapping("/add")
	public List<Agent> getAllAgents()
	{ 
		return agentService.getAllAgents();
	}*/
	
	@PostMapping("/add")
	public void addAppointmentRequest(@RequestBody Appointment appointment){
		appointmentService.bookAppointment(appointment);
	}
	
	/*public void addAgent(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String address1, String address2, String city, String state, long zipcode, long commission)
	{
		AgentService.addAgent( id,  firstName,  lastName,  age,  gender,  dob,  contact,
		 alt_contact,  email,  password,  address1,  address2,  city,  state,  zipcode,  commission);
	}
*/
	/*@GetMapping("/getUserDoctors")
	public List<Patient> getAllUserPatients()
	{ 
		return doctorService.getAllUserPatients();
	}
*/

	/*public PasswordEncoder passwordEncoder() {
		// LOGGER.info("Start");
		return new BCryptPasswordEncoder();
	}*/
	
	/*@PutMapping("/editApproval")
	 public void updatePatientApproval(@RequestBody Patient patient){
		 patientService.updatePatientApproval(patient.isApprove(),patient.getPatientId());
	 }*/

}
