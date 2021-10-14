package com.professors.java8.lambda;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		//Java9 feature List.of to create new List of integers
		printAllNumbersInListStructured(List.of(10,20,30,40,50));
	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		//How to loop the numbers in the structured way
		for(int number : numbers) {
			System.out.println(number);
		}
	}
}	
