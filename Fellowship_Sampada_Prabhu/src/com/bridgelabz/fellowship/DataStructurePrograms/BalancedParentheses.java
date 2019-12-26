package com.bridgelabz.fellowship.DataStructurePrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class BalancedParentheses {

	public static void main(String[] args) {
		Stack stk=new Stack();

		char expression[]="(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)".toCharArray();
		if(Utility.isParenthesesBalanced(expression))
		{
			System.out.println("Parentheses Balanced!!");
		}
		else
			System.out.println("Parentheses Not Balanced!!");
	}
	

}
