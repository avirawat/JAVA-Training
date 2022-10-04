package com.shristi.vehiclaabstraction;

public class Main {

	public static void main(String[] args) {
	Car obj1=new Car("ABC",123);
	obj1.internal();
	obj1.external();
	
	obj1.getDetails();
	obj1.getMilage();
	
	System.out.println("Model "+obj1.model);
	System.out.println("Price "+obj1.price);
	}

}
