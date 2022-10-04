// 14. pattern 1 23 456 789
package com.shristi.training;
import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int k=1;
	for(int i=0;i<num;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(k++);
		}
		System.out.println();
	}
	sc.close();
	}

}
