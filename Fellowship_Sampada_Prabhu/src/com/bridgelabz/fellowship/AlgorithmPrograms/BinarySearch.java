package com.bridgelabz.fellowship.AlgorithmPrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class BinarySearch {

	public static void main(String[] args) throws Exception{
		String str[]=Utility.fileReader();
		//System.out.println(str);
		System.out.println("Enter one word from file which is you have to find: ");
		String search=Utility.stringInput();
		String result=Utility.binarySearch(str, search);
		
			System.out.println("Element Present!!");
	}

}
