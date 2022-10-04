// 17. count the duplicates in an array
package com.shristi.training;
import java.util.Scanner;
public class DuplicateValArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int count=0;
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
		}
		System.out.print("Duplicate number is: "+count);
		sc.close();

	}

}
