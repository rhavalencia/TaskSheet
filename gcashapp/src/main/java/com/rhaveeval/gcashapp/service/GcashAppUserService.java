package com.rhaveeval.gcashapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhaveeval.gcashapp.model.GcashAppUser;
import com.rhaveeval.gcashapp.repository.GcashAppUserRepository;
import com.rhaveeval.gcashapp.util.PasswordUtils;

@Service
public class GcashAppUserService {

	@Autowired
	private GcashAppUserRepository userRepository;

	public String registerUser(GcashAppUser gCashAppUser) {
		try {
			if (userRepository.findByEmail(gCashAppUser.getEmail()) != null) {
				return "User already exists!";
			}

			if (!isValidPin(gCashAppUser.getPin())) {
				return "Error: PIN must be numeric and at least 6 digits long!";
			}

			gCashAppUser.setPin(PasswordUtils.hashPassword(gCashAppUser.getPin()));
			userRepository.save(gCashAppUser);
			return "Registration successful!";
		} catch (Exception e) {
			e.printStackTrace(); // Log error for debugging
			return "Error: Registration failed due to system issues.";
		}
	}

	private boolean isValidPin(String pin) {
		return pin != null && pin.matches("\\d{6,}"); // Ensure it's numeric & at least 6 digits
	}

	public boolean authenticateUser(String email, String pin) {
		GcashAppUser gCashAppUser = userRepository.findByEmail(email);
		return gCashAppUser != null && PasswordUtils.matches(pin, gCashAppUser.getPin());
	}

}
