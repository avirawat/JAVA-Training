// 1.  Greatest in an array

package com.shristi.training;
import java.util.Scanner;
public class MaxOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int max=0;
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.print("Maximum value is :"+max);
		sc.close();
	}

}
