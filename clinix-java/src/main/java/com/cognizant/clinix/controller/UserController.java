package com.cognizant.clinix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.cognizant.clinix.model.Admin;
import com.cognizant.clinix.model.User;
import com.cognizant.clinix.service.AppUser;
import com.cognizant.clinix.service.AppUserDetailService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private AppUserDetailService appUserDetailService;

	@PostMapping()
	public void signup(@RequestBody Admin admin) {
		System.out.println("signup admin");
		try {
			appUserDetailService.signUpAdmin(admin);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User Already Exists");
		}
	}

	@GetMapping("/{username}")
	public long getUsersId(@PathVariable String username) {
		System.out.println("GET USER");

		AppUser userDetails = (AppUser) appUserDetailService.loadUserByUsername(username);
		User user = userDetails.getUser();
		return user.getUserId();
	}

	public PasswordEncoder passwordEncoder() {
		// LOGGER.info("Start");
		return new BCryptPasswordEncoder();
	}

}
