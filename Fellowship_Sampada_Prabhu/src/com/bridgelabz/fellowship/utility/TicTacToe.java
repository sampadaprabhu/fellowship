package com.bridgelabz.fellowship.utility;

import java.util.Scanner;

public class TicTacToe {
	public static void isWin(char input[])
	{
		System.out.println("Final output is: ");
		System.out.println(input[0]+" "+input[1]+" "+input[2]);
		System.out.println("-|-|-");
		System.out.println(input[3]+" "+input[4]+" "+input[5]);
		System.out.println("-|-|-");
		System.out.println(input[6]+" "+input[7]+" "+input[8]);
	}

	public static void main(String[] args) {
		int player=0,count=0,winner=0,index,flag=0;
		int i,j,k;
		char sign;
		char input[]=new char[9];
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<9;i++)
		{
			input [i]=' ';
		}
		while(winner!=1)
		{
			flag=0;
			
			System.out.println(input[0]+"|"+input[1]+"|"+input[2]);
			System.out.println("-|-|-");
			System.out.println(input[3]+"|"+input[4]+"|"+input[5]);
			System.out.println("-|-|-");
			System.out.println(input[6]+"|"+input[7]+"|"+input[8]);
			
			if(count%2==0)
			{
				sign='x';
				player=1;
			}
			else
			{
				sign='0';
				player=2;
			}
			System.out.println("Enter the turn");
			index=sc.nextInt();
			
			if(index<1 && index>9)
			{
				System.out.println("Enter proper index!!");
			}
			if(input[index-1]=='x' || input[index-1]=='0')
			{
				System.out.println("Already entered!!");
			}
			else
			{
				input[index-1]=sign;
				count++;
			}
			
			//Check horizontally
			for(i=0;i<9;i++)
			{
				if(input[i]%3==0)
				{
					flag=0;
				}
				if(input[i]==sign)
				{
					flag++;
				}
				if(flag==3)
				{
					winner=1;
					isWin(input);
					break;
				}
			}
			
			//Check vertically
			for(j=0;j<9;j++)
			{
				flag=0;
				for(k=0;k<9;k++)
				{
					if(input[k]==sign)
					{
						flag++;
					}
					if(flag==3)
					{
						winner=1;
						isWin(input);
						break;
					}
				}
			}
			
			//Check Diagonally
			if((input[0]==sign && input[4]==sign && input[8]==sign) || (input[2]==sign && input[4]==sign && input[6]==sign))
			{
				winner=1;
				isWin(input);
				break;
			}
		}
		if(winner==1)
		{
			System.out.println("player"+player+"is winner");
		}
		else
		{
			System.out.println("Match Draw");
		}

	}

}
