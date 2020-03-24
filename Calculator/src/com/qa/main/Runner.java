package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculate = new Calculator();
		System.out.println(calculate.addNumbers(9, 7));
		System.out.println(calculate.MultiplicateNumbers(9, 7));
		System.out.println(calculate.SubtractNumbers(9, 7));
		System.out.println(calculate.DivideNumbers(9, 7));
		System.out.println(calculate.DivideNumbers(9, 11));

	}

}
