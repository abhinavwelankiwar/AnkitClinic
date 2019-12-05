package com.cognizant.clinix;

import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ClinixApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(ClinixApplication.class);

	public static void main(String[] args) throws ParseException {
		ApplicationContext applicationContext = SpringApplication.run(ClinixApplication.class,
				args);
	}

}
