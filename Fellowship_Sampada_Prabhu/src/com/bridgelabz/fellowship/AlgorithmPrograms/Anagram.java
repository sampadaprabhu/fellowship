package com.bridgelabz.fellowship.AlgorithmPrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter the 1st string: ");
		String string1=Utility.stringInput();
		System.out.println("Enter the 2nd string: ");
		String string2=Utility.stringInput();
		Utility.anagram(string1, string2);

	}

}
