package com.sparkcentral.calculator;

import java.util.Scanner;

public class StandardCalculator {
	Scanner scanner;
	String expression;

	public StandardCalculator() {
		scanner = new Scanner(System.in);
	}

	public void runCalculator() {
		System.out.println("Enter an expression");
		expression = scanner.nextLine();
		if (validate(expression)) {
			process(expression);
		} else {
			// you can have a user defined exception
			throw new Exception("Improper format");
		}

	}

	private void process(String expression2) {
		// TODO Auto-generated method stub
		Double[] numbers;
		char[] operator;

		// based on precedence call compute Calculate

	}

	/**
	 * Take operators and returns precedence
	 * 
	 * @param op1
	 * @param op2
	 * @return
	 */
	private boolean takesPrecedence(char op1, char op2) {

	}

	private boolean validate(String expression2) {
		// TODO handle logic to validate the expression

	}

}
