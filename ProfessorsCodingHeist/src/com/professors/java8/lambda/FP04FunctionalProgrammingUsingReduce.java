package com.professors.java8.lambda;

import java.util.List;

public class FP04FunctionalProgrammingUsingReduce {


	public static void main(String[] args) {

		List<Integer> numbers = List.of(10,20,7,9,8,5,100);
		int sum = addAllElementsOfList(numbers);
		System.out.println("Addition of all numbers is "+ sum);

	}
	private static int addAllElementsOfList(List<Integer> numbers) {

		return numbers.stream().reduce(0, (num1, num2) -> num1+num2);
	}

}
