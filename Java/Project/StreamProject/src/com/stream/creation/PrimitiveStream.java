package com.stream.creation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class PrimitiveStream {

	public static void main(String[] args) {
		
		System.out.println("Sorted Terminal........");
		Arrays.asList("java","Hibernate","react","angular")
				.stream()
				.map(String::toLowerCase)
				.sorted()
				.collect(Collectors.toList())
				.forEach(System.out::println);
		System.out.println("Reduce method........");
		Arrays.asList(10,20,39,40)
		.stream()
		.reduce((x,y)->x+y)
		.ifPresent(System.out::println);
		
		System.out.println("\nPrimitive ");
		
		LongStream.of(90,100,200,300,20)
		.filter((x)->x>100)
		.average()
		.ifPresent(System.out::println);
		
		int res=Arrays.asList("Article","Arav","Juno","Scooby")
		.stream()
		.map(x->x.length())
		.mapToInt(Integer::new )
		.sum();
		System.out.println(res);
	}
	

}
