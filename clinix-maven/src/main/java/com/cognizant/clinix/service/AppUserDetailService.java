package com.cognizant.clinix.service;

import java.util.Optional;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.cognizant.clinix.controller.AuthenticationController;
import com.cognizant.clinix.model.Admin;
import com.cognizant.clinix.model.Agent;
import com.cognizant.clinix.model.Doctor;
import com.cognizant.clinix.model.Patient;
import com.cognizant.clinix.model.User;
import com.cognizant.clinix.repository.UserRepository;

@Component
public class AppUserDetailService implements UserDetailsService {
	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private UserRepository userRepository;

	AppUser appUser;
	User user;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		user = userRepository.findUserByUsername(username).get();
		System.out.println("inside APPUSERDETAILSERVICE " + user);
		if (user == null) {
			LOGGER.info("USER NOT FOUND");
			throw new UsernameNotFoundException("Username not found");
		} else {
			appUser = new AppUser(user);
			LOGGER.info("LOGGED IN");

		}
		System.out.println("inside APPUSERDETAILSERVICE appuser " + appUser);

		return appUser;
	}


	public void signUpAdmin(Admin admin) throws Exception {
		Optional<User> userObj = userRepository.findUserByUsername(admin.getEmail());
		LOGGER.debug("SIGNUP ADMIN ENTERS");
		if (userObj.isPresent()) {

			throw new Exception("User already exists");
			// TODO: Custom exception
		} else {
			Random rand = new Random();
			LOGGER.debug("SIGNUP ADMIN");
			// Generate random integers in range 0 to 999
			long id = rand.nextInt(10000);
			//System.out.println("USER "+ userObj.get());
			//User user = userObj.get();
			System.out.println(admin);
			String pass = admin.getPassword();
			
			admin.setPassword(new BCryptPasswordEncoder().encode(pass));
			
			//USER TABLE
			userRepository.addUser(
					id, 
					admin.getFirstName(), 
					admin.getLastName(), 
					admin.getAge(), 
					admin.getGender(),
					admin.getDateOfBirth(), 
					admin.getContactNumber(), 
					admin.getAltContactNumber(), 
					admin.getEmail(),
					admin.getPassword(), 
					admin.getSecurityQue(), 
					admin.getSecurityAns());
			
			//ADMIN TABLE
			userRepository.addAdmin(
					id, 
					admin.getFirstName(), 
					admin.getLastName(), 
					admin.getAge(), 
					admin.getGender(),
					admin.getDateOfBirth(), 
					admin.getContactNumber(), 
					admin.getAltContactNumber(), 
					admin.getEmail(),
					admin.getPassword(), 
					admin.getSecurityQue(), 
					admin.getSecurityAns());
			
			//USER ROLE
			User newUser = userRepository.findUserByUsername(admin.getEmail()).get();
			userRepository.addUserRole(newUser.getUserId(), 1); //ROLE ID
			
			LOGGER.debug("SIGNUP ADMIN");
		}
	}

	public void signUpDoctor(Doctor doctor) throws Exception {
		Optional<User> userObj = userRepository.findUserByUsername(doctor.getEmail());
		LOGGER.debug("SIGNUP ADMIN ENTERS");
		if (userObj.isPresent()) {

			throw new Exception("User already exists");
			// TODO: Custom exception
		} else {
			Random rand = new Random();
			LOGGER.debug("SIGNUP ADMIN");
			// Generate random integers in range 0 to 999
			long id = rand.nextInt(10000);
			//System.out.println("USER "+ userObj.get());
			//User user = userObj.get();
			System.out.println(doctor);
			String pass = doctor.getPassword();
			
			doctor.setPassword(new BCryptPasswordEncoder().encode(pass));
			
			//USER TABLE
			userRepository.addUser(
					id, 
					doctor.getFirstName(), 
					doctor.getLastName(), 
					doctor.getAge(), 
					doctor.getGender(),
					doctor.getDateOfBirth(), 
					doctor.getContactNumber(), 
					doctor.getAltContactNumber(), 
					doctor.getEmail(),
					doctor.getPassword(), 
					doctor.getSecurityQue(), 
					doctor.getSecurityAns());
			
			//DOCTOR TABLE
			userRepository.addDoctor(
					id, 
					doctor.getFirstName(), 
					doctor.getLastName(), 
					doctor.getAge(), 
					doctor.getGender(),
					doctor.getDateOfBirth(), 
					doctor.getContactNumber(), 
					doctor.getAltContactNumber(), 
					doctor.getEmail(),
					doctor.getPassword(), 
					doctor.getAddress1(),
					doctor.getAddress2(),
					doctor.getCity(),
					doctor.getState(),
					doctor.getZipcode(),
					doctor.getDegree(),
					doctor.getSpeciality(),
					doctor.getWorkHours(),
					doctor.getHospitalName(),
					doctor.getSecurityQue(), 
					doctor.getSecurityAns(),
					doctor.getMedicareService(),
					false);
			
			//USER ROLE
			User newUser = userRepository.findUserByUsername(doctor.getEmail()).get();
			userRepository.addUserRole(newUser.getUserId(), 3); //ROLE ID
			
			LOGGER.debug("SIGNUP ADMIN");
		}
	}
	
	public void signUpPatient(Patient patient) throws Exception {
		Optional<User> userObj = userRepository.findUserByUsername(patient.getEmailId());
		LOGGER.debug("SIGNUP PATIENT ENTERS");
		if (userObj.isPresent()) {

			throw new Exception("User already exists");
			// TODO: Custom exception
		} else {
			Random rand = new Random();
			LOGGER.debug("SIGNUP PATIENT");
			// Generate random integers in range 0 to 999
			long id = rand.nextInt(10000);
			//System.out.println("USER "+ userObj.get());
			//User user = userObj.get();
			System.out.println(patient);
			String pass = patient.getPassword();
			
			patient.setPassword(new BCryptPasswordEncoder().encode(pass));
			
			//USER TABLE
			userRepository.addUser(
					id, 
					patient.getFirstName(), 
					patient.getLastName(), 
					patient.getAge(), 
					patient.getGender(),
					patient.getDateOfBirth(), 
					patient.getContactNumber(), 
					patient.getAltContactNumber(), 
					patient.getEmailId(),
					patient.getPassword(), 
					patient.getSecurityQuestion(), 
					patient.getSecurityAnswer());
			
			//PATIENT TABLE
			userRepository.addPatient(
					id, 
					patient.getFirstName(), 
					patient.getLastName(), 
					patient.getAge(), 
					patient.getGender(),
					patient.getDateOfBirth(), 
					patient.getContactNumber(), 
					patient.getAltContactNumber(), 
					patient.getEmailId(),
					patient.getPassword(), 
					patient.getAddress1(),
					patient.getAddress2(),
					patient.getCity(),
					patient.getState(),
					patient.getZipcode(),
					patient.getSecurityQuestion(), 
					patient.getSecurityAnswer(),
					false);
			
			//USER ROLE
			User newUser = userRepository.findUserByUsername(patient.getEmailId()).get();
			userRepository.addUserRole(newUser.getUserId(), 2); //ROLE ID
			
			LOGGER.debug("SIGNUP PATIENT ENDED");
		}
	}
	
	public void signUpAgent(Agent agent) throws Exception {
		Optional<User> userObj = userRepository.findUserByUsername(agent.getEmailId());
		LOGGER.debug("SIGNUP PATIENT ENTERS");
		if (userObj.isPresent()) {

			throw new Exception("User already exists");
			// TODO: Custom exception
		} else {
			Random rand = new Random();
			LOGGER.debug("SIGNUP PATIENT");
			// Generate random integers in range 0 to 999
			long id = rand.nextInt(10000);
			//System.out.println("USER "+ userObj.get());
			//User user = userObj.get();
			System.out.println(agent);
			String pass = agent.getPassword();
			
			agent.setPassword(new BCryptPasswordEncoder().encode(pass));
			
			//USER TABLE
			userRepository.addUser(
					id, 
					agent.getFirstName(), 
					agent.getLastName(), 
					agent.getAge(), 
					agent.getGender(),
					agent.getDateOfBirth(), 
					agent.getContactNumber(), 
					agent.getAltContactNumber(), 
					agent.getEmailId(),
					agent.getPassword(), 
					"NA", 
					"NA");
			
			//AGENT TABLE
			userRepository.addAgent(
					id, 
					agent.getFirstName(), 
					agent.getLastName(), 
					agent.getAge(), 
					agent.getGender(),
					agent.getDateOfBirth(), 
					agent.getContactNumber(), 
					agent.getAltContactNumber(), 
					agent.getEmailId(),
					agent.getPassword(), 
					agent.getAddress1(),
					agent.getAddress2(),
					agent.getCity(),
					agent.getState(),
					agent.getZipcode(),
					agent.getCommission()
					);
			
			//USER ROLE
			User newUser = userRepository.findUserByUsername(agent.getEmailId()).get();
			userRepository.addUserRole(newUser.getUserId(), 4); //ROLE ID
			
			LOGGER.debug("SIGNUP PATIENT ENDED");
		}
	}


	
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
