package com.chinche.Aplicacion.service;

import org.springframework.stereotype.Service;

import com.chinche.Aplicacion.entity.User;
@Service
public interface UserSevrice {
	public Iterable<User> getAllUsers();
}
