package com.syne.duplicate;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapOnStream 
{	
	public static void main(String[] args) 
	{
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
	
		//Stream<String[]>
		Stream<String[]> temp = Arrays.stream(data);
	
		//Stream<String>, GOOD!
		Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
	
		Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));
	
		stream.forEach(System.out::println);
}
	/*
	 * In Java 8, Stream can hold different data types, for examples:
	 * 	Stream<String[]>
		Stream<Set<String>>
		Stream<List<String>>
		Stream<List<Object>>
	 * But, the Stream operations (filter, sum, distinct…) and collectors do not support it, so, we need flatMap() to do 
	 * the following conversion :
	 * 	Stream<String[]>		-> flatMap ->	Stream<String>
		Stream<Set<String>>	-> flatMap ->	Stream<String>
		Stream<List<String>>	-> flatMap ->	Stream<String>
		Stream<List<Object>>	-> flatMap ->	Stream<Object>
		
		Example : { {1,2}, {3,4}, {5,6} } -> flatMap -> {1,2,3,4,5,6}
	 * */

}
