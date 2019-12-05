package com.cognizant.clinix.service;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.clinix.controller.AuthenticationController;
import com.cognizant.clinix.model.Appointment;
import com.cognizant.clinix.repository.AppointmentRepository;

@Component
public class AppointmentService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private AppointmentRepository appointmentRepository;

	/*public List<Agent> getAllAgents(){
		return agentRepository.findAll();
	}*/
	
	public void bookAppointment(Appointment appointment){
		Random rand = new Random();
		long id = rand.nextInt(10000);
		appointment.setAppointmentId(id);
		appointmentRepository.save(appointment);
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
