package com.bridgelabz.fellowship.DataStructurePrograms;


import com.bridgelabz.fellowship.utility.LinkedListUtility;
import com.bridgelabz.fellowship.utility.Utility;

public class Hashing {
	public static Object[] ob =new Object[11];
	
	public static void main(String[] args) throws Exception {
		for(int i=0;i<ob.length;i++)
		{
			ob[i]=new LinkedListUtility();
		}
		
		//input from file
		int arr[]=Utility.inputFromFile();
		//input add in linked list
		for(int i=0;i<arr.length;i++)
		{
			LinkedListUtility list=(LinkedListUtility)ob[arr[i]%11];
			list.add(arr[i]);
		}
		//display it
		for(int i=0;i<ob.length;i++)
		{
			LinkedListUtility list=(LinkedListUtility)ob[i];
			System.out.println();
			list.display();
		}
			
		System.out.println();
		System.out.println("Enter the data to search: ");
		int data=Utility.integerInput();
		Utility.getValue(data%11, data);
	}
	
}
