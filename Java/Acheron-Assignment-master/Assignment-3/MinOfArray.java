// 2.  Smallest in an array

package com.shristi.training;
import java.util.Scanner;
public class MinOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int min=99999;
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.print("Minimum value is :"+min);
		sc.close();
	}

	}

