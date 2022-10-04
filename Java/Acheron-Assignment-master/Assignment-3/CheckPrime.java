// 12. prime
package com.shristi.training;
import java.util.Scanner;
public class CheckPrime {

	static void chekPrime(int num) {
		if(num==0 || num==1) {
			System.out.print("Not prime");
		}
		else {
			int flag=0;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					flag=1;
					System.out.print("Not Prime");
					break;
				}
			}
			if(flag==0)
			System.out.print("Prime number");
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	chekPrime(num);
	sc.close();
	}

}
