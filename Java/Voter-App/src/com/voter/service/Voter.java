package com.voter.service;

public class Voter {    //model class
	
	int age;
	int id;
	String locality;
	
	public Voter(int age, int id, String locality) { //constructors
		super();
		this.age = age;
		this.id = id;
		this.locality = locality;
	}
	//Getter Setter Methods
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	//ToString methods
	@Override
	public String toString() {
		return "Voter [age=" + age + ", id=" + id + ", locality=" + locality + "]";
	}
	
	
    	
}
