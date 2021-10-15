package com.professors.java8.lambda;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOperations {

	public static void main(String[] args) {
		//Stream created with help of Wrapper Class
		System.out.println(Stream.of(10,20,03,10));
		// java.util.stream.ReferencePipeline$Head@7960847b

		int[] numberArray = {10,20,30,40};

		//Primitive Stream
		System.out.println(Arrays.stream(numberArray));
		//java.util.stream.IntPipeline$Head@16f65612

		System.out.println(Arrays.stream(numberArray).summaryStatistics());
	
		System.out.println(IntStream.range(0, 100).average());
		
		System.out.println(IntStream.iterate(1,  number->number+2).limit(5).peek(System.out::println).sum());
	
		System.out.println(IntStream.iterate(2, number ->number*2).limit(10).boxed().collect(Collectors.toList()));
	}

}
