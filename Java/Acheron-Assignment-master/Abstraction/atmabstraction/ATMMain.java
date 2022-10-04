package com.shristi.atmabstraction;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Account type:-\n S as Savings Account\n C as Current Account ");
		String accType;
			accType=sc.nextLine();
			int choice;
			   if(accType.equals("S")) {
				   System.out.println("Saving Account\n Enter: 1 Witdraw\n 2 Deposit\n 3 balance \n 4 for exit");
				   Account account=new Saving(1000);
				   do {
						
						choice=sc.nextInt();
//						Account account=new Saving(1000);
					switch(choice) {
							case 1:
								System.out.println("Enter amount to witdraw : ");
								int money1=sc.nextInt();
								account.withdraw(money1);
								System.out.println("Balance "+account.getBalance());
								break;
							case 2:
								System.out.println("Enter amount to Deposit : ");
								int money2=sc.nextInt();
							    account.deposit(money2);
								System.out.println("Balance "+account.getBalance());
							    break;
					    	case 3:
					    		System.out.println("Total Balance is "+account.getBalance());
							    break;
							case 4:
								System.exit(0);
							default:
								System.out.println("Wrong input ");
						}
				   }while(choice!=4);
			   }
			   else if(accType.equals("C")){
				   System.out.println("Current Account\n Enter: 1 Witdraw\n 2 Deposit\n 3 balance \n 4 for exit");
				   Account account=new Current(1000);
				   do {
					   
						choice=sc.nextInt();
						
					switch(choice) {
							case 1:
								System.out.println("Enter amount to witdraw : ");
								int money1=sc.nextInt();
								account.withdraw(money1);
								System.out.println("Balance "+account.getBalance());
								break;
							case 2:
								System.out.println("Enter amount to Deposit : ");
								int money2=sc.nextInt();
							    account.deposit(money2);
								System.out.println("Balance "+account.getBalance());
							    break;
					    	case 3:
					    		System.out.println("Total Balance is "+account.getBalance());
							    break;
							case 4:
								System.exit(0);
							default:
								System.out.println("Wrong input ");
						}
				   }while(choice!=4);
			   }
			   else {
				   System.out.println("Type of Account is wrong");
			   }
		sc.close();

	}

}
