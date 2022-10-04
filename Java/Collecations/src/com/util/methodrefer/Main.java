package com.util.methodrefer;

public class Main {

	public static void main(String[] args) {
		
//	System.out.println("For static method");
		
//	Calculator calc=checker::calcsum;
//	calc.calculate(100, 200);
		
	System.out.println("For instance method");
	
	Checker checker=new Checker();
	Calculator calc=checker::calcsum;
	calc.calculate(10, 20);
	}
}
