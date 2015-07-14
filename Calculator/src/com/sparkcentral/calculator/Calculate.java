package com.sparkcentral.calculator;

/**
 * This is a basic implementation of the Calculator class. There is no special
 * functionality. In addition to implementing the basic behavior , you can
 * extend your functionality with additional methods
 * 
 * @author aethena
 *
 */
public class Calculate implements Calculator {
	private Double number1;
	private Double number2;
	private char op;

	/**
	 * You can create object with all three parameters. Constructor with lesser
	 * params is of no use.
	 * 
	 * @param number1
	 * @param number2
	 * @param op
	 */
	public Calculate(Double number1, Double number2, char op) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.op = op;
	}

	/**
	 * Default constructor
	 */
	public Calculate() {
	}

	@Override
	public Double compute(Double number1, Double number2, char op) {
		//call appropriate method based on operator
	}

	@Override
	public Double printResult() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * add method
	 * 
	 * @param number1
	 * @param number2
	 * @param op
	 * @return
	 */
	private Double add(Double number1, Double number2, char op) {
		// perform add
	}

	/**
	 * subtract
	 * 
	 * @param number1
	 * @param number2
	 * @param op
	 * @return
	 */
	private Double subtract(Double number1, Double number2, char op) {
		// perform subtract
	}

	/**
	 * multiply
	 * 
	 * @param number1
	 * @param number2
	 * @param op
	 * @return
	 */
	private Double multiply(Double number1, Double number2, char op) {
		// perform multiply
	}

	/**
	 * divide
	 * @param number1
	 * @param number2
	 * @param op
	 * @return
	 */
	private Double divide(Double number1, Double number2, char op) {
		//use checkDivideByZero()
	}
/**
 * 
 * @param number1
 * @param number2
 * @param op
 * @return
 */
	private Double userdefinedOp(Double number1, Double number2, char op) {
		
	}
	
	/**
	 * To prevent exception while dividing by 0
	 * @return
	 */
	private boolean checkDivideByZero() {
		if (number2 == 0)
			return true;
		else
			return false;
	}

	
	
	/**
	 * @return the number1
	 */
	public Double getNumber1() {
		return number1;
	}

	/**
	 * @param number1
	 *            the number1 to set
	 */
	public void setNumber1(Double number1) {
		this.number1 = number1;
	}

	/**
	 * @return the number2
	 */
	public Double getNumber2() {
		return number2;
	}

	/**
	 * @param number2
	 *            the number2 to set
	 */
	public void setNumber2(Double number2) {
		this.number2 = number2;
	}

	/**
	 * @return the op
	 */
	public char getOp() {
		return op;
	}

	/**
	 * @param op
	 *            the op to set
	 */
	public void setOp(char op) {
		this.op = op;
	}

}
