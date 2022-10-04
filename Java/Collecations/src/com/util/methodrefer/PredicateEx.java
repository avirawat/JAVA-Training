package com.util.methodrefer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EmpDetails{
	void printBonus(Predicate<String>pred,String desg,int amount,Consumer<Integer>con) {
		System.out.println("checking Bonus");
		if(pred.test(desg)) {
			System.out.println("Manager bonus");
			con.accept(amount);
		}
		else {
			System.out.println("No Bonus");
		}
	}
	void checkStatus(BiConsumer<String,Integer>con,String name,int age) {
		System.out.println("Welcome to voting App");
		con.accept(name, age);
	}
}
public class PredicateEx {

	public static void main(String[] args) {
		
		EmpDetails empdetails=new EmpDetails();
		empdetails.checkStatus((name,age)->{
			if(age>18) System.out.println("Eligible to vote "+name);
		},"priya",20);
		empdetails.printBonus(
				(str)->str.equals("Manager"),
				"Manager", 
				8000,
				(num)->System.out.println("Bonus "+num*2));

	}

}
