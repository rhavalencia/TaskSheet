package com.rhaveeval.gcashapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhaveeval.gcashapp.model.CheckBalance;
import com.rhaveeval.gcashapp.repository.UserBalanceRepository;

@Service
public class CheckBalanceService {
	
	@Autowired
	private UserBalanceRepository userBalanceRepository;
	
	public CheckBalance getUserBalance(Long userId) {
		return userBalanceRepository.findByUserId(userId);
	}
}
