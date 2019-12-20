package com.bridgelabz.fellowship.utility;

public class EuclideanDistance {

	public static void main(String[] args) {
		System.out.println("Enter the first number: ");
		int x=Utility.integerInput();
		System.out.println("Enter the second number: ");
		int y=Utility.integerInput();
		Utility.euclideanDistance(x, y);
	}
}
