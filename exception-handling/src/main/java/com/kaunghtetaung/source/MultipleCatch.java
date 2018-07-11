package com.kaunghtetaung.source;

import javax.swing.JOptionPane;

public class MultipleCatch {

	public static void main(String[] args) {

		try {

			String data = JOptionPane.showInputDialog("Enter your data!");

			int divisor = Integer.parseInt(data);

			System.out.println(3 / divisor);

		} catch (NumberFormatException nfe) {
			System.out.printf("Exception caught by this program : Enter numeric value!", nfe);
		} catch (ArithmeticException are) {
			System.out.printf("Exception caught by this program : Divisor is Zero!", are);
		}

	}

}
