package com.bridgelabz.fellowship.utility;

public class FlipCoin {

	public static void main(String[] args) {
		int chances;
		System.out.println("Enter the chances: ");
		chances=Utility.integerInput();
		Utility.flipCoinPercentage(chances);
	}

}
