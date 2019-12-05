package com.cognizant.clinix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.clinix.model.Agent;
import com.cognizant.clinix.model.Doctor;
import com.cognizant.clinix.service.AgentService;

@RestController
@RequestMapping("/agents")
public class AgentController {

	@Autowired
	private AgentService agentService;
	
	@GetMapping("/getAll")
	public List<Agent> getAllAgents()
	{ 
		return agentService.getAllAgents();
	}
	
	@PostMapping("/add")
	public void addAgent(@RequestBody Agent agent){
		agentService.addAgent(agent);
	}
	
	@GetMapping(value = "/get/{id}")
	public Agent getAgent(@PathVariable long id){
		return agentService.getAgent(id);
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
