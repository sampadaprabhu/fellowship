package com.bridgelabz.fellowship.AlgorithmPrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class MergeSortString {

	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		int size=Utility.integerInput();
		String arr[]=new String[size];
		System.out.println("Enter the string in array: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Utility.stringInput();
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
		Utility.sort(arr, 0, arr.length-1);
		System.out.println("Sorted array is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}

}
