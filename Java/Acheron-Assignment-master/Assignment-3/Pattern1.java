// 13. pattern 1 22 333 4444

package com.shristi.training;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	for(int i=0;i<num;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(i+1);
		}
		System.out.println();
	}
	sc.close();
	}

}
