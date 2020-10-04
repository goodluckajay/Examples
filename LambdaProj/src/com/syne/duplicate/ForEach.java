package com.syne.duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// NOTE: forEach() is applicable for both List and Map. forEach() for List and Map takes Consumer and BiConsumer respectively.
public class ForEach {

	public static void main(String[] args) 
	{
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
		
		System.out.println("------------------ LIST -------------------");
		
		List<String> list = new ArrayList<>();
		list.add("ajay");
		list.add("dhiman");
		list.add("synechron");
		list.forEach(x -> System.out.println(x));
	}
}
