package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String>hashmap=new HashMap<Integer,String>();
		hashmap.put(1,"Zeena");
		hashmap.put(3,"Raju");
		hashmap.put(null,"karthy");
		hashmap.put(2,null);
		Set<Integer>set=hashmap.keySet();
		Iterator<Integer>itr=set.iterator();
		while(itr.hasNext()) {
			Integer key=itr.next();
			System.out.println(hashmap.get(key));
		}
	}

}
