package com.rhaveeval.gcashapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhaveeval.gcashapp.model.CheckBalance;

@Repository
public interface UserBalanceRepository extends JpaRepository<CheckBalance, Long>{
	CheckBalance findByUserId(Long userId);
}
