package com.bridgelabz.fellowship.DataStructurePrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class CalendarUsingStack {

	StackForCalendar<Week> week=new StackForCalendar<Week>();
	public void calendar(int dd,int mm,int yy)
	{
		String day[]= {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		int arr[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int days=Utility.dayOfWeek(dd, mm, yy);
		WeekStack ww=new WeekStack();
		
		int count=1;
		if(Utility.isLeafYear(yy))
		{
			arr[1]=29;
		}
		String str;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(i==0)
				{
					ww.wq.push(new WeekDay(day[j], " "));
				}
				else if(days>0)
				{
					ww.wq.push(new WeekDay(" ", "  "));
					days--;
				}
				else
				{
					if(count<arr[mm-1]+1)
					{
						if(count<10)
						{
							str="0"+String.valueOf(count);
						}
						else
						{
							str=String.valueOf(count);
						}
						
						ww.wq.push(new WeekDay(" ", str));
						count++;
					}
					else
					{
						ww.wq.push(new WeekDay(" ",  ""));
					}
				}
			}
		}
		
		count=0;
		
		WeekDay weekday;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<7;j++)
			{
				weekday=(WeekDay) ww.wq.pop(0);
				if(i<1)
				{
					System.out.print(weekday.day+"| ");
				}
				else
				{
					System.out.print(weekday.date+" | ");
				}
			}
			System.out.println();
		}
	
	}

	public static void main(String[] args) {
	
		System.out.println("Enter the month: ");
		int month=Utility.integerInput();
		/*int arr[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i : arr) {
			queue.enqueue(i);
		}
		queue.printQueue();*/
		System.out.println("Enter the year: ");
		int year=Utility.integerInput();
		CalendarUsingQueue cuq=new CalendarUsingQueue();
		cuq.calendar(1, month, year);
		

	}

}
