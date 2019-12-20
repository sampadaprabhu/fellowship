package com.bridgelabz.fellowship.JUnit;

import com.bridgelabz.fellowship.utility.Utility;

public class TemperatureConversion {

	public static void main(String[] args) {
		System.out.println("Enter the temperature in celsius: ");
		float celsius=Utility.floatInput();
		System.out.println("Enter the temperature in fahrenheit: ");
		float fahrenheit=Utility.floatInput();
		Utility.temperatureConversion(celsius, fahrenheit);
	}

}
