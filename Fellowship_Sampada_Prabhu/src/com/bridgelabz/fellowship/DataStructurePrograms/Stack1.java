package com.bridgelabz.fellowship.DataStructurePrograms;

public class Stack1 {
	static Node top;
	static class Node
	{
		int data;
		Node next;
		public Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static void push(int data)
	{
		Node temp=new Node(data);
		if(temp==null)
			System.out.println("overflow!!");
		else
		{
			temp.data=data;
			temp.next=top;
			top=temp;
		}
	}
	public static void pop()
	{
		if(top==null)
		{
			System.out.println("Stack is underflow!!");
			return;
		}
		else
		{
			top=top.next;
		}
	}
	public static boolean isEmpty()
	{
		if(top==null)
		{
			return true;
		}
		return false;
	}
	public static void display()
	{
		Node temp;
		if(top==null)
		{
			System.out.println("Stack is underflow!!");
		}
		else
		{
			temp=top;
			while(temp!=null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}	
		}
	}
	
}
