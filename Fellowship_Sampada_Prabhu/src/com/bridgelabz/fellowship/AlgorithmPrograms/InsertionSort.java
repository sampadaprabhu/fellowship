package com.bridgelabz.fellowship.AlgorithmPrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		/*System.out.println("Enter the size of string: ");
		int size=Utility.integerInput();*/
		String[] str= {"sam","sahi","hanu","ganya"};
		
		/*System.out.println("Enter the String: ");
		for(int i=0;i<str.length;i++)
		{
			str[i]=Utility.stringInput();
		}*/
		String[] arr=Utility.insertionSort(str);
//		System.out.println(arr);
		for(String s: arr)
		{
			System.out.println(s);
		}

	}

}
