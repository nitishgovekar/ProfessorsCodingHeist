package com.professors.java8.lambda;

import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP09FunctionalProgramming {

	public static void main(String[] args) {
		Supplier<Integer> randomIntegerSupplier = () ->{
			Random randomNumber = new Random();
			return  randomNumber.nextInt(100);
		};
		System.out.println(randomIntegerSupplier.get());
		
		UnaryOperator<Integer> unaryOperations = (number)-> number * 5;
		
		System.out.println(unaryOperations.apply(10));
		
		BiPredicate<Integer, Integer> biPredicate = (number1, number2) -> number1>number2;
		System.out.println(biPredicate.test(10, 20));
		
		BiFunction<String, String, String> biFunction = (name1, name2)->name1.length()>name2.length()?name1:name2;

		System.out.println(biFunction.apply("Nitishsss", "Govekar"));
		
	}

}
