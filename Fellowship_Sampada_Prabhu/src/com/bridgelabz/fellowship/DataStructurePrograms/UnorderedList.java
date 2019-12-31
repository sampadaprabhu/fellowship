package com.bridgelabz.fellowship.DataStructurePrograms;

/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;*/

import com.bridgelabz.fellowship.utility.Utility;

public class UnorderedList {
	public static void main(String[] args) throws Exception {
		//LinkedList list=new LinkedList();
		//Utility.LinkedList list=new LinkedList();
		String[] names=Utility.fileReader();
		for (String string : names) {
			Utility.add(string);
		}
		Utility.printList();
		System.out.println("Enter the word from file that you have to search:");
		String search=Utility.stringInput();
		Utility.searchAndDelete(search);
		System.out.println();
		System.out.println("New list is: ");
		Utility.printList();
		Utility.readAndWriteFile();
	}

}
