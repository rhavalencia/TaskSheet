package com.rhaveeval.gcashapp.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	private static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	public static String hashPassword(String pin) {
		 if (pin == null || pin.isEmpty()) {
	            throw new IllegalArgumentException("Password cannot be null or empty");
	        }
	        return passwordEncoder.encode(pin);

	}
	
	public static boolean matches(String pin, String encodedPin) {
		  if (encodedPin == null || encodedPin == null) {
	            return false;
	        }
	        return passwordEncoder.matches(pin, encodedPin);

	}
	
}