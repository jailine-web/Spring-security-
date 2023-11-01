package com.estudos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.estudos.repositories.UserRepository;

@Service
public class UserServiceDetails implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepositoryUD;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return userRepositoryUD.findByUsername(username);
	}

	
}
