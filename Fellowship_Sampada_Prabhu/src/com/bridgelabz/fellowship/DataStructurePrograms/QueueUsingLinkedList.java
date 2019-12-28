package com.bridgelabz.fellowship.DataStructurePrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		Queue1 q1=new Queue1();
		int arr[]=Utility.primeNumberArray(1000);
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" ");
		 * 
		 * }
		 */
		int arr1[]=Utility.anagramArray(arr);
		/*
		 * for(int i=0;i<arr1.length;i++) { System.out.print(arr1[i]+" "); }
		 */
		int length=arr1.length;
		for(int i=0;i<length-1;i++)
		{
			if(arr1[i]!=0)
			{
				Queue1.enqueue(arr1[i]);
			}
		}
		q1.printQueue();
		/*
		 * while(length>1) { int data=q1.dequeue(); System.out.print(data+"-->");
		 * length--; }
		 */
		
	}

}
