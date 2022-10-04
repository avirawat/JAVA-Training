package com.shristi.bank;

public class Bank {

	double balance;
	
	Bank(double balance) {
		this.balance=balance;
	}
	
	public void withdraw(double x) {
		balance=balance-x;
	}
	public void deposit(double x) {
		balance=balance+x;
	}
	
	double getBalance() {
		return balance;
	}
}
