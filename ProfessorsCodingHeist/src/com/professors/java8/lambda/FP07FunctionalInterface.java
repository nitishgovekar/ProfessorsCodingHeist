package com.professors.java8.lambda;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP07FunctionalInterface {
	public static void main(String[] args) {

		List<Integer> numbers = List.of(10,20,7,9,8,5,100,10,100,20,8,9,5);

		// Internal Working of Predicate Functionalinterface
		Predicate<Integer> internalWorkingOfPredicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer number) {
				return number%2 == 0;
			}
		};

		// Internal Working Of Function FunctionalInterface
		Function<Integer, Integer> internalWorkingOfFunction = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer number) {
				return number*2;
			}
		};

		// Internal Working of Consumer Interface
		Consumer<Integer> internalWorkingOfConsumer = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		numbers.stream().filter(internalWorkingOfPredicate).map(internalWorkingOfFunction).forEach(internalWorkingOfConsumer);
	
		BinaryOperator<Integer> sumBinaryOperator = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer number1, Integer number2) {
				return number1 + number2;
			}
		};
		
		int sum = numbers.stream().reduce(0, sumBinaryOperator);
		
		System.out.println("Sum of all the numbers present in the List is : "+ sum);
		
	}
}