package com.bridgelabz.fellowship.AlgorithmPrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class PermutationOfString {

	public static void main(String[] args) {
		String string;
		System.out.println("Enter the string to permute: ");
		string=Utility.stringInput();
		int size=string.length();
		Utility.permute(string, 0, size);

	}
	

}
