package com.estudos.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.estudos.entities.User;
import com.estudos.repositories.UserRepository;
import com.estudos.utils.Roles;

@Configuration
public class Config implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u = new User(null, "julia", "1234", Roles.ADMIN);
		userRepository.save(u);
		
	}

}
