package com.bridgelabz.fellowship.AlgorithmPrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class Regex {

	public static void main(String[] args) {
		String string="Hello <<name>>,We have your full name as<<full name>> in our system.\n"
				+"Your contact no. is 91-xxxxxxxxxx \n"
				+"Please let us know in case of clarification Thank you Bridgelabz xx/xx/xxxx.";
		
			System.out.println(string);
			System.out.println();
			System.out.println("Enter user name: ");
			String username=Utility.stringInput();
			System.out.println("Enter your full name: ");
			String fullname=Utility.stringInput();
			System.out.println("Enter your contact number: ");
			String contactnumber=Utility.stringInput();
			System.out.println("Enter the date: ");
			String date=Utility.stringInput();
			Utility.regex(username, fullname, contactnumber, date, string);
	}

}
