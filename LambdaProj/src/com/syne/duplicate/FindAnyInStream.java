package com.syne.duplicate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyInStream {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 7, 3, 4, 5, 6, 7, 8, 9, 10);

        Optional<Integer> any = list.stream().filter(x -> x > 1).findAny();
        if (any.isPresent()) {
            Integer result = any.get();
            System.out.println(result);
        }
	}
}
// Note: o/p is not guaranteed as findAny() can return any no.