package com.volunteer.services;

import java.util.Arrays;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.volunteer.models.Role;
import com.volunteer.models.User;
import com.volunteer.repositories.UserRepository;
import com.volunteer.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user =  new User(registrationDto.getF_name(), registrationDto.getL_name(), registrationDto.getEmail(),  registrationDto.getContact(), registrationDto.getPassword(), registrationDto.getCity(), null);
		return userRepository.save(user);
		
	}

	

}
 