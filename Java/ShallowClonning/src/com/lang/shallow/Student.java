package com.lang.shallow;

public class Student implements Cloneable {
		
	String name;
	int studentId;
	
	public Student(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		System.out.println("Clonnning...");
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student name ="+ name+" Student Id= "+studentId;
	}
//	BiConsumer<String,Integer>bicon=(str1,num)->System.out.println(str1.concat(toString(1)));
//	bicon.accept("Avinash",1);
//	Biconsumer<String,Integer>bicon=(name,age)->System.out.println((age>=18)?"Eligible":"not eligible");
//	bicon.accept("Avi",17);
}
