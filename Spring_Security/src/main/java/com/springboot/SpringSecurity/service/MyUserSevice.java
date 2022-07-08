package com.springboot.SpringSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.SpringSecurity.entity.UserData;
import com.springboot.SpringSecurity.repo.MyRepo;
import com.springboot.SpringSecurity.user.UserPrinciple;

@Service
public class MyUserSevice implements UserDetailsService {
	
	@Autowired
	private MyRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserData user=repo.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("ERROR 404");
		}
		return new UserPrinciple(user);
	}

}
