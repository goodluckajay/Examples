package com.syne.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapElementInStream {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5);
        List<Integer> collect1 = num.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(collect1); //[2, 4, 6, 8, 10]
        
        System.out.println("----------------------------------");
        List<String> alpha = Arrays.asList("a", "b", "c", "d");
        List<String> collect = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect); //[A, B, C, D]
        

	}

}
