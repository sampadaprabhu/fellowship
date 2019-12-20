package com.bridgelabz.fellowship.JUnit;

import com.bridgelabz.fellowship.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter the date: ");
		int date = Utility.integerInput();
		System.out.println("Enter the month number: ");
		int month= Utility.integerInput();
		System.out.println("Enter the year:");
		int year= Utility.integerInput();
		int d0=Utility.dayOfWeek(date, month, year);
		switch(d0)
		{
		case 0:
			System.out.println("Sunday");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Enter proper choice");
		}

	}

}
