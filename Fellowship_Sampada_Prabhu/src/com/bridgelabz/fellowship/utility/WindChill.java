package com.bridgelabz.fellowship.utility;

public class WindChill {

	public static void main(String[] args) {
		System.out.println("Enter the temperature: ");
		double temp=Utility.doubleInput();
		System.out.println("Enter the wind speed: ");
		double ws=Utility.doubleInput();
		Utility.windChill(temp, ws);

	}

}
