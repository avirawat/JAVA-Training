package com.shristi.vehiclaabstraction;

public abstract class Vehical extends Accessories {
	
	String model;
	int price;
	
	abstract void getMilage();
	
	void getDetails() {
		System.out.println("Details: in Vehical");
	}

	 public Vehical(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}

}
