/* 5.  Create a one dimensional array of type int and 
 *  populate it using values from scanner. Get the square
 *  root of each number and populate in another array.
 *  Print the new array.
 */
package com.shristi.training;

import java.util.Scanner;

public class OneDimRoot {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int index=sc.nextInt();
	double []arr=new double[index];
	double []res=new double[index];
	for(int i=0;i<index;i++) {
		arr[i]=sc.nextInt();
	}
	int i=0;
	for(double val:arr) {
		res[i++]=Math.sqrt(val);
	}
	for(double result:res) {
		System.out.println((int)result);
	}
	sc.close();
	}

}
