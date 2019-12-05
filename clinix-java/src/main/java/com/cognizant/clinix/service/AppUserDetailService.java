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

	/*
	 * public void signUp(Admin user) throws Exception{ Optional<User> userObj =
	 * userRepository.findUserByUsername(user.getEmail());
	 * 
	 * if (userObj.isPresent()) {
	 * 
	 * throw new Exception("User already exists"); //TODO: Custom exception }
	 * else { System.out.println(user); String pass = user.getPassword();
	 * user.setPassword(new BCryptPasswordEncoder().encode(pass));
	 * userRepository.save(user); userRepository.addUser(user.getEmail(),
	 * user.getFirstName(),user.getLastName(), user.getPassword()); User newUser
	 * = userRepository.findUserByUsername(user.getEmail()).get();
	 * userRepository.addUserRole(newUser.getUserId(), 2); } }
	 */

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
			System.out.println(user);
			String pass = user.getPassword();
			user.setPassword(new BCryptPasswordEncoder().encode(pass));
			userRepository.save(user);
			userRepository.addUser(
					id, 
					user.getFirstName(), 
					user.getLastName(), 
					user.getAge(), 
					user.getGender(),
					user.getDateOfBirth(), 
					user.getContact(), 
					user.getAlt_contact(), 
					user.getEmail(),
					user.getPassword(), 
					user.getSecurity_que(), 
					user.getSecurity_ans());
			userRepository.addAdmin(
					id, 
					user.getFirstName(), 
					user.getLastName(), 
					user.getAge(), 
					user.getGender(),
					user.getDateOfBirth(), 
					user.getContact(), 
					user.getAlt_contact(), 
					user.getEmail(),
					user.getPassword(), 
					user.getSecurity_que(), 
					user.getSecurity_ans());
			User newUser = userRepository.findUserByUsername(user.getEmail()).get();
			userRepository.addUserRole(newUser.getUserId(), 1); //ROLE ID
			
			LOGGER.debug("SIGNUP ADMIN");
		}
	}

	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
