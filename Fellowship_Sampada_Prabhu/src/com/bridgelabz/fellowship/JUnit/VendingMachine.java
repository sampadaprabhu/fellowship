package com.bridgelabz.fellowship.JUnit;

import com.bridgelabz.fellowship.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("Enter the rupees that you have to change: ");
		int rupees=Utility.integerInput();
		Utility.vendingMachine(rupees);
	}
}
