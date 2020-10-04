package com.syne.duplicate;

import java.util.Arrays;

public class ReduceElementInStream 
{
	public static void main(String[] args) 
	{
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		System.out.println("sum : " + sum); // 55
		int methodReferenceSum = Arrays.stream(numbers).reduce(0, Integer::sum);
		System.out.println("methodReferenceSum : " + methodReferenceSum); // 55
		int methodReferenceSustraction = Arrays.stream(numbers).reduce(0, (a, b) -> a - b); 
		System.out.println("methodReferenceSustraction : " + methodReferenceSustraction); // -55
	}
}

// NOTE : reduce() is termination operator
/*
	T reduce(T identity, BinaryOperator<T> accumulator)   --- Stream.java
	int reduce(int identity, IntBinaryOperator op) ---------- IntStream.java
	long reduce(int identity, LongBinaryOperator op) -------- LongStream.java
	
	Where :
	identity = default or initial value.
	BinaryOperator = functional interface, take two values and produces a new value.

*/