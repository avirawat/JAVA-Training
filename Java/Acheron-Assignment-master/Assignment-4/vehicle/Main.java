/* 1.  Write a program to print the vehicle details.

class Vehicle

Has properties as name, model, price.

Has parameterized constructor

Has method as void getDetails() to print the details of the vehicle

class Main

Has PSVM - create two vehicle objects and call the method
*/
package com.shristi.vehicle;
public class Main {

	public static void main(String[] args) {
	Vehicle obj1=new Vehicle("Avinash","AQ",12000);
	Vehicle obj2=new Vehicle("Deep","GH",20000);
	obj1.getDetails();
	System.out.println();
	obj2.getDetails();

	}

}
