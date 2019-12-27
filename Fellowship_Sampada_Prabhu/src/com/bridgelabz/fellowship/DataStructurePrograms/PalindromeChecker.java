package com.bridgelabz.fellowship.DataStructurePrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args) {
		Queue queue=new Queue();
		System.out.println("Enter the String: ");
		String string=Utility.stringInput();
		int mid=string.length()/2;
		for(int i=string.length()-1;i>=0;i--)
		{
			queue.insertDequeue(string.charAt(i));
		}
		queue.printDequeue();
		char char1,char2;
		int i=0;
		int flag=0;
		while(i<mid)
		{
			char1=queue.dequeueFront();
			System.out.print(char1);
			char2=queue.dequeueRear();
			System.out.print(char2);
			System.out.println();
			if((char1==char2)!=true)
			{
				flag=1;
				break;
			}
			i++;
		}
		if(flag==1)
		{
			System.out.println("String is not palindrome!!");
		}
		else
			System.out.println("String is palindrome!!");
	}

}
