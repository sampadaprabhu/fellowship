package com.bridgelabz.fellowship.utility;

public class BinarySearchString {
	public static void main(String[] args) {
		String arr[]= {"Sahil","Hanumant","Sampada","Vinita","Pratiksha"};
		String search="Vinita";
		int start=0;
		int end=arr.length-1;
		//Utility.binary(arr, start, end, search);
			System.out.println("Index of "+search+" is: "+Utility.binary(arr,0,end,search));
	}
}
