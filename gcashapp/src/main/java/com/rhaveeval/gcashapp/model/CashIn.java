package com.rhaveeval.gcashapp.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.*;

@Entity
@Table
public class CashIn {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(nullable = false)
	    private BigDecimal amount;

	    @Column(nullable = false)
	    private LocalDateTime date;

	    @ManyToOne
	    @JoinColumn(name = "transfer_to", nullable = false)
	    private GcashAppUser transferTo;

	    @ManyToOne
	    @JoinColumn(name = "transfer_from", nullable = false)
	    private GcashAppUser transferFrom;

		public CashIn() {
			super();
		}

		public CashIn(Long id, BigDecimal amount, LocalDateTime date, GcashAppUser transferTo, GcashAppUser transferFrom) {
			super();
			this.id = id;
			this.amount = amount;
			this.date = date;
			this.transferTo = transferTo;
			this.transferFrom = transferFrom;
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

		public LocalDateTime getDate() {
			return date;
		}

		public void setDate(LocalDateTime date) {
			this.date = date;
		}

		public GcashAppUser getTransferTo() {
			return transferTo;
		}

		public void setTransferTo(GcashAppUser transferTo) {
			this.transferTo = transferTo;
		}

		public GcashAppUser getTransferFrom() {
			return transferFrom;
		}

		public void setTransferFrom(GcashAppUser transferFrom) {
			this.transferFrom = transferFrom;
		}

}
