package com.rhaveeval.gcashapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rhaveeval.gcashapp.model.CheckBalance;
import com.rhaveeval.gcashapp.service.CheckBalanceService;

@RestController
@RequestMapping("/balance")
public class CheckBalanceController {
	
	@Autowired
	private CheckBalanceService checkBalanceService;
	
	@GetMapping("/{userId}")
	public CheckBalance getBalance(@PathVariable Long userId) {
		return checkBalanceService.getUserBalance(userId);
	}
}
