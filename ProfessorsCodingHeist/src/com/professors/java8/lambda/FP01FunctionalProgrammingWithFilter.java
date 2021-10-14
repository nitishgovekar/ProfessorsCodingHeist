package com.professors.java8.lambda;

import java.util.List;

public class FP01FunctionalProgrammingWithFilter {

	public static void main(String[] args) {
		//Java9 feature List.of to create new List of integers
		List<Integer> listOfNumbers = List.of(10,20,30,40,50,11,13,15,17,18,19,21,23);
		printAllEvenNumbersInList(listOfNumbers);
		printAllOddNumbersFromList(listOfNumbers);
	}
	//Lambda expression, for each number check if number is odd or not 
	private static void printAllOddNumbersFromList(List<Integer> listOfNumbers) {

		System.out.println("List of Odd Numbers");
		listOfNumbers.stream()
		.filter(number-> number%2 != 0)
		.forEach(System.out::println);
	}

	private static void printAllEvenNumbersInList(List<Integer> numbers) {
		System.out.println("List of Even Numbers");
		numbers.stream()
		.filter(number -> number%2 == 0)
		.forEach(System.out::println);
	}
}
