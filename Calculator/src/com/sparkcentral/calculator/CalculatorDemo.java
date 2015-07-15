package com.sparkcentral.calculator;


/**
 * This class is responsible for demonstrating different types of classes
 * 
 * @author aethena
 *
 */
public class CalculatorDemo {
	public static void main(String[] args) {
		System.out.println("This is a demo of different kinds of calculations");
		StandardCalculator standardCalculator = new StandardCalculator();
		// use standard calculator
		standardCalculator.runCalculator();
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		// use Scientific Calculator

	}
}
