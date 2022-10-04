package com.shristi.atmabstraction;

abstract public class Account {
	double balance;
	
	
	public Account(double balance) {
		super();
	}
	abstract void withdraw(double amount);
	abstract void deposit(double amount);
	
	double getBalance() {
		return balance;
	}
	
}
