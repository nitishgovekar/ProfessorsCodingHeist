package com.professors.java8.lambda;

import java.util.List;

public class FP03FunctionalProgrammingWithMap {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring Boot", "SpringMVC", "API", "Microservices", "Docker");
		List<Integer> numbers = List.of(10,20,7,9,8,5,100);
		printNumberOfCharactersInCourses(courses);
		printCubesOfOddNumbers(numbers);
		multiplyEachNumberBy2(numbers);
	}

	private static void multiplyEachNumberBy2(List<Integer> numbers) {
		System.out.println("Multiply each number by 2");
		numbers.stream().map(number -> number * 2 ).forEach(System.out::println);
	}

	private static void printNumberOfCharactersInCourses(List<String> courses) {
		courses.stream()
		.map(course -> course + " " + course.length())
		.forEach(System.out::println);
	}

	private static void printCubesOfOddNumbers(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2 != 0)
		.map(number -> number*number*number)
		.forEach(System.out::println);
	}
}
