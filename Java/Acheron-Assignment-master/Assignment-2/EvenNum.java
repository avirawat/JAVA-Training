/* 3.  Print the even numbers from 1-20 */
package com.shristi.training;
import java.util.Scanner;
public class EvenNum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num%2==0) {
		System.out.print("Even Number");
	}
	else {
		System.out.print("Odd Number");
	}
	sc.close();
	}

}
