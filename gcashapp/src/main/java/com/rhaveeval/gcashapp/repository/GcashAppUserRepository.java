package com.rhaveeval.gcashapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhaveeval.gcashapp.model.GcashAppUser;

@Repository
public interface GcashAppUserRepository extends JpaRepository<GcashAppUser, Long>{
	GcashAppUser findByEmail(String email);
}
