package com.shristi.encapsulation;

public class EncapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle=new Vehicle();
		vehicle.setName("Honda");
		vehicle.setPrice(12345);
		vehicle.setMileage(12L);
		vehicle.setAutomatic(true);
		
		System.out.println("Name: "+vehicle.getName());
		System.out.println("Price: "+vehicle.getPrice());
		System.out.println("Mileage: "+vehicle.getMileage());
		System.out.println("Gear : "+vehicle.isAutomatic());
	}

}
