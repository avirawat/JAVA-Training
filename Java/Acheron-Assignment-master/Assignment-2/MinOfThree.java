/* 2.  Find the smallest of three numbers using 
  short circuit AND. Use Scanner to get user input
 */
package com.shristi.training;
import java.util.Scanner;
public class MinOfThree {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	if(x<y && x<z) {
		System.out.print("smallest number x= "+x);
	}
	else if(y<x && y<z) {
		System.out.print("smallest number y= "+y);
	}
	else {
		System.out.print("smallest number z= "+z);
	}
	sc.close();
	}

}
