package com.bridgelabz.fellowship.DataStructurePrograms;

public class BST {

	class Node
	{
		Node left;
		Node right;
		Node root;
		int key;
		public Node(int items)
		{
			key=items;
			left=null;
			right=null;
		}
	}
	Node insert(Node root, int key)
	{
		return root=insertRec(root, key);
	}
	Node insertRec(Node root, int key)
	{
		if(root==null)
			return new Node(key);
		else if(key<root.key)
		{
			root.left=insertRec(root, key);
		}
		
		else if(key>root.key) 
		{
			root.right=insertRec(root, key);
		}
		
		return root;
		
	}
	void search(Node root, int key)
	{
		Node result=searchRec(root, key);
		//return root=search(root, key);
		if(result.key==key)
		{
			System.out.println("Element found!!");
		}
		else
		{
			System.out.println("Element not found!!");
		}
	}
	Node searchRec(Node root, int key)
	{
		if(root.key==key)
		{
			return searchRec(root, key);
					
		}
		else if(key<root.key)
		{
			return searchRec(root.left, key);
		}
		else if(key>root.key)
		{
			return searchRec(root.right, key);
		}
		return root;
	}
}
