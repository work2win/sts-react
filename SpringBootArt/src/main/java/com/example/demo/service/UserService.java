package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveProduct(User user) {
		return userRepository.save(user);
		
	}

}
