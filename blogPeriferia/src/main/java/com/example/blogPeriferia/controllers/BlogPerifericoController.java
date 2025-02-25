package com.example.blogPeriferia.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogPerifericoController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello, World!";
	}

}
