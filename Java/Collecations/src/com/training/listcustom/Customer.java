package com.training.listcustom;

public class Customer {
	
	String name,city;
	Long mobile;
	
	public Customer() {
		super();
	}
	
	public Customer(String name, String city, Long mobile) {
		super();
		this.name = name;
		this.city = city;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", city=" + city + ", mobile=" + mobile + "]";
	}
	
}
