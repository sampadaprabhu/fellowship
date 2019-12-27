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
		Node n=new Node(data);
		if(top==null)
			top=n;
		else
		{
			Node temp=n;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=n;
		}
	}
	public static void pop()
	{
		Node temp=top;
		Node prev=temp;
		int data=(Integer) null;
		
	}
}
