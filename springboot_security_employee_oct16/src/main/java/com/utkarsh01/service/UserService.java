package com.utkarsh01.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.utkarsh01.entity.MyOwnUser;
import com.utkarsh01.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{
	
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyOwnUser> optuser=repository.findByUsername(username);
		if(optuser.isPresent())
			return optuser.get();
		throw new UsernameNotFoundException("User name is not found, Try again !!");
	}
	
	
}
