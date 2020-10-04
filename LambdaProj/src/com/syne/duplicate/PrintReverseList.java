package com.syne.duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.xml.internal.ws.util.StreamUtils;

public class PrintReverseList {

	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		list.stream().forEach(x -> System.out.print(x + " "));  //OR
		list.stream().forEach(System.out::print);
		System.out.println("---------------");
	
		Integer [] arr = new Integer[list.size()];
		
		arr = list.toArray(arr);
		for (int i : arr)
		{
			System.out.println("value of i : " + i);
			System.out.println("---------------");			
		}		
	}
	public void reverse_stream_print() {

	    Stream.of("One", "Two", "Three", "Four")
	            .collect(Collectors.toCollection(LinkedList::new))
	            .descendingIterator().forEachRemaining(System.out::println);

	}
}
