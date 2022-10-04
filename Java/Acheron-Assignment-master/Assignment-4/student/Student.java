package com.shristi.student;

public class Student {
	String name;
	int studId;
	int[] marks;

	Student(String name, int studId, int[] marks) {
		this.name = name;
		this.studId = studId;
		this.marks = marks;
	}

	void getDetails() {
		System.out.println("Name Of Student: " + name);
		System.out.println("Id Of Student: " + studId);
	}

	String getGrades() {
		int sum = 0;
		int len = marks.length;
		double ave = 0.00;
		for (int val : marks) {
			sum += val;
		}
		ave = sum / len;
		if (ave >= 90) {
			return "A";
		} else if (ave < 90 && ave >= 80) {
			return "B";
		} else {
			return "C";
		}
	}
}
