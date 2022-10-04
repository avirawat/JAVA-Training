// 6.  second largest in an array
package com.shristi.training;
import java.util.Scanner;
public class SecondMaxArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int max=0,smax=0;
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]>max) {
				smax=max;
				max=arr[i];	
			}
			else if(arr[i]<max && arr[i]>smax) {
				smax=arr[i];
			}
		}
		System.out.println("Second maximum val is "+smax);
		sc.close();

	}

}
