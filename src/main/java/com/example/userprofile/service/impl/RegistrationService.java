package com.example.userprofile.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.userprofile.dao.IRegistrationDao;
import com.example.userprofile.entity.Registration;
import com.example.userprofile.service.IRegistrationService;

@Service
public class RegistrationService implements IRegistrationService{

	@Autowired
	private IRegistrationDao registrationDao;
	
	@Override
	public Registration save(Registration registration) {
		// TODO Auto-generated method stub
		return registrationDao.save(registration);
	}
}