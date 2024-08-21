package com.example.springBootsecurity;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

public class SecurityConfig extends WebSecurityConfiguration {
	
	protected void Configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().anyRequest().authenticated().and().formLogin().loginPage("/login").permitAll().and().logout().permitAll();
		
	}
	

}
