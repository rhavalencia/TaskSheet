package com.rhaveeval.gcashapp.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rhaveeval.gcashapp.model.CashIn;
import com.rhaveeval.gcashapp.service.CashInService;

@RestController
@RequestMapping("/transaction")
public class CashInController {
	
	@Autowired
	private CashInService cashInService;
	
	@PostMapping("/record")
	public String recordTransaction(@RequestParam Long senderId,
									@RequestParam Long receiverId,
									@RequestParam BigDecimal amount) {
		return cashInService.recordTransaction(senderId, receiverId, amount);
	}
	
	@GetMapping("/history/{userId}")
    public List<CashIn> getTransactionHistory(@PathVariable Long userId) {
        return cashInService.getTransactionsByUser(userId);
    }

}
