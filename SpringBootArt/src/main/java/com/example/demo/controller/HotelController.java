package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Hotel;
import com.example.demo.repository.HotelRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class HotelController {
	
	@Autowired
	private HotelRepository hotelRepository;
	
	@GetMapping("hotel")
	public List<Hotel> getHotels(){
		return this.hotelRepository.findAll();
	}

}
