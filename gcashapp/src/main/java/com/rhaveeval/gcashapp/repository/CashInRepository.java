package com.rhaveeval.gcashapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhaveeval.gcashapp.model.CashIn;

@Repository
public interface CashInRepository extends JpaRepository<CashIn, Long>{
	CashIn findByTransferToId(Long userId);
	CashIn findByTransferFromId(Long userId);
}
