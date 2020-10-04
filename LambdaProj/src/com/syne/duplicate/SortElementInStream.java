package com.syne.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortElementInStream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ajay", "sharma", "ekta", "dhiman");
		list = list.stream().sorted().collect(Collectors.toList());
		list.forEach(x -> System.out.println(x));
	}

}
