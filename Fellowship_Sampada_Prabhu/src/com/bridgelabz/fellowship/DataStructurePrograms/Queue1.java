package com.bridgelabz.fellowship.DataStructurePrograms;

public class Queue1 {
static int front=-1;
static int rear=-1;
static Node head;
public static class Node
{
	int data;
	Node next;
	public Node(int d)
	{
		data=d;
		next=null;
	}
}

public static void enqueue(int data)
{
	Node temp;
	Node node=new Node(data);
	if(head==null)
	{
		head=node;
	}
	else
	{
		temp=head;
		while(temp!=null)
		{
			temp=temp.next;
		}
		temp.next=node;
	}
}

public static void enqueueFront(int data)		//Add from front 
{
	Node temp;
	Node node=new Node(data);
	if(head==null)
	{
		head=node;
	}
	else
	{
		temp=head;
		temp=temp.next;
		head=temp;
		
	}
}

public static void enqueueRear(int data)
{
	Node temp;
	Node node=new Node(data);
	if(head!=null)
	{
		head=node;
	}
	else
	{
		temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=node;
	}
}

public static int dequeue() 
{
	int data=(Integer) null;
	if(!isEmpty())
	{
		Node temp=head;
		data=temp.data;
		head=temp.next;
	}
	else
	{
		System.out.println("Queue is empty!!");
	}
	return data;
}

public static void dequeueFront()
{
	int data;
	Node node=head;
	data=node.data;
	head=node.next;
}

public static void dequeueRear() 
{
	int data;
	Node node=head;
	Node prev=node;
	while(node.next!=null)
	{
		prev=node;
		node=node.next;
	}
	data=node.data;
	prev.next=null;
}

public static void printQueue()
{
	if(head!=null)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
	else
		System.out.println("Queue is empty!!");
	
		
}
public static boolean isEmpty()
{
	if(head==null)
	{
		return true;
	}
	return false;
	
}

}
