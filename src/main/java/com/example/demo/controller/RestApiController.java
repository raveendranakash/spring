package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Welcome to Hello World";
	}
	
}
