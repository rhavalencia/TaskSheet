package com.rhaveeval.gcashapp.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhaveeval.gcashapp.model.CashIn;
import com.rhaveeval.gcashapp.model.GcashAppUser;
import com.rhaveeval.gcashapp.repository.CashInRepository;
import com.rhaveeval.gcashapp.repository.GcashAppUserRepository;

@Service
public class CashInService {

	@Autowired
	private CashInRepository cashInRepository;

	@Autowired
	private GcashAppUserRepository userRepository;

	public String recordTransaction(Long senderId, Long receiverId, BigDecimal amount) {
		GcashAppUser sender = userRepository.findById(senderId).orElse(null);
		GcashAppUser receiver = userRepository.findById(receiverId).orElse(null);
		if (sender == null || receiver == null) {
			return "Error: One or both users do not exist.";
		}
		
		CashIn transaction = new CashIn();
		transaction.setAmount(amount);
		transaction.setDate(LocalDateTime.now());
		transaction.setTransferFrom(sender);
		transaction.setTransferTo(receiver);
		
		cashInRepository.save(transaction);
		return "Transaction Recorded";
	}
	
	public List<CashIn> getTransactionsByUser(Long userId){
		return cashInRepository.findByTransferToId(userId);
	}
	
}
