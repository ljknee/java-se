package com.kaunghtetaung.source;

public class DividedByZero {

	public static void main(String[] args) {

		try {
			System.out.println(3 / 0);
		} catch (ArithmeticException e) {
			System.out.printf("Caught Runtime Exception = %s", e);
		}

	}

}
