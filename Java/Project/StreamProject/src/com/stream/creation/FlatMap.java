package com.stream.creation;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
	String[][] arrTwo=new String[][] { {"Ram","Tom","Ram","Shyam"},
		{"Zeena","Meena","Reena","Rohan"}};
	
	Stream<String[]>oneStream=Arrays.stream(arrTwo);
	Stream<String>ostream=oneStream
			.flatMap((row)->Arrays
			.stream(row)
			.distinct());
	Iterator<String>itr=ostream.iterator();
	while(itr.hasNext()) {
		String val=itr.next();
		System.out.println(val);
	}
	}

}
