package com.rhaveeval.gcashapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhaveeval.gcashapp.model.GcashAppUser;
import com.rhaveeval.gcashapp.service.GcashAppUserService;

@RestController
@RequestMapping("/user")
public class GcashAppUserController {
	
	@Autowired
	private GcashAppUserService userService;
	
	@PutMapping("change_pin/{email}")
	public String changePin(@PathVariable String email,
							@RequestBody GcashAppUser updatedUser) {
		return userService.changePin(email, updatedUser);
	}
}
