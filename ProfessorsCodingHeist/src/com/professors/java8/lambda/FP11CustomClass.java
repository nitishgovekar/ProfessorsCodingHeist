package com.professors.java8.lambda;

import java.util.List;
import java.util.function.Predicate;

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
				new Course("SpringBoot", "Framework", 96, 50),
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

		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95));
		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90));
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan90));

	}
}
