/* 1.  Find the greatest of three numbers 
 using ternary operator . Give values directly
 */
package com.shristi.training;

public class MaxOfThree {

	public static void main(String[] args) {
	int x=25,y=10,z=17;
	String res=(x>y && x>z)?"X is greatest number":(y>z)?"Y is greatest number":"Z is greatest number";
	System.out.print(res);
	}

}
