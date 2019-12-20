package com.bridgelabz.fellowship.utility;

public class SumOfThreeIntegers {

	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		int size=Utility.integerInput();
		int arr[]=new int[size];
		System.out.println("Enter the numbers in array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Utility.integerInput();
		}
		Utility.sumOfThreeIntegers(arr);

	}

}
