package com.stream.creation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
	List<String>myList=Arrays.asList("hi","Welcome","Avinash","Avinash");
	Stream<String>IStream=myList.stream().distinct().skip(2).filter((w)->(w.length()>2));
	Iterator<String>itr=IStream.iterator();
	while(itr.hasNext()) {
		String word=itr.next();
		System.out.println(word+" ");
	}
	System.out.println("Sorted New Line........");
	Iterator<String>sorted=Arrays.asList("java","Hibernate","react","angular")
			.stream()
			.filter((v1)->v1.length()>4)
			.sorted()
			.iterator();
	while(sorted.hasNext()) {
		String word=sorted.next();
		System.out.println(word+" ");
	}
	
	System.out.println("Map New Line.....");
	Iterator<String>upper=Arrays.asList("java","Hibernate","react","angular")
			.stream()
			.filter((v1)->v1.length()>4)
			.map((x)->x.toUpperCase())
			.sorted()
			.iterator();
	while(upper.hasNext()) {
		String word=upper.next();
		System.out.println(word+" ");
	}
	String[] myArr=new String[] {"Hi","Avinash","welcome"};
	Stream<String>myStream=Stream.of(myArr);
	
	Stream<String>emStream=Stream.empty();
	
	Stream<String>infiStream=Stream.generate(()->{
		return "Hello";
	});
	
	Stream<Double>infiStream1=Stream.generate(Math::random);
	}

}
