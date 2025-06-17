package com.rhaveeval.gcashapp.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhaveeval.gcashapp.model.CashIn;
import com.rhaveeval.gcashapp.model.CheckBalance;
import com.rhaveeval.gcashapp.model.GcashAppUser;
import com.rhaveeval.gcashapp.repository.CashInRepository;
import com.rhaveeval.gcashapp.repository.CheckBalanceRepository;
import com.rhaveeval.gcashapp.repository.GcashAppUserRepository;

@Service
public class CashInService {
	
	@Autowired
	private GcashAppUserRepository userRepository;
	
	@Autowired
    private CashInRepository cashInRepository;

	@Autowired
	private CheckBalanceRepository checkBalanceRepository;
	
	public String cashIn(Long senderId, Long receiverId, BigDecimal amount) {
	 
		GcashAppUser sender = userRepository.findById(senderId).orElse(null);
        GcashAppUser receiver = userRepository.findById(receiverId).orElse(null);
		
        
        if (sender == null || receiver == null) {
            return "Error: One or both users do not exist.";
        }

        CheckBalance senderBalance = checkBalanceRepository.findByGCashAppUserId(senderId);
        CheckBalance receiverBalance = checkBalanceRepository.findByGCashAppUserId(receiverId);
        
        if (senderBalance == null || receiverBalance == null) {
            return "Error: One or both users do not have a balance record.";
        }

        if (senderBalance.getAmount().compareTo(amount) < 0) {
            return "Error: Insufficient balance.";
        }

        // Deduct from sender
        senderBalance.setAmount(senderBalance.getAmount().subtract(amount));
        checkBalanceRepository.save(senderBalance);

        // Add to receiver
        receiverBalance.setAmount(receiverBalance.getAmount().add(amount));
        checkBalanceRepository.save(receiverBalance);


        CashIn cashInTransaction = new CashIn();
        cashInTransaction.setAmount(amount);
        cashInTransaction.setDate(LocalDateTime.now());
        cashInTransaction.setTransferFrom(sender);
        cashInTransaction.setTransferTo(receiver);
        
        cashInRepository.save(cashInTransaction);
        
		return "Cash In Succefully";
	}
}
