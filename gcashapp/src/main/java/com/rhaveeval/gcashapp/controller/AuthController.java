package com.rhaveeval.gcashapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rhaveeval.gcashapp.model.GcashAppUser;
import com.rhaveeval.gcashapp.service.GcashAppUserService;

@RestController
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private GcashAppUserService userService;

	@PostMapping("/register")
	public String register(@RequestBody GcashAppUser gCashAppUser) {
		if (gCashAppUser.getPin() == null || gCashAppUser.getPin().isEmpty()) {
			return "Error: PIN cannot be empty.";
		}
		if (!gCashAppUser.getPin().matches("\\d{6,}")) {
			return "Error: PIN must be at least 6 digits and numeric.";
		}
		if (!gCashAppUser.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
			return "Error: Invalid email format.";
		}

		return userService.registerUser(gCashAppUser);
	}

	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String pin) {
		return userService.authenticateUser(email, pin) ? "Login successful!" : "Invalid credentials";

	}
}
