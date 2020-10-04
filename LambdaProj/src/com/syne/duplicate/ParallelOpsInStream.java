package com.syne.duplicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelOpsInStream {

	public static void main(String[] args) 
	{
		System.out.println("Normal Processing...");

		IntStream range = IntStream.rangeClosed(1, 10);
		range.forEach(System.out::println);

		System.out.println("Parallel Processing...");

		IntStream range2 = IntStream.rangeClosed(1, 10);
		range2.parallel().forEach(System.out::println);

		System.out.println("===================================================================");
		System.out.println("Normal Processing...");

		List<String> alpha = getData();
		alpha.stream().forEach(System.out::println);

		System.out.println("Parallel Processing...");

		List<String> alpha2 = getData();
		alpha2.parallelStream().forEach(System.out::println);

	}

	private static List<String> getData() {

		List<String> alpha = new ArrayList<>();

		int n = 97;  // 97 = a , 122 = z
		while (n <= 122) 
		{
			char c = (char) n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
	}
}
