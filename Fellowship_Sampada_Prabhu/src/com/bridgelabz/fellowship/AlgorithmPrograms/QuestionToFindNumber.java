package com.bridgelabz.fellowship.AlgorithmPrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class QuestionToFindNumber {

	public static void main(String[] args) throws InterruptedException {
				System.out.println("Enter the power: ");
		int power=Utility.integerInput();
		int arr[]=new int[(int)Math.pow(2, power)];
		int low=0;
		int high=arr.length-1;

		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=j;
			j++;
		}
		for (int k : arr) {
			System.out.print(k+" ");			
		}
		System.out.println();
		
		int res=Utility.findNumber(arr, low, high);
		
		
		
	}

}
