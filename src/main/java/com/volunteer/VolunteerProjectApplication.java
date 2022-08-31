package com.volunteer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

@SpringBootApplication
public class VolunteerProjectApplication {
	
	public VolunteerProjectApplication() {
	
	}
	public static void main(String[] args) {
		SpringApplication.run(VolunteerProjectApplication.class, args);

	}
	


}




