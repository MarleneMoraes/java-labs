package main.java.com.calculator;

public class Calculator {
	private double number1;
	private double number2;

	public Calculator() {
		this.number1 = 0;
		this.number2 = 0;
	}

	public Calculator(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public double sum(double number1, double number2) {
		return number1 + number2;
	}

	public double sub(double number1, double number2) {
		return number1 - number2;
	}

	public double mult(double number1, double number2) {
		return number1 * number2;
	}

	public double div(double number1, double number2) {
		return number1 / number2;
	}

	public double pow(double number1, double number2) {
        	return Math.pow(number1,number2);
    }

	public double sin(double number1) {
		return Math.sin(number1);
	}

	public double cos(double number1) {
		return Math.cos(number1);
	}

	public double tan(double number1) {
		return Math.tan(number1);
	}
}
