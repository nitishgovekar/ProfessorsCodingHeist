package com.professors.java8.lambda;

import java.util.Comparator;
import java.util.List;

public class FP05FunctionalProgrammingUsingDistinctAndSorted {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(10,20,7,9,8,5,100,10,100,20,8,9,5);
		getDistinctNumbersFromList(numbers);

	}
	private static void getDistinctNumbersFromList(List<Integer> numbers) {
		//Prints all the distinct  values
		numbers.stream().sorted().forEach(System.out::print);
		numbers.stream().distinct().sorted((num1, num2)-> Integer.compare(num1, num2)).forEach(System.out::println);
		System.out.println("List of Numbers in Reverse Order: ");
		numbers.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}
}
