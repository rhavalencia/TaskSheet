package com.rhaveeval.gcashapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhaveeval.gcashapp.model.CheckBalance;

@Repository
public interface CheckBalanceRepository extends JpaRepository<CheckBalance, Long> {
	CheckBalance findByGCashAppUserId(Long userId);
}
