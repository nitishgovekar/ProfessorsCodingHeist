package com.professors.java8.lambda;

import java.util.List;
import java.util.function.Supplier;

public class FP10FunctionalProgrammingUsingMethodReferences {

	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS",
				"Azure", "Docker");

		courses.stream()
		//.map(eachString -> eachString.toUpperCase())
		.map(String::toUpperCase)
		.forEach(FP10FunctionalProgrammingUsingMethodReferences::print);
	}

	//Method Reference to create new object of String
	Supplier<String> supplier = String::new;

	private static void print(String str) {
		System.out.println(str);
	}
}
