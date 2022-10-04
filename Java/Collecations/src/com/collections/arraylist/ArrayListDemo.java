package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
	List list=new ArrayList();
	list.add("Ram");
	list.add(10);
	System.out.println(list);
	Iterator<E> i=list.iterator();
	while(i.hasNext()) {
		String object=(String)i.next();
		System.out.println(object);
	}
	}

}
