package com.bridgelabz.fellowship.DataStructurePrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class StackUsingLinkedList {
	
	public static void main(String[] args) {
		
		int arr[]=Utility.primeNumberArray(1000);
		
		int arr1[]=Utility.anagramArray(arr);
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]!=0)
			{
				Stack1.push(arr1[i]);
			}
		}
		Stack1.display();
	}

}
