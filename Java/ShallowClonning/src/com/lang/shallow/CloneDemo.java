package com.lang.shallow;

public class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student("Ram",10);
		System.out.println(student);
		Student students1=null;
		try {
			students1 = (Student) student.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println(students1);
		
	}

}
