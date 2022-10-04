package com.shristi.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		// sc.nextLine();
		int studId = sc.nextInt();
		int[] marks = new int[5];
		for (int i = 0; i < 5; i++) {
			marks[i] = sc.nextInt();
		}
		Student obj1 = new Student(name, studId, marks);
		obj1.getDetails();
		System.out.println(obj1.getGrades());
		sc.close();
	}

}
