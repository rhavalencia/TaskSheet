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
			e.printStackTrace(); 
			return "Error: Registration failed due to system issues.";
		}
	}

	private boolean isValidPin(String pin) {
		return pin != null && pin.matches("\\d{6,}"); 
	}

	public boolean authenticateUser(String email, String pin) {
		GcashAppUser gCashAppUser = userRepository.findByEmail(email);
		return gCashAppUser != null && PasswordUtils.matches(pin, gCashAppUser.getPin());
	}

	public String changePin(String email, GcashAppUser updatedUser) {
		System.out.println("Searching for user with email: " + email); 
		GcashAppUser existingUser = userRepository.findByEmail(email);

		if (existingUser == null) {
			return "User not found";
		}

		existingUser.setPin(PasswordUtils.hashPassword(updatedUser.getPin()));
		userRepository.save(existingUser);
		return "PIN Updated Successfully";
	}

}
