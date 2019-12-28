package com.bridgelabz.fellowship.DataStructurePrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class OrderedList {

	public static void main(String[] args) throws Exception {
		int arr[]=Utility.fileReaderOL();
		for (int i : arr) {
			System.out.println(i);
			Utility.add(i);
		}
		
		System.out.println("Enter the word from file that you have to search:");
		int search=Utility.integerInput();
		Utility.findAndDelete(search);
		System.out.println();
		System.out.println("New list is: ");
		Utility.readWriteFile();
		
	}

}
