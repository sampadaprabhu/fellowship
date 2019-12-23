package com.bridgelabz.fellowship.AlgorithmPrograms;

import java.util.ArrayList;

import com.bridgelabz.fellowship.utility.Utility;

public class PrimeAnagramAndPrimePalindrome {

	public static void main(String[] args) {
		int i=2;
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Enter the number: ");
		int number=Utility.integerInput();
		al=Utility.primeNumber(number);
		System.out.println(al);
		System.out.println("PrimeAnagram are: ");
		for(int k=0;k<al.size();k++)
		{
			for(int l=k+1;l<al.size();l++)
			{
				if(Utility.anagram(al.get(k),al.get(l))==true)
				{
					System.out.println(al.get(k)+"  "+al.get(l));
				}
			}
		}
		
		System.out.println("PrimePalindrome are: ");
		for(int q=0;q<al.size();q++)
		{
			if(Utility.palindrome(al.get(q))==true)
			{
				System.out.println(al.get(q));
			}
		}

	}

}
