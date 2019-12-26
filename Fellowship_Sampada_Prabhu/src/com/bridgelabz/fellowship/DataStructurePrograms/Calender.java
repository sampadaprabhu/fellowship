package com.bridgelabz.fellowship.DataStructurePrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		int day=1,month,year;
		int i,j, row=7, col=7,index=0;
		String arr[][]=new String[row][col];
		
		//Enter the days in two D matrix
		
		arr[0][0]="Sun";
		arr[0][1]="Mon";
		arr[0][2]="Tue";
		arr[0][3]="Wed";
		arr[0][4]="Thu";
		arr[0][5]="Fri";
		arr[0][6]="Sat";
		
		//space for date
		for(i=1;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				arr[i][j]=" ";
			}
		}
	
		//Take user input
		System.out.println("Enter the month: ");
	    month=Utility.integerInput();
		System.out.println("Enter the year: ");
		year=Utility.integerInput();
		
		int DayNo=Utility.getDayNumber(day, month, year);
		System.out.println("Day Number is: "+DayNo);
		
		String[] GetMonth=Utility.getMonthData(month, year);
		
		//put the data of corresponding month in 2D matrix
		
		for(i=1	;i<row;i++)
		{
			if(i==1)
			{
				for(j=DayNo;j<col&&index<GetMonth.length;j++)
				{
					arr[i][j]=GetMonth[index];
					index++;
				}
			}
			else
			{
				for(j=0;j<col&&index<GetMonth.length;j++)
				{
					arr[i][j]=GetMonth[index];
					index++;
				}
			}
		}
		
		//Print the calender in 2D matrix
		System.out.println("Calender of "+month+" "+year);
		
		for(i=0;i<row;i++)
		{
			if(i==0)
			{
				for(j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+"\t");
				}
			}
			else
			{
				if(i==1)
				{
					for(j=0;j<col;j++)
					{
						if(j<DayNo)
						{
							System.out.print("\t");
						}
						else
						{
							System.out.print(arr[i][j]+"\t");
						}
					}
				}
				else
				{
					for(j=0;j<col;j++)
					{
						System.out.print(arr[i][j]+"\t");
					}
				}
			}
			System.out.println();
		}
		
	}

}
