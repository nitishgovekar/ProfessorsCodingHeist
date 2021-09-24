package com.professors.java8.lambda;

public class LambdaExpression2 {
	
	public static void main (String args[]) {
		
		//String concatenation using Lambda Expression
		StringOperations opr1 = (str1, str2) -> str1.concat(str2);
		
		System.out.println(opr1.operations("Nitish", "Govekar"));
		
		//Converting String2 to uppercase
		StringOperations opr2 = (str1, str2) -> str2.toUpperCase();
		
		System.out.println(opr2.operations("nitish", "govekar"));
	}

}
