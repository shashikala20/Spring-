package com.springboot.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.SpringSecurity.repo.MyRepo;


@Controller
public class HelloController {
	private MyRepo repo;
	
	@RequestMapping("/")
	public String print() {
		return "world.html";
	}
	

}
