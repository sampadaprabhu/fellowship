package com.bridgelabz.fellowship.DataStructurePrograms;

public class Stack {
	int top=-1;
	char arr[]=new char[100];
	
	public void push(char item)
	{
		if(top==99)
		{
			System.out.println("Stck overflow!!");
		}
		else
		{
			arr[++top]=item;
		}
	}
	public char pop()
	{
		if(top==-1)
		{
			System.out.println("Stack undreflow!!");
		}
		else
		{
			char element=arr[top];
			top--;
			return element;
		}
		
		return 0;
	}
	public boolean isEmpty()
	{
		return (top==-1)?true:false;
	}
}
