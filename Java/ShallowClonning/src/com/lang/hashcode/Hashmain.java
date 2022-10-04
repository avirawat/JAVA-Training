package com.lang.hashcode;

public class Hashmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle("city","Honda","white");
		Vehicle v2=new Vehicle("city","Honda","white");
		Vehicle v3=new Vehicle("civic","Honda","black");
		
		System.out.println("v1 and v2 "+v1.equals(v2));
		System.out.println("v1 and v3 "+v1.equals(v3));
		System.out.println("v2 and v2 "+v2.equals(v3));
		
		System.out.println("v1-hashcode "+v1.hashCode());
		System.out.println("v2-hashcode "+v2.hashCode());
		System.out.println("v3-hashcode "+v3.hashCode());

	}

}
