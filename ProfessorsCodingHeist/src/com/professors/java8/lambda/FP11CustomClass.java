package com.professors.java8.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course{

	private String name;
	private String category;
	private int reviewScore;
	private int noOfSubscribers;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public int getNoOfSubscribers() {
		return noOfSubscribers;
	}
	public void setNoOfSubscribers(int noOfSubscribers) {
		this.noOfSubscribers = noOfSubscribers;
	}

	public Course(String name, String category, int reviewScore, int noOfSubscribers) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfSubscribers = noOfSubscribers;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfSubscribers="
				+ noOfSubscribers + "]";
	}
}

public class FP11CustomClass {

	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98,200), 
				new Course("SpringBoot", "Framework", 98, 50),
				new Course("API", "Microservices", 95, 150),
				new Course("Docker", "Cloud", 97, 150),
				new Course("FullStack", "FullStack", 91, 200),
				new Course("Microservices", "Microservices", 99, 50),
				new Course("Azure", "Cloud", 97, 200)
				);

		//allMatch , noneMatch, anyMatch
		Predicate<Course> reviewScoreGreaterThan95 = course -> course.getReviewScore() > 95;
		Predicate<Course> reviewScoreGreaterThan90 = course -> course.getReviewScore() > 90;
		Predicate<Course> reviewScoreLessThan90 = course -> course.getReviewScore() < 90;

		System.out.println("Is reviewScoreGreaterThan95: "+ courses.stream().allMatch(reviewScoreGreaterThan95));
		System.out.println("Is reviewScoreLessThan90: "+ courses.stream().noneMatch(reviewScoreLessThan90));
		System.out.println("Is reviewScoreGreaterThan90: "+ courses.stream().anyMatch(reviewScoreGreaterThan90));

		//Using Comparator to sort the courses
		Comparator<Course> comparingByNumberOfStudentsInIncreasingOrder = Comparator.comparingInt(Course::getNoOfSubscribers);
		Comparator<Course> comparingByNumberOfStudentsInDecreasingOrder = Comparator.comparingInt(Course::getNoOfSubscribers).reversed();
		Comparator<Course> comparingByNumberOfStudentsAndReviewScore = Comparator.comparingInt(Course::getNoOfSubscribers).thenComparingInt(Course::getReviewScore).reversed();

		System.out.println("\ncomparingByNumberOfStudentsInIncreasingOrder"+
				courses.stream()
		.sorted(comparingByNumberOfStudentsInIncreasingOrder)
		.collect(Collectors.toList()));
		// comparingByNumberOfStudentsInIncreasingOrder[Course [name=SpringBoot, category=Framework, reviewScore=98, noOfSubscribers=50], Course [name=Microservices, category=Microservices, reviewScore=99, noOfSubscribers=50], Course [name=API, category=Microservices, reviewScore=95, noOfSubscribers=150], Course [name=Docker, category=Cloud, reviewScore=97, noOfSubscribers=150], Course [name=Spring, category=Framework, reviewScore=98, noOfSubscribers=200], Course [name=FullStack, category=FullStack, reviewScore=91, noOfSubscribers=200], Course [name=Azure, category=Cloud, reviewScore=97, noOfSubscribers=200]]

		System.out.println("comparingByNumberOfStudentsInDecreasingOrder"+
				courses.stream()
		.sorted(comparingByNumberOfStudentsInDecreasingOrder)
		.collect(Collectors.toList()));
		// comparingByNumberOfStudentsInDecreasingOrder[Course [name=Spring, category=Framework, reviewScore=98, noOfSubscribers=200], Course [name=FullStack, category=FullStack, reviewScore=91, noOfSubscribers=200], Course [name=Azure, category=Cloud, reviewScore=97, noOfSubscribers=200], Course [name=API, category=Microservices, reviewScore=95, noOfSubscribers=150], Course [name=Docker, category=Cloud, reviewScore=97, noOfSubscribers=150], Course [name=SpringBoot, category=Framework, reviewScore=98, noOfSubscribers=50], Course [name=Microservices, category=Microservices, reviewScore=99, noOfSubscribers=50]]

		System.out.println("comparingByNumberOfStudentsAndReviewScore"+
				courses.stream()
		.sorted(comparingByNumberOfStudentsAndReviewScore)
		.collect(Collectors.toList()));
		// comparingByNumberOfStudentsAndReviewScore[Course [name=Spring, category=Framework, reviewScore=98, noOfSubscribers=200], Course [name=Azure, category=Cloud, reviewScore=97, noOfSubscribers=200], Course [name=FullStack, category=FullStack, reviewScore=91, noOfSubscribers=200], Course [name=Docker, category=Cloud, reviewScore=97, noOfSubscribers=150], Course [name=API, category=Microservices, reviewScore=95, noOfSubscribers=150], Course [name=Microservices, category=Microservices, reviewScore=99, noOfSubscribers=50], Course [name=SpringBoot, category=Framework, reviewScore=98, noOfSubscribers=50]]

		System.out.println( "Limiting the output to 5 results only: "+
				courses.stream()
		.sorted(comparingByNumberOfStudentsInIncreasingOrder)
		.limit(5)
		.collect(Collectors.toList()));
		//Limiting the output to 5 results only: [Course [name=SpringBoot, category=Framework, reviewScore=98, noOfSubscribers=50], Course [name=Microservices, category=Microservices, reviewScore=99, noOfSubscribers=50], Course [name=API, category=Microservices, reviewScore=95, noOfSubscribers=150], Course [name=Docker, category=Cloud, reviewScore=97, noOfSubscribers=150], Course [name=Spring, category=Framework, reviewScore=98, noOfSubscribers=200]]

		System.out.println("Skipping top 3 results: "+ 
				courses.stream()
		.sorted(comparingByNumberOfStudentsInIncreasingOrder)
		.skip(3)
		.limit(5)
		.collect(Collectors.toList()));
		//Skipping top 3 results: [Course [name=Docker, category=Cloud, reviewScore=97, noOfSubscribers=150], Course [name=Spring, category=Framework, reviewScore=98, noOfSubscribers=200], Course [name=FullStack, category=FullStack, reviewScore=91, noOfSubscribers=200], Course [name=Azure, category=Cloud, reviewScore=97, noOfSubscribers=200]]

		System.out.println(
				courses.stream()
		.takeWhile(course->course.getReviewScore()>=95)
		.collect(Collectors.toList()));
		// [Course [name=Spring, category=Framework, reviewScore=98, noOfSubscribers=200], Course [name=SpringBoot, category=Framework, reviewScore=98, noOfSubscribers=50], Course [name=API, category=Microservices, reviewScore=95, noOfSubscribers=150], Course [name=Docker, category=Cloud, reviewScore=97, noOfSubscribers=150]]
		
		System.out.println(courses.stream().max(comparingByNumberOfStudentsAndReviewScore));
		//Optional[Course [name=SpringBoot, category=Framework, reviewScore=98, noOfSubscribers=50]]

		System.out.println(courses.stream().min(comparingByNumberOfStudentsAndReviewScore));
		//Optional[Course [name=Spring, category=Framework, reviewScore=98, noOfSubscribers=200]]
		
		//Returns average of number of subscribers that are present for the courses whose review score is greater than 95
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95).mapToInt(course -> course.getNoOfSubscribers()).average());
		//Returns total  of number of courses that are present for the courses whose review score is greater than 95
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95).mapToInt(course -> course.getNoOfSubscribers()).count());
		//Returns sum of total  number of subscribers that are present for the courses whose review score is greater than 95
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95).mapToInt(course -> course.getNoOfSubscribers()).sum());
		//Returns max number of subscribers that are present for the courses whose review score is greater than 95
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95).mapToInt(course -> course.getNoOfSubscribers()).max());
		//Returns min number of subscribers that are present for the courses whose review score is greater than 95
		System.out.println(courses.stream().filter(reviewScoreGreaterThan95).mapToInt(course -> course.getNoOfSubscribers()).min());
	}
}
