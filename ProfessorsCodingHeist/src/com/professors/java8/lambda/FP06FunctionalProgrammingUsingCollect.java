package com.professors.java8.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class FP06FunctionalProgrammingUsingCollect {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(10,20,7,9,8,5,100,10,100,20,8,9,5);
		List<String> courses = List.of("Spring Boot", "SpringMVC", "API", "Microservices", "Docker");
		List<Integer> numbers2 = squareTheList(numbers);
		List<Integer> lengthOfCourses = lengthOfAllCourses(courses);

		numbers2.stream().forEach(System.out::println);
		lengthOfCourses.forEach(System.out::println);
	}
	
	private static List<Integer> lengthOfAllCourses(List<String> courses) {
		return courses.stream().map(eachCourse -> eachCourse.length()).collect(Collectors.toList());
	}

	private static List<Integer> squareTheList(List<Integer> numbers) {
		return numbers.stream().distinct().map(eachNumber -> eachNumber * eachNumber).collect(Collectors.toList());
	}
}
