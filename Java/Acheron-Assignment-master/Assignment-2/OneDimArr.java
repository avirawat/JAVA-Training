/* 4.  Create a one dimensional array of type int and 
 	populate it using values from scanner. 
 	Find the sum and average.
 */
package com.shristi.training;

import java.util.Scanner;

public class OneDimArr {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int index=sc.nextInt();
	int []arr=new int[index];
	for(int i=0;i<index;i++) {
		arr[i]=sc.nextInt();
	}
	int sum=0;
	double ave=0.00f;
	for(int val:arr) {
		sum+=val;
	}
	ave=(double)sum/index;
	System.out.println("Sum "+sum);
	System.out.println("Average "+ave);
	sc.close();
	}

}
