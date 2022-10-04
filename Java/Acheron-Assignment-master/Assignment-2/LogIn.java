/* 7.  Create a class called Login. 
 * Create a string array of usernames in PSVM.
 *  Get user input using scanner as (“Enter username to login”).
 *   If name exists, print message as ”You are logged in successfully”. 
 *   If name does not exist, print message as ”Invalid username”.
 */
package com.shristi.training;

import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String userNameArr[]= {"avi1048","ravi123","thala12","mahi123"};
	System.out.println("Enter username to login:");
	String userName=sc.nextLine();
	int flag=0;
	for(String val:userNameArr) {
		if(userName.equals(val)) {
			System.out.println("You are logged In Successfully as "+userName);
			flag=1;
			break;
		}
	}
	if(flag==0) {
		System.out.println("Invalid User name");
	}
	sc.close();

	}

}
