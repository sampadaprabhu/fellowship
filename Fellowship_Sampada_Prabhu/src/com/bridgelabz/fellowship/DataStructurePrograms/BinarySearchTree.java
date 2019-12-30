package com.bridgelabz.fellowship.DataStructurePrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class BinarySearchTree {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of testcases: ");
		int testcase=Utility.integerInput();
		System.out.println("Enter the Nodes: ");
		while(testcase!=0) {
			testcase--;
			System.out.println(Utility.countBinarySearchTree(Utility.doubleInput()));
		}
		
	}

}
