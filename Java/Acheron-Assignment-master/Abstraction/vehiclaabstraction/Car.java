package com.shristi.vehiclaabstraction;

public class Car extends Vehical {

	public Car(String model, int price) {
		super(model, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	void getDetails() {
		System.out.println("Details in car");
	}

	@Override
	void internal() {
		System.out.println("Internal");
	}

	@Override
	void external() {
		System.out.println("External");
	}

	void getMilage() {
		System.out.println("Milage 60km per ltr");

	}

}
