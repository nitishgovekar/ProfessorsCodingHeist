package com.professors.java8.lambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP08BehaviorParameterization {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10,20,7,9,8,5,100,10,100,20,8,9,5);

		filterAndPrintData(numbers, num -> num%2==0, "Print Even Numbers");
		filterAndPrintData(numbers, num -> num%2!=0, "Print Odd Numbers");
		filterAndPrintData(numbers, num -> num%3==0, "Print Numbers Divisible by 3");
		
		mapDataAndPrint(numbers, num -> num*num, "Print Square of each numbers");
		mapDataAndPrint(numbers, num -> num*num*num, "Print Cube of each numbers");
	}

	private static void mapDataAndPrint(List<Integer> numbers, Function<Integer, Integer> function, String message) {
		System.out.println(message);
		numbers.stream().map(function).forEach(System.out::println);
	}

	private static void filterAndPrintData(List<Integer> numbers, Predicate<Integer> predicate, String message) {
		System.out.println(message);
		numbers.stream().filter(predicate).forEach(System.out::println);
	}
}