// 8.  sum and avg of all digits in array

package com.shristi.training;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		int []arr=new int[index];
		for(int i=0;i<index;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		double ave;
		for(int val:arr) {
			sum+=val;
		}
		ave=(double)sum/index;
		System.out.println("Sum "+sum);
		System.out.println("Average "+ave);
		sc.close();

	}

}
