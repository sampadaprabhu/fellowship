package com.bridgelabz.fellowship.utility;

import java.util.Arrays;

public class BubbleSortString {
	public static void main(String[] args) {
		String arr[]=new String[5];
		System.out.println("Enter the string: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Utility.stringInput();
		}
		Utility.bubbleSortString(arr);
		System.out.println(Arrays.toString(arr));
	}
}
