package com.professors.java8.lambda;

import java.util.List;

public class FP02FunctionalProgrammingWithFilter {


	public static void main(String[] args) {
		List<String> courses = List.of("Spring Boot", "SpringMVC", "API", "Microservices", "Docker");

		printAllCourses(courses);
		printCoursesWithWordSpring(courses);
		printCoursesWithAtleast4Letters(courses);

	}

	private static void printCoursesWithAtleast4Letters(List<String> courses) {
		System.out.println("Courses who have atleast 4 letters:");
		courses.stream()
		.filter(course ->course.length() > 3)
		.forEach(System.out::println);

	}

	private static void printCoursesWithWordSpring(List<String> courses) {
		System.out.println("Courses who have word Spring in them:");

		courses.stream()
		.filter(course -> course.contains("Spring"))
		.forEach(System.out::println);

	}

	private static void printAllCourses(List<String> courses) {
		System.out.println("Priting all courses: ");

		courses.stream()
		.forEach(System.out::println);
	}

}
