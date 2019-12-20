package com.bridgelabz.fellowship.utility;

public class Quadratic {

	public static void main(String[] args) {
		System.out.println("Enter the first num: ");
		int a=Utility.integerInput();
		System.out.println("Enter the second num: ");
		int b=Utility.integerInput();
		System.out.println("Enter the third num: ");
		int c=Utility.integerInput();
		Utility.quadratic(a, b, c);
	}
}
