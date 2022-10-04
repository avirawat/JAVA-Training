package com.shristi.atmabstraction;

public class Current extends Account{

	public Current(double balance) {
		super(balance);
		this.balance=balance;
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Current Withdraw "+ amount);
		balance-=amount;
		
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Current Deposit "+ amount);
		balance+=amount;
		
	}

	

}
