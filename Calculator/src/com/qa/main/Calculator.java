package com.qa.main;

public class Calculator {
	

	public int addNumbers(int numberOne, int numberTwo) {
		return numberOne + numberTwo;
	}
	
	public int MultiplicateNumbers(int numberOne, int numberTwo) {
		return numberOne * numberTwo;
	}
	
	public int SubtractNumbers(int numberOne, int numberTwo) {
		return numberOne - numberTwo;
	}
	
	public double DivideNumbers(double numberOne, double numberTwo) {
		if (numberOne / numberTwo < 1) {
			System.out.println("Number is lower than 0");
			return 0;
		}
		return numberOne / numberTwo;
	}


}
