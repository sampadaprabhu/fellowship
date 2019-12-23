package com.bridgelabz.fellowship.AlgorithmPrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		int size=Utility.integerInput();
		int arr[]=new int[size];
		System.out.println("Numbers for bubblesort are: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Utility.integerInput();
		}
		System.out.println("After sorting: ");
		Utility.bubbleSort(arr);

	}

}
