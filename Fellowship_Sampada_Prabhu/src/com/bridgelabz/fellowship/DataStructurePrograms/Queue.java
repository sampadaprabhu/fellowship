package com.bridgelabz.fellowship.DataStructurePrograms;

public class Queue {
	static int front=-1;
	static int rear=-1;
	static Node head;
public static class Node
{
	char data;
	Node next;
	public Node(char d) {
		data=d;
		next=null;
	}
	
}
public static void insertDequeue(char data) 
{
	Node node=new Node(data);
	Node n=head;
	if(head==null)
	{
		head=node;
	}
	else
	{
		while(n.next!=null)
		{
			n=n.next;	//loop execute till n.next not equal to null
		}
		n.next=node;
	}
}
public static void printDequeue()
{
	Node currentNode=head;
	while(currentNode!=null)
	{
		System.out.print(currentNode.data+"-->");
		currentNode=currentNode.next;
	}
	System.out.println();
}
public static char dequeueFront()
{
	char data;
	Node n=head;
	data=n.data;
	head=n.next;
	return data;
}
public static char dequeueRear() 
{
	char data;
	Node n=head;
	Node prev=n;
	while(n.next!=null)
	{
		prev=n;
		n=n.next;
	}
	data=n.data;
	prev.next=null;
	return data;
}

}
