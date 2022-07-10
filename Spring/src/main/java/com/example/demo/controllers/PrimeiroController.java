package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
//	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	@GetMapping(path = {"/ola","/saudacao"})
	public String ola() {
		return "Ola Spring Boot";
	}
	
	@PostMapping(path = "/saudacao")
	public String saudacao() {
		return "Ola Spring Boot";
	}
}
