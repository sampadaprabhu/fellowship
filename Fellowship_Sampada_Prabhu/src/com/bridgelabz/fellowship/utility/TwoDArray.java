package com.bridgelabz.fellowship.utility;

import java.io.PrintWriter;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("Enter the no. of rows: ");
		int rows=Utility.integerInput();
		System.out.println("Enter the no. of columns: ");
		int cols=Utility.integerInput();
		Utility.twoDArray(rows, cols);
	}

}
