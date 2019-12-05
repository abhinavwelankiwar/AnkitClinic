package com.cognizant.clinix.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cognizant.clinix.controller.AuthenticationController;
import com.cognizant.clinix.model.Agent;
import com.cognizant.clinix.model.Doctor;
import com.cognizant.clinix.repository.AgentRepository;

@Component
public class AgentService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private AgentRepository agentRepository;

	public List<Agent> getAllAgents(){
		return agentRepository.findAll();
	}
	
	public void addAgent(Agent agent){
		agentRepository.save(agent);
	}
	
	public Agent getAgent(long id){
		return agentRepository.getAgent(id);
	}
	
	/*public void addAgent(long id, String firstName, String lastName, long age, String gender, Date dob, long contact,
			long alt_contact, String email, String password, String address1, String address2, String city, String state, long zipcode, long commission)
	{
		agentRepository.addAgent(id, firstName, lastName, age, gender, dob, contact, alt_contact, email, password, address1, address2, city, state, zipcode, commission);
	}*/
/*	public List<Patient> getAllUserPatients(){
		return patientRepository.getAllDoctorsForUser();
	}
*/
	/*public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}*/
	
	 /*public void updatePatientApproval(boolean approve,long patient_id){
		 patientRepository.updatePatientApproval(approve,patient_id);
	 }*/

}
