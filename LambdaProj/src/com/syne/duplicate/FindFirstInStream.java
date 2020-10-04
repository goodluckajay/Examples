package com.syne.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstInStream 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(6, 2, 3, 2, 1);

		Optional<Integer> first = list.stream().findFirst();
		if (first.isPresent()) 
		{
			Integer result = first.get();
			System.out.println(result);      
		}
		else
		{
			System.out.println("no value?");
		}

		Optional<Integer> first2 = list.stream().filter(x -> x < 2).findFirst();
		if (first2.isPresent()) {
			System.out.println(first2.get()); 
		} else {
			System.out.println("no value?");
		}
		System.out.println("----------------------- Another Example ------------------------------");
		List<String> list1 = Arrays.asList("node", "java", "python", "ruby");

        Optional<String> result = list1.stream()
						                .filter(x -> !x.equalsIgnoreCase("node"))
						                .findFirst();

        if (result.isPresent()) {
            System.out.println(result.get()); // java
        } else {
            System.out.println("no value?");
        }
	}

}
