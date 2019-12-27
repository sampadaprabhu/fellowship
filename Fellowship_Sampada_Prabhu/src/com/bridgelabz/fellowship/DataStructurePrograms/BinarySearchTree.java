package com.bridgelabz.fellowship.DataStructurePrograms;

import com.bridgelabz.fellowship.DataStructurePrograms.BST.Node;
import com.bridgelabz.fellowship.utility.Utility;

public class BinarySearchTree {

	public static void main(String[] args) {
		BST bst=new BST();
		Node root=null;
		System.out.println("Enter the numbers: ");
		int arr[]= {1,2,3,6,7,9,4,5,8,0};
		for (int numbers : arr) {
			root=bst.insert(root, numbers);
		}
		System.out.println("Enter the number that you have to time: ");
		int search= Utility.integerInput();
		bst.search(root, search); 
	}

}
