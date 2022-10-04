package com.shristi.atmabstraction;

public class Saving extends Account {

	public Saving(double balance) {
		
		super(balance);
		this.balance=balance;
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Saving Withdraw Amount= "+amount);
		balance-=amount;

	}

	@Override
	void deposit(double amount) {
		System.out.println("Saving Deposit Amount "+amount);
		balance+=amount;

	}

}
