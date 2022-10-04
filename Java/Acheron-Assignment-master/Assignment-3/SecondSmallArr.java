// 5.  second smallest in an array
package com.shristi.training;
import java.util.Scanner;
public class SecondSmallArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int min=99999;
		int smin=99999;
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<min) {
				smin=min;
				min=arr[i];	
			}
			else if(arr[i]>min && arr[i]<smin) {
				smin=arr[i];
			}
		}
		System.out.println("Second minimum val is "+smin);
		sc.close();
	}

}
