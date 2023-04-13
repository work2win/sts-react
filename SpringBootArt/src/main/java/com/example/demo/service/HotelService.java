package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.demo.model.Hotel;
import com.example.demo.repository.HotelRepository;

@Service
public class HotelService {
	
	HotelRepository hotelRepository;
	
	@GetMapping("/hotel")
	public List<Hotel> findAll(){
		return hotelRepository.findAll();
	} 

}
