package com.bridgelabz.fellowship.utility;

import java.util.Scanner;

public class BinarySearchNumber {
	public static void main(String[] args) {
		int a[]=new int[5];
		
		System.out.println("Enter the numbers in array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=Utility.integerInput();
		}
		System.out.println("Enter number to search: ");
		int n=Utility.integerInput();
		
		Utility.binarySearchNumber(a,n);
		
	}

}
