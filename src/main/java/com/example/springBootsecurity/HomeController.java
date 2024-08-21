package com.example.springBootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	

	@GetMapping("/login")
	public String login() {
		return "login";
	}

}
