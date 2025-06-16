package com.rhaveeval.gcashapp.model;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "balance")
public class CheckBalance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private BigDecimal amount;
	
	@OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private GcashAppUser user;

	public CheckBalance() {
		super();
	}

	public CheckBalance(Long id, BigDecimal amount, GcashAppUser user) {
		super();
		this.id = id;
		this.amount = amount;
		this.user = user;
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

	public GcashAppUser getUser() {
		return user;
	}

	public void setUser(GcashAppUser user) {
		this.user = user;
	}
	
	
}
