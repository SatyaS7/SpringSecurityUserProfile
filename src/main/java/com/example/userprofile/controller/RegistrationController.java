package com.example.userprofile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.userprofile.entity.Registration;
import com.example.userprofile.service.impl.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	RegistrationService registrationService;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@RequestMapping(value = "/user/register", method = RequestMethod.POST)
	public ResponseEntity<Object> registrationResource(@RequestBody Registration registration){
		registration.setPassword(bCryptPasswordEncoder.encode(registration.getPassword()));
		return new ResponseEntity<Object>(registrationService.save(registration), HttpStatus.OK);
	}

}
