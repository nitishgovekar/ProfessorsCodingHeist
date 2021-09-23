package com.professors.java8.lambda;

public class LambdaExpression1 {

	public static void main(String[] args) {

		// Addition using Lambda Expression
		ArithematicOperations addition = (num1, num2) -> (num1+num2);
		
		System.out.println("Addition = " + addition.operation(10, 20));
		
		//Substraction using Lambda Expression
		ArithematicOperations substraction =  (num1, num2) -> (num1-num2);
		
		System.out.println("Substraction =  "+ substraction.operation(20, 10));
		
		// Multiplication using Lambda Expression
		
		ArithematicOperations multiplication = (num1, num2) -> num1 * num2;
		System.out.println("Multiplication =  "+ multiplication.operation(20, 50));
		
		
		//Divison using Lambda Expression 
		
		ArithematicOperations divide = (num1, num2) -> num1 / num2;
		System.out.println("Divison = "+divide.operation(10, 5));
	}
	

}
