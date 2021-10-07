package com.professors.java8.lambda;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		//Java9 feature List.of to create new List of integers
		printAllNumbersInListFunctional(List.of(10,20,30,40,50));

	}
	//In functional approach we focus on what to do
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//This is nothing but Method Reference
		System.out.println("Method Reference Example:");
		numbers.stream().forEach(FP01Functional::printTheNumber);
		
		//Their is another way to print as well without using method reference
		System.out.println("Without using method Reference");
		numbers.stream().forEach(System.out::println);
	}

	private static void printTheNumber(int number) {
		System.out.println(number);
	}
}	
