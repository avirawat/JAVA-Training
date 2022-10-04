/* 6.  Create a class called Registration. 
 * Create a string array of usernames in PSVM. 
 * Get user input using scanner as (“Enter name to register”). 
 * If name already exists, print message as ”Name is not unique”.
 *  If name does not exist, print message as ”You are registered”.
 */
package com.shristi.training;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String arr[]= {"avi","ravi","thala","mahi"};
	System.out.println("Enter name to Register");
	String name=sc.nextLine();
	int flag=0;
	for(String val:arr) {
		if(name.equals(val)) {
			System.out.println("Name is not Unique");
			flag=1;
			break;
		}
	}
	if(flag==0) {
		System.out.println("You are Registered with "+name);
	}
	sc.close();
	}

}
