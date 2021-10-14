package com.professors.java8.lambda;

import java.util.List;

public class FP05FunctionalProgrammingUsingReduceExamples {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10,20,7,9,8,5,100);
		performReduceOperations(numbers);
	}
	private static void performReduceOperations(List<Integer> numbers) {

		int aggregate = numbers.stream().reduce(0, (num1, num2) -> num1+num2);
		//Here the first parameter in the reduce will be the MIN Value that an integer can have
		int largestNumber = numbers.stream().reduce(Integer.MIN_VALUE, (num1, num2) -> num1 > num2 ? num1:num2);
		//Here the first parameter in the reduce will be the MAX Value that an integer can have
		int  smallestNumber = numbers.stream().reduce(Integer.MAX_VALUE, (num1, num2)-> num1 < num2 ? num1:num2);

		System.out.println("Aggregate of the list is: "+ aggregate);
		System.out.println("The largestNumber in the list is "+ largestNumber);
		System.out.println("The smallestNumber in the list is "+ smallestNumber);
	}
}
