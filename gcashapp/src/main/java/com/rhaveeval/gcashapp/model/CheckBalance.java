package com.rhaveeval.gcashapp.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table
public class CheckBalance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private BigDecimal amount;
	
	@OneToOne
	@JoinColumn(name = "user_id", nullable = false)
	private GcashAppUser gCashAppUser;

	public CheckBalance() {
		super();
	}

	public CheckBalance(Long id, BigDecimal amount, GcashAppUser gCashAppUser) {
		super();
		this.id = id;
		this.amount = amount;
		this.gCashAppUser = gCashAppUser;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public GcashAppUser getgCashAppUser() {
		return gCashAppUser;
	}

	public void setgCashAppUser(GcashAppUser gCashAppUser) {
		this.gCashAppUser = gCashAppUser;
	}
	
	
}
