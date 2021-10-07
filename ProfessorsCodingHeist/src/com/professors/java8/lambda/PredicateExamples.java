package com.professors.java8.lambda;

import java.util.function.Function;

public class PredicateExamples {

	public static void main(String[] args) {
		
		//This predicate will remove whitespace from the string 
		Function<String, String> function1 = s->s.replaceAll(" ", "");
		String name ="Welcome To Professor's Class";
		System.out.println(function1.apply(name));
		
		//Here in this function we are passing String as the parameter and returnig parameter would be integer
		Function <String, Integer> function2 = s->s.length();

		if(function2.apply(name) > 25) {
			System.out.println("The organization length is small!!!");
		}
		
	}

}
