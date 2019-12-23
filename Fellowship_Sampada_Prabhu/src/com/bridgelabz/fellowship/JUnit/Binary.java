package com.bridgelabz.fellowship.JUnit;

import com.bridgelabz.fellowship.utility.Utility;

public class Binary {

	public static void main(String[] args) {
		System.out.println("Enter the Number: ");
		int number=Utility.integerInput();
		int swap=Utility.swapNibbles(number);
		System.out.println("After Swap: "+swap);
		if(Utility.powerOf(swap)==true)
		{
			System.out.println("Number is power of 2");
		}
		else
		{
			System.out.println("Number is not power of 2");
		}
	}

}
