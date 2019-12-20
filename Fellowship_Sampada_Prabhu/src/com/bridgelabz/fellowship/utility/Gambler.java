package com.bridgelabz.fellowship.utility;

public class Gambler {

	public static void main(String[] args) {
		System.out.println("How many times you want to play: ");
		int times=Utility.integerInput();
		
		System.out.println("Enter the stake/cash: ");
		int stake=Utility.integerInput();
		
		System.out.println("Enter the goal: ");
		int goal=Utility.integerInput();
		
		Utility.gambler(times, stake, goal);
	}
}
