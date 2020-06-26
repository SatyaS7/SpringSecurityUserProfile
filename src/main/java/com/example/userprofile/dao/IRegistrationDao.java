package com.example.userprofile.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userprofile.entity.Registration;

public interface IRegistrationDao extends JpaRepository<Registration, Long>{

}
