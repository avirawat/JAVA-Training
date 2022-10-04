package com.stream.creation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class TerminalOpr {

	public static void main(String[] args) {
	
		String first=Arrays.asList("hi","Welcome","Avinash","Avinash")
				.stream()
				//.distinct()
				//.skip(2)
				//.filter((w)->(w.length()>2))
				.map(String::toUpperCase)
				.findFirst()
				.filter((x)->x.startsWith("H"))
				.orElse("No Match");
				//.forEach(System.out::println);
		System.out.println(first);
		
	
		System.out.println("Sorted New Line........");

	}

}
