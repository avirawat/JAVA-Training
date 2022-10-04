package com.shristi.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Bank obj1=new Bank(20000);
	//System.out.println(obj1.getBalance());
	int choice;
	System.out.println("Enter Your Choice\n 1. Balance 2. withdraw 3. Deposit , 0. Exit");
	do{
		choice =sc.nextInt();
		double totalBalance=obj1.getBalance();
		switch(choice) {
			case 1:
				System.out.println("Balance in Account: "+obj1.getBalance());
				break;
			case 2:
				System.out.println("Enter Amount to withdraw");
				double money1=sc.nextInt();
				if(money1>totalBalance) {
					System.out.println("Sorry! Insufficient Amount");
				}
				else {
					obj1.withdraw(money1);
					System.out.println("Balance in Account: "+obj1.getBalance());
				}
				break;
			case 3:
				System.out.println("Enter Amount to Deposit");
				int money2=sc.nextInt();
				obj1.deposit(money2);
				System.out.println("Balance in Account: "+obj1.getBalance());
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Wrong choice");
		}
	} while(choice!=0);
	sc.close();
	}

}
