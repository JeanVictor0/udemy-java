package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosController {

	@GetMapping
	public String get() {
		return "Requisicao get";
	}
	
	@PostMapping
	public String post() {
		return "Requisicao post";
	}
}
