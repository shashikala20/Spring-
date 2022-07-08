package com.springboot.SpringSecurity.config;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


@Configuration
@SuppressWarnings("deprecation")
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailsService;
	
	
@Bean
	public AuthenticationProvider authProvider() {
		
		DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return provider;
		
	}
	
	
	
	
	
	
	
//	@Override
//	@Bean
//	protected UserDetailsService userDetailsService() {
//		List<UserDetails> list=new ArrayList<>();
//		list.add(User.withDefaultPasswordEncoder().username("venkat").password("1234").roles("USER").build());
//		return new InMemoryUserDetailsManager(list);
//	}

}
