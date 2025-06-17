package com.rhaveeval.gcashapp.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhaveeval.gcashapp.model.CheckBalance;
import com.rhaveeval.gcashapp.repository.CheckBalanceRepository;

@Service
public class CheckBalanceService {
	
	@Autowired
	private CheckBalanceRepository checkBalanceRepository;
	
    public CheckBalance getUserBalance(Long userId) {
        return checkBalanceRepository.findByGCashAppUserId(userId);
    }

}
