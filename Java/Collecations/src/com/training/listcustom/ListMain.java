package com.training.listcustom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


	 class sortByName implements Comparator<Customer>{
		public int compare(Customer o1,Customer o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
 
	 class sortByCity implements Comparator<Customer>{
		public int compare(Customer o1,Customer o2) {
			return o1.getCity().compareTo(o2.getCity());
		}
	}
public class ListMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customerList=new ArrayList<>();
		Customer customer1=new Customer("Ram","Chennai",3783823L);
		Customer customer2=new Customer("John","Mangalore",3238933L);
		Customer customer3=new Customer("Heidi","ooty",293823823L);
		Customer customer4=new Customer("Mirchi","Bangalore",5683823L);
		Customer customer5=new Customer("Raja","Pune",2183823L);
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		System.out.println("Normal Value");
		Iterator i=customerList.iterator();
		while(i.hasNext()) {
			Customer customer=(Customer) i.next();
			System.out.println(customer);
		}
		System.out.println("sorted By Name");
		Collections.sort(customerList,new sortByName());
		Iterator itr=customerList.iterator();
		while(itr.hasNext()) {
			Customer customer=(Customer) itr.next();
			System.out.println(customer);
		}
		System.out.println("sorted By city");
		Collections.sort(customerList,(v1,v2)->{
			return v1.getCity().compareTo(v2.getCity());
		});
		Iterator it=customerList.iterator();
		while(it.hasNext()) {
			Customer customer=(Customer) it.next();
			System.out.println(customer);
		}
	}

}
 
