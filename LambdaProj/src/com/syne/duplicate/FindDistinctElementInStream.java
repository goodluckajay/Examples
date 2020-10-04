package com.syne.duplicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class FindDistinctElementInStream 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "C");
		 
		// Get collection without duplicate i.e. distinct only
		List<String> distinctElements = list.stream().distinct().collect(Collectors.toList());
		 
		//Let's verify distinct elements
		distinctElements.forEach(System.out::println);
	}

}
