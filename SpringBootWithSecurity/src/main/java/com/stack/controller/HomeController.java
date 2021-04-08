package com.stack.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hp")
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "wel-come to home controller";
	}
}
