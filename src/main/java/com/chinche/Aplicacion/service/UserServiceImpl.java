package com.chinche.Aplicacion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinche.Aplicacion.entity.User;
import com.chinche.Aplicacion.repository.UserRepository;

@Service
public class UserServiceImpl implements UserSevrice {

	@Autowired
	UserRepository repository;
	@Override
	public Iterable<User> getAllUsers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
