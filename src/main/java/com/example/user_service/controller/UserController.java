package com.example.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user_service.response.UserResponse;
import com.example.user_service.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	public UserService userService;
	
	@RequestMapping("/users/{id}")
	public ResponseEntity<UserResponse> getUserDetailsById(@PathVariable int id) {
		UserResponse userResponse = userService.getUserdetailsById(id);
		return new ResponseEntity<UserResponse>(userResponse, HttpStatus.OK);
	}
	
}
