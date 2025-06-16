package com.rhaveeval.gcashapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rhaveeval.gcashapp.model.CashIn;

@Repository
public interface CashInRepository extends JpaRepository<CashIn, Long>{
    List<CashIn> findByTransferToId(Long userId);
    List<CashIn> findByTransferFromId(Long userId);

}
