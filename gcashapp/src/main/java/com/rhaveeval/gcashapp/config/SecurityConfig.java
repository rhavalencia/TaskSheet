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
		http.authorizeHttpRequests(auth -> auth.requestMatchers("/auth/**").permitAll() // Allow public access to
																						// authentication routes
				.anyRequest().authenticated()).csrf(csrf -> csrf.disable()) // Disable CSRF for API access
				.sessionManagement(session -> session.disable()) // Disable session-based authentication
				.httpBasic(httpBasic -> httpBasic.disable()) // Disable default Basic Auth
				.formLogin(form -> form.disable()); // Disable default login page redirect

		return http.build();
	}

	@Bean
	BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
