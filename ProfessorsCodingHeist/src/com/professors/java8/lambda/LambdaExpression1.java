package com.professors.java8.lambda;

public class LambdaExpression1 {

	public static void main(String[] args) {

		// Addition using Lambda Expression
		ArithematicOperations addition = (num1, num2) -> (num1+num2);
		
		System.out.println("Addition of 2 numbers will be " + addition.operation(10, 20));
		
		//Substraction using Lambda Expression
		ArithematicOperations substraction =  (num1, num2) -> (num1-num2);
		
		System.out.println("Substraction of 2 number will be "+ substraction.operation(20, 10));
		
		// Multiapplication using Lambda Expression
		
		ArithematicOperations multiplication = (num1, num2) -> num1 * num2;
		System.out.println("Multiplication of 2 numbers will be "+ multiplication.operation(20, 50));
		
	}
	

}
