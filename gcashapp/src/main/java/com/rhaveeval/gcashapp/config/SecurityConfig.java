package com.rhaveeval.gcashapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> auth.requestMatchers("/auth/**").permitAll()
				.requestMatchers("/user/**").permitAll()
				.requestMatchers("/balance/**").permitAll()
				.requestMatchers("/transaction/**").permitAll()
				.anyRequest().authenticated()).csrf(csrf -> csrf.disable()) 
				.sessionManagement(session -> session.disable()) 
				.httpBasic(httpBasic -> httpBasic.disable()) 
				.formLogin(form -> form.disable());

		return http.build();
	}

	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
