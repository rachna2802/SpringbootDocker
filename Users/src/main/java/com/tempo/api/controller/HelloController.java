package com.tempo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@GetMapping("/hello")
	public String sayHello(){
		return "Welcome to the first spring boot docker application";
	}

}
