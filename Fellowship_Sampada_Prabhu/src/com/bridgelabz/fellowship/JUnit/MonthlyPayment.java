package com.bridgelabz.fellowship.JUnit;

import com.bridgelabz.fellowship.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {
		System.out.println("Enter the Principal Amount: ");
		double principal_amount=Utility.doubleInput();
		
		System.out.println("Enter the year: ");
		double year=Utility.doubleInput();
		
		System.out.println("Enter the interest: ");
		double interest=Utility.doubleInput();
		Utility.monthlyPayment(principal_amount, year, interest);

	}

}
