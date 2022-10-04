package com.shristi.overloading;

public class ClassOverloadMain {

	public static void main(String[] args) {
	Employee obj1=new Employee("Avi","Manager");
	Employee obj2=new Employee("Pankaj","Programmer");
	Employee obj3=new Employee("Rahul","Director");
	
	System.out.println("Total Allowance is "+obj2.calcBonus(4872.2));
	System.out.println("Total Allowance is "+obj1.calcBonus(4872.2,4589.8));
	System.out.println("Total Allowance is "+obj3.calcBonus(4872.2,4589.8,5000.5));
	}

}
