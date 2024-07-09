package com.example.user_service.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user_service.entity.User;
import com.example.user_service.repository.UserRepo;
import com.example.user_service.response.MovieResponse;
import com.example.user_service.response.UserResponse;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public UserResponse getUserdetailsById(int id) {
		Optional<User> user = userRepo.findById(id);
		UserResponse userResponse = modelMapper.map(user, UserResponse.class);
		MovieResponse movieResponse = restTemplate.getForObject("http://localhost:8081/movies/{userId}", MovieResponse.class,id);
		userResponse.setMovieResponse(movieResponse);
		return userResponse;
		
	}
}
