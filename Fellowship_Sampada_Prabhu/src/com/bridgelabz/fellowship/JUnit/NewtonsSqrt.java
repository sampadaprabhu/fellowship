package com.bridgelabz.fellowship.JUnit;

import com.bridgelabz.fellowship.utility.Utility;

public class NewtonsSqrt {

	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		double number=Utility.doubleInput();
		double epsilon=1e-15;
		double temp=Utility.newtonSqrt(number, epsilon);
		System.out.println("Square root is: "+temp);
	}

}
