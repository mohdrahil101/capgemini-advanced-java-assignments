package com.capgemini.hibernate.Mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String accountNumber;
	private String accountType;
	
	@OneToOne(mappedBy="account")
	private Customer customer;
	public Account() {
		
	}
	public Account(String accountNumber, String accountType) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
	}
	public final Long getId() {
		return id;
	}
	public final void setId(Long id) {
		this.id = id;
	}
	public final String getAccountNumber() {
		return accountNumber;
	}
	public final void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public final String getAccountType() {
		return accountType;
	}
	public final void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public final Customer getCustomer() {
		return customer;
	}
	public final void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountType=" + accountType + ", customer="
				+ customer + "]";
	}
	
	
}
