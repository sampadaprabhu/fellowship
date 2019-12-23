package com.bridgelabz.fellowship.utility;

public class PowerOf2 {

	public static void main(String[] args) {
		int number;
		System.out.println("enter the number: ");
		number=Utility.integerInput();
		double power=Utility.powerOfTwo(number);
		System.out.println("Power of 2 upto "+number+" is: "+power);
	}

}
