package com.sparkcentral.calculator;

/**
 * This interface contains basic behavior of a Calculator
 * 
 * @author aethena
 *
 */
public interface Calculator {
	//computation behavior 
	public Double compute(Double number1, Double number2, char op);

	//printResult
	public Double printResult();

}
