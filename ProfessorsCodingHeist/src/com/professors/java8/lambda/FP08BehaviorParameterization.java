package com.professors.java8.lambda;

import java.util.List;
import java.util.function.Predicate;

public class FP08BehaviorParameterization {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(10,20,7,9,8,5,100,10,100,20,8,9,5);

		filterAndPrintData(numbers, num -> num%2==0);
		filterAndPrintData(numbers, num -> num%2!=0);
		filterAndPrintData(numbers, num -> num%3==0);

	}

	private static void filterAndPrintData(List<Integer> numbers, Predicate<Integer> predicate) {
		numbers.stream().filter(predicate).forEach(System.out::println);
	}
}