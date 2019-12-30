package com.bridgelabz.fellowship.utility;

import com.bridgelabz.fellowship.utility.Utility.Node;

public class LinkedListUtility<T> {
	public class Node<T>
	{
		public T data;
		public Node next;
		public T data1;
	}
	Node <T>head;
	public void add(T data1) {
		Node<T> node = new Node();
		node.data1 = data1;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	public void remove(T data1)
	{
		Node<T> temp=head,prev=null;
		if(temp.data==data1)
		{
			head=temp.next;
			return;
		}
		else
		{
			while(temp!=null && temp.data==data1)
			{
				prev=temp;
				temp=temp.next;
			}
		}
		if(temp==null)
		{
			prev.next=temp.next;
		}
	}
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		else 
			return false;
	} 
	public boolean search(T data1)
	{
		Node search=new Node();
		search.data=data1;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==search.data)
			{
				return true;
				
			}
			temp=temp.next;
		}
		return false;
	}
	public void display()
	{
		Node display=head;
		while(display!=null)
		{
			System.out.print(display.data+" ");
			display=display.next;
		}
	}
	public void removeAtIndex(int index)
	{
		Node n=head;
		Node n1=null;
		if(index==0)
		{
			head=head.next;
		}
		else
		{
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
		}
	}
	public int index(T item)
	{
		Node temp=head;
		int count=0;
		while(item!=temp.data)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}


}
