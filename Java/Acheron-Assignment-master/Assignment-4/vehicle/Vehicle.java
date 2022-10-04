package com.shristi.vehicle;

public class Vehicle {
	String name;
	String model;
	double price;
	
	Vehicle(String name,String model,double price) {
		this.name=name;
		this.model=model;
		this.price=price;
	}
	
	public void getDetails() {
		System.out.println("Vehicle name "+name);
		System.out.println("Vehicle model "+model);
		System.out.println("Vehicle price "+price);
	}
}
