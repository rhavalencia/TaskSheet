package com.rhaveeval.gcashapp.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rhaveeval.gcashapp.service.CashInService;

@RestController
@RequestMapping("/transaction")
public class CashInController {
	
	@Autowired
	private CashInService cashInService;
	
	@PostMapping("/cash_in")
	public String cashIn(@RequestParam Long senderId,
						 @RequestParam Long receiverId,
						 @RequestParam BigDecimal amount) {
		return cashInService.cashIn(senderId, receiverId, amount);
	}
}
