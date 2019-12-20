package com.bridgelabz.fellowship.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {
	static Scanner sc=new Scanner(System.in);
	
	public static int integerInput()
	{
		return sc.nextInt();
	}
	public static double doubleInput()
	{
		return sc.nextDouble();
	}
	public static float floatInput()
	{
		return sc.nextFloat();
	}
	public static long longInput()
	{
		return sc.nextLong();
	}
	public static String stringInput()
	{
		return sc.nextLine();
	}
	public static void additionFirstAndLastDigit(int num)
	{
		int temp=0,sum=0;
		temp=num%10;
		num=num/10;
		while(num!=0)
		{
			sum=num%10;
			num=num/10;
		}
		sum=sum+temp;
		System.out.println("sum is: "+sum);
	}
	public static void alphabeticalOrder(int count)
	{

		String temp;
		String[] str1=new String[count];
		System.out.println("Enter the string one by one: ");
		for(int s=0;s<count;count++)
		{
			str1[s]=sc.next();
		}
		
		for(int i=0;i<str1.length;i++)
		{
			for(int j=0;j<str1.length;j++)
			{
				if(str1[i].compareTo(str1[j])>0)
				{
					temp=str1[i];
					str1[i]=str1[j];
					str1[j]=temp;
				}
			}
		}
		System.out.println("Sorted string is: ");
		for(int k=0;k<=str1.length-1;k++)
		{
			System.out.println(str1[k]+" ");
		}
	}
	public static void binarySearchNumber(int a[],int n)
	{
		
		int high,low,mid;
		high=a.length-1;
		low=0;
		mid=(low+high)/2;
		
while(low<high) {
			
			if(a[mid]==n)
			{
				System.out.println("found at index:"+a[mid]);
				break;
			}
			else if(n<a[mid])
			{
				low=0;
				high=mid;
			}
			else
			{
				low=mid+1;
				high=a.length-1;
			}
			mid=(low+high)/2;
			
		}
		if(low>high)
		{
			System.out.println("Not found");
		}
	}
	public static int binary(String arr[],int start,int end,String search)
	{
		int mid=(start+end)/2;
		if(arr[mid].compareTo(search)==0)
		{
			return mid;
		}
		else if(arr[mid].compareTo(search)>0)
		{
			return binary(arr,start,mid-1,search);
		}
		else if(arr[mid].compareTo(search)<0)
		{
			return binary(arr,mid+1,end,search);
		}
		return -1;
	}
	public static void bubbleSortString(String arr[])
	{
		String temp;
		System.out.println("Sorted string is: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void flipCoinPercentage(int times)
	{
		int heads=0;
		int tails=0;
		int flip=1;
		while(flip<=times)
		{
			if(Math.random()<0.5)
			{
				heads++;
			}
			else
			{
				tails++;
			}
			flip++;
		}
		System.out.println("heads are:"+heads);
		System.out.println("tails are: "+tails);
		System.out.println("Percentage of heads: "+(float)(heads*100)/times);
		System.out.println("Percentage of tails: "+(float)(tails*100)/times);
	}
	public static void leapYear(int year)
	{
		int count=0;
		int temp=year;
		while(temp!=0)
		{
			int digit=temp%10;
			count++;
			temp=temp/10;
		}
		if(count==4) 
		{
			if(year%4==0 || year%100==0 || year%400==0)
			{
				System.out.println(+year+" is leap year!!");
			}
			else
			{
				System.out.println(+year+" is not leap year");
			}
		}
	}
	public static void powerOfTwo(int num)
	{
		double power=0;
		int i;
		if(num<32)
		{
			for(i=0;i<=num;i++)
			{
				power=Math.pow(2, i);
			}
			
			System.out.println("The power of 2 upto "+(i-1)+" is "+power);
		}
	}
	public static void harmonicNumber(int number)
	{
		float h=1;
		for(int i=1;i<=number;i++)
		{
			h=h+(float)1/i;
		}
		System.out.println("The harmonic number is: "+h);
		
	}
	public static void primeFactor(int number)
	{
		System.out.println("The prime factor of "+number+" are: ");
		for(int i=2;i<=number;i++)
		{
			while(number%i==0)
			{
				System.out.print(i+" ");
				number=number/i;
			}
		}
	}
	public static void twoDArray(int rows, int cols)
	{
		int arr[][]=new int[rows][cols];
		System.out.println("Elements: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=Utility.integerInput();
			}
		}
		PrintWriter writer=new PrintWriter(System.out);
		System.out.println("2DArray: ");
		for(int k=0;k<rows;k++)
		{
			for(int l=0;l<cols;l++)
			{
				writer.print(arr[k][l]+" ");
			}
			writer.println();	
		}
		writer.flush();
	}
	public static void sumOfThreeIntegers(int arr[])
	{
		for(int i=0;i<arr.length-2;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println("arr[i]="+arr[i]+" arr[j]="+arr[j]+" arr[k]="+arr[k]);
					}
				}
			}
		}
	}
	public static void euclideanDistance(int num1,int num2)
	{
		double xx=Math.pow(num1, 2);
		double yy=Math.pow(num2, 2);
		double sum=xx+yy;
		double distance=Math.sqrt(sum);
		System.out.println("Euclidean Distance is: "+distance);
	}
	public static void quadratic(int num1,int num2,int num3)
	{
		double delta=(num2*num2)-(4*num1*num3);
		double x=((-num2)+Math.sqrt(delta))/2*num1;
		double y=((-num2)-Math.sqrt(delta))/2*num1;
		System.out.println("root of x is: "+x);
		System.out.println("root of y is: "+y);
	}
	public static void windChill(double temp,double ws)
	{
		double w=0;
		if(temp<50 && ws<120) {
		double v=Math.pow(ws, 0.16);
		w=35.47+(0.6215*temp)+((0.4275*temp)-35.75)*v;
	}
		System.out.println("Effective temperature is: "+w);
		
	}
	public static void gambler(int times, int stake, int goal)
	{
		int wins=0;
		int loss=0;
		
		if(goal<stake)
		{
			System.out.println("enter the goal again!!!");
			goal=Utility.integerInput();
		}
			for(int i=0;i<times;i++)
			{
				while(stake>0 && stake<goal)
				{
					if(Math.random()<0.5)
					{
						stake++;
					}
					else
					{
						stake--;
					}
				}
			}
			if(stake==goal)
			{
				wins++;
				
			}
			System.out.println("wins is: "+wins);
			System.out.println("Loss is: "+(times-wins));
		
		System.out.println("Percentage of wins: "+(float)(wins*100)/times);
		System.out.println("Percentage of loss: "+(float)((times-wins)*100)/times);
	}
	public static void couponNumber()
	{
		char ch[]="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		int max=100;
		int random=(int)(Math.random()*max);
		StringBuffer sb=new StringBuffer();
		while(random>0)
		{
			sb.append(ch[random%ch.length]);
			random=random/ch.length;
		}
		String couponCode=sb.toString();
		System.out.println("Coupon Code is: "+couponCode);

	}
	
	//Stopwatch program Method
	public static double startTime()
	{
		double start=0;
		System.out.println("Enter 1 to start: ");
		start=Utility.doubleInput();
		start=System.currentTimeMillis();
		//System.out.println("Started at: "+start);
		return start;
	}
	public static double stopTime()
	{
		double stop=0;
		System.out.println("Enter 2 to stop: ");
		stop=Utility.doubleInput();
		stop=System.currentTimeMillis();
		//System.out.println("Stopped at:"+stop);
		return stop;
	}
	//Done stopwatch

	public static void vendingMachine(int rupees)
	{
		int arr[]= {2000,500,200,100,50,20,10,5,2,1};
		int i=0;
		int rupees1=0;
		while(rupees>0)
		{
			rupees1=rupees/arr[i];
			rupees=rupees%arr[i];
			System.out.println("The note of "+arr[i]+" is "+rupees1);
			i++;
		}
	}
	
	public static int dayOfWeek(int date, int month, int year)
	{
		int y0=year-(14-month)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=month+12*((14-month)/12)-2;
		int d0=(date+x+31*m0/12)%7;
		return d0;
	}
	public static void temperatureConversion(float celsius, float fahrenheit)
	{
		fahrenheit=(celsius*9/5)+32;
		System.out.println("Temperature in fahrenheit is: "+fahrenheit);
		celsius=(fahrenheit-32)*9/5;
		System.out.println("Temperature in Celsius is: "+celsius);
	}
	public static void monthlyPayment()
	{
		
	}
}
