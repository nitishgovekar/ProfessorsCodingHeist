package com.professors.java8.lambda;

import java.util.function.Function;

public class FunctionsDemo {

	public static void main(String[] args) {

	 Function<String, Integer> f = s ->s.length();	
	 System.out.println(f.apply("nitish"));
	
	}

}
