package com.bridgelabz.fellowship.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.bridgelabz.fellowship.DataStructurePrograms.Hashing;
import com.bridgelabz.fellowship.DataStructurePrograms.Stack;

/**
 * @author admin1
 *
 */
/**
 * @author admin1
 *
 */
public class Utility {
	static Scanner sc = new Scanner(System.in);

	public static int integerInput() {
		return sc.nextInt();
	}

	public static double doubleInput() {
		return sc.nextDouble();
	}

	public static float floatInput() {
		return sc.nextFloat();
	}

	public static long longInput() {
		return sc.nextLong();
	}

	public static String stringInput() {
		return sc.nextLine();
	}

	/************************
	 * Add_First_And_Last_Digit
	 **************************************/
	/**
	 * @param num user enter the number
	 */
	public static void additionFirstAndLastDigit(int num) {
		int temp = 0, sum = 0;
		temp = num % 10;
		num = num / 10;
		while (num != 0) {
			sum = num % 10;
			num = num / 10;
		}
		sum = sum + temp;
		System.out.println("sum is: " + sum);
	}

	public static void alphabeticalOrder(int count) {

		String temp;
		String[] str1 = new String[count];
		System.out.println("Enter the string one by one: ");
		for (int s = 0; s < count; count++) {
			str1[s] = sc.next();
		}

		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str1.length; j++) {
				if (str1[i].compareTo(str1[j]) > 0) {
					temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;
				}
			}
		}
		System.out.println("Sorted string is: ");
		for (int k = 0; k <= str1.length - 1; k++) {
			System.out.println(str1[k] + " ");
		}
	}

	public static void binarySearchNumber(int a[], int n) {

		int high, low, mid;
		high = a.length - 1;
		low = 0;
		mid = (low + high) / 2;

		while (low < high) {

			if (a[mid] == n) {
				System.out.println("found at index:" + a[mid]);
				break;
			} else if (n < a[mid]) {
				low = 0;
				high = mid;
			} else {
				low = mid + 1;
				high = a.length - 1;
			}
			mid = (low + high) / 2;

		}
		if (low > high) {
			System.out.println("Not found");
		}
	}

	public static int binary(String arr[], int start, int end, String search) {
		int mid = (start + end) / 2;
		if (arr[mid].compareTo(search) == 0) {
			return mid;
		} else if (arr[mid].compareTo(search) > 0) {
			return binary(arr, start, mid - 1, search);
		} else if (arr[mid].compareTo(search) < 0) {
			return binary(arr, mid + 1, end, search);
		}
		return -1;
	}

	public static void bubbleSortString(String arr[]) {
		String temp;
		System.out.println("Sorted string is: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void flipCoinPercentage(int times) {
		int heads = 0;
		int tails = 0;
		int flip = 1;
		while (flip <= times) {
			if (Math.random() < 0.5) {
				heads++;
			} else {
				tails++;
			}
			flip++;
		}
		System.out.println("heads are:" + heads);
		System.out.println("tails are: " + tails);
		System.out.println("Percentage of heads: " + (float) (heads * 100) / times);
		System.out.println("Percentage of tails: " + (float) (tails * 100) / times);
	}

	public static void leapYear(int year) {
		int count = 0;
		int temp = year;
		while (temp != 0) {
			int digit = temp % 10;
			count++;
			temp = temp / 10;
		}
		if (count == 4) {
			if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
				System.out.println(+year + " is leap year!!");
			} else {
				System.out.println(+year + " is not leap year");
			}
		}
	}

	public static double powerOfTwo(int num) {
		double power = 0;
		int i;
		if (num < 32) {
			for (i = 0; i <= num; i++) {
				power = Math.pow(2, i);
			}

			// System.out.println("The power of 2 upto "+(i-1)+" is "+power);

		}
		return power;
	}

	public static void harmonicNumber(int number) {
		float h = 1;
		for (int i = 1; i <= number; i++) {
			h = h + (float) 1 / i;
		}
		System.out.println("The harmonic number is: " + h);

	}

	public static void primeFactor(int number) {
		System.out.println("The prime factor of " + number + " are: ");
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				System.out.print(i + " ");
				number = number / i;
			}
		}
	}

	public static void twoDArray(int rows, int cols) {
		int arr[][] = new int[rows][cols];
		System.out.println("Elements: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = Utility.integerInput();
			}
		}
		PrintWriter writer = new PrintWriter(System.out);
		System.out.println("2DArray: ");
		for (int k = 0; k < rows; k++) {
			for (int l = 0; l < cols; l++) {
				writer.print(arr[k][l] + " ");
			}
			writer.println();
		}
		writer.flush();
	}

	public static void sumOfThreeIntegers(int arr[]) {
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length - 1; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("arr[i]=" + arr[i] + " arr[j]=" + arr[j] + " arr[k]=" + arr[k]);
					}
				}
			}
		}
	}

	public static void euclideanDistance(int num1, int num2) {
		double xx = Math.pow(num1, 2);
		double yy = Math.pow(num2, 2);
		double sum = xx + yy;
		double distance = Math.sqrt(sum);
		System.out.println("Euclidean Distance is: " + distance);
	}

	public static void quadratic(int num1, int num2, int num3) {
		double delta = (num2 * num2) - (4 * num1 * num3);
		double x = ((-num2) + Math.sqrt(delta)) / 2 * num1;
		double y = ((-num2) - Math.sqrt(delta)) / 2 * num1;
		System.out.println("root of x is: " + x);
		System.out.println("root of y is: " + y);
	}

	public static void windChill(double temp, double ws) {
		double w = 0;
		if (temp < 50 && ws < 120) {
			double v = Math.pow(ws, 0.16);
			w = 35.47 + (0.6215 * temp) + ((0.4275 * temp) - 35.75) * v;
		}
		System.out.println("Effective temperature is: " + w);

	}

	public static void gambler(int times, int stake, int goal) {
		int wins = 0;
		int loss = 0;

		if (goal < stake) {
			System.out.println("enter the goal again!!!");
			goal = Utility.integerInput();
		}
		for (int i = 0; i < times; i++) {
			while (stake > 0 && stake < goal) {
				if (Math.random() < 0.5) {
					stake++;
				} else {
					stake--;
				}
			}
		}
		if (stake == goal) {
			wins++;

		}
		System.out.println("wins is: " + wins);
		System.out.println("Loss is: " + (times - wins));

		System.out.println("Percentage of wins: " + (float) (wins * 100) / times);
		System.out.println("Percentage of loss: " + (float) ((times - wins) * 100) / times);
	}

	public static void couponNumber() {
		char ch[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		int max = 100;
		int random = (int) (Math.random() * max);
		StringBuffer sb = new StringBuffer();
		while (random > 0) {
			sb.append(ch[random % ch.length]);
			random = random / ch.length;
		}
		String couponCode = sb.toString();
		System.out.println("Coupon Code is: " + couponCode);

	}

	// Stopwatch program Method
	public static double startTime() {
		double start = 0;
		System.out.println("Enter 1 to start: ");
		start = Utility.doubleInput();
		start = System.currentTimeMillis();
		// System.out.println("Started at: "+start);
		return start;
	}

	public static double stopTime() {
		double stop = 0;
		System.out.println("Enter 2 to stop: ");
		stop = Utility.doubleInput();
		stop = System.currentTimeMillis();
		// System.out.println("Stopped at:"+stop);
		return stop;
	}

	// Done stopwatch
	/********************* Vending_Machine *****************************/
	/**
	 * @param rupees user enter the rupees
	 */
	public static void vendingMachine(int rupees) {
		int arr[] = { 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int i = 0;
		int rupees1 = 0;
		while (rupees > 0) {
			rupees1 = rupees / arr[i];
			rupees = rupees % arr[i];
			System.out.println("The note of " + arr[i] + " is " + rupees1);
			i++;
		}
	}

	/********************* Day_Of_Week ******************************************/
	public static int dayOfWeek(int date, int month, int year) {
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (date + x + 31 * m0 / 12) % 7;
		return d0;
	}

	/***************************
	 * Temperature_Conversion
	 ************************************/
	/**
	 * @param celsius    user enter the temperature in celsius
	 * @param fahrenheit user enter the temperature in fahrenheit
	 */
	public static void temperatureConversion(float celsius, float fahrenheit) {
		fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println("Temperature in fahrenheit is: " + fahrenheit);
		celsius = (fahrenheit - 32) * 9 / 5;
		System.out.println("Temperature in Celsius is: " + celsius);
	}

	/***************************
	 * Monthly_Payment
	 *************************************/
	/**
	 * @param principal_amount user enter the principal amount
	 * @param year             user enter the year
	 * @param interest         user enter the interest
	 */
	public static void monthlyPayment(double principal_amount, double year, double interest) {
		double n, r;
		n = 12 * year;
		r = interest / (12 * 100);
		System.out.println("Now calculate the payment!!");
		double payment;
		payment = (principal_amount * r) / (1 - Math.pow((1 + r), (-n)));
		System.out.println("The Payment is: " + payment);
	}

	/***************************
	 * Decimal_TO_Binary
	 ***********************************/
	/**
	 * @param decimal user enter the decimal number
	 */
	public static void toBinary(int decimal) {
		// int binary =0;
		int binary[] = new int[100];
		int j = 0;
		while (decimal != 0) {
			binary[j++] = decimal % 2;
			decimal = decimal / 2;
		}
		for (int i = j - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	/*********************** Binary.java ****************************************/
	/**
	 * @param number user enter the decimal number
	 * @return it return the value after swap
	 */
	public static int swapNibbles(int number) {
		int swap = ((number & 0x0F) << 4 | (number & 0xF0) >> 4);
		return swap;
	}

	/**
	 * @param number user enter the decimal number
	 * @return it returns the boolean value i.e. true
	 */
	public static boolean powerOf(int number) {
		double power = 0;
		int i;
		boolean flag = false;
		if (number < 32) {
			for (i = 0; i <= number; i++) {
				power = Math.pow(2, i);
			}
		}
		return true;

	}

	public static double newtonSqrt(double number, double epsilon) {
		double temp = number;
		while (Math.abs(temp - number / temp) > epsilon * temp) {
			temp = (number / temp + temp) / 2.0;
		}
		// System.out.println("The output is: "+temp);
		return temp;
	}

	/********************** Bubble_Sort *****************************************/
	public static void bubbleSort(int arr[]) {
		int i = 0, j = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			for (j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println(arr[i]);
		}

	}

	/***********************
	 * Detection_Of_Anagram
	 *****************************************/

	public static void anagram(String string1, String string2) {
		int i = 0, j = 0;
		int found = 0, not_found = 0;
		if (string1.length() != string2.length()) {
			System.out.println("Enter the proper string!!");
		}
		for (i = 0; i < string1.length(); i++) {
			found = 0;
			for (j = 0; j < string2.length(); j++) {
				if (string1.charAt(i) == string2.charAt(j)) {
					found = 1;
					break;
				}
			}
			if (found == 0) {
				not_found = 1;
				break;
			}
		}
		if (not_found == 0) {
			System.out.println("Strings are anagram!!");
		} else
			System.out.println("Strings are not anagram!!");
	}

	/***********************
	 * Binary_Search
	 ******************************************/
	public static String[] fileReader() throws Exception {
		String[] str = new String[5];
		FileReader fr = new FileReader("/home/admin1/Desktop/FellowshipSP/UnorderedList.txt");
		BufferedReader br = new BufferedReader(fr);
		String data;
		String lines[] = br.readLine().split(",");
		for (String string : lines) {
			// System.out.println(string);
		}
		// System.out.println(str[j-1]);

		return lines;
		// System.out.println(str);
	}

	public static String binarySearch(String arr[], String search) {
		int left = 0, right = arr.length - 1, result = 0;
		while (left <= right) {
			int mid = (left + (right - left)) / 2;
			result = search.compareTo(arr[mid]);
			if (result == 0)
				System.out.println(mid);
			else if (result > 0)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return arr[result];

	}

	/******************** Prime_Numbers **************************/
	public static void primeNumbers(int LastNumber) {
		int i = 0;
		for (i = 2; i < LastNumber; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				System.out.print(i + " ");
			}
		}
	}

	/********************
	 * PrimeAnagram_And_PrimePalindrome
	 **********************************************/
	public static ArrayList<Integer> primeNumber(int number) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		int i = 0;
		for (i = 2; i < number; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				al.add(i);
			}
		}
		return al;
	}

	public static boolean anagram(int m, int n) {
		int m1, n1, i, j;
		ArrayList<Integer> t1 = new ArrayList<Integer>();
		ArrayList<Integer> t2 = new ArrayList<Integer>();
		boolean flag = false;
		while (m != 0) {
			m1 = m % 10;
			m = m / 10;
			t1.add(m1);

		}
		while (n != 0) {
			n1 = n % 10;
			n = n / 10;
			t2.add(n1);
		}

		Collections.sort(t1);
		Collections.sort(t2);

		if (t1.size() == t2.size()) {
			for (i = 0; i < t1.size(); i++) {
				if (t1.get(i) == t2.get(i))
					flag = true;
				else
					return false;
			}
		}
		return flag;
	}

	public static boolean palindrome(int s) {
		int r, temp = 0, rem, sum = 0;
		ArrayList<Integer> s1 = new ArrayList<Integer>();
		boolean flag = false;
		temp = s;

		while (s > 0) {
			rem = s % 10;
			sum = (sum * 10) + rem;
			s = s / 10;
		}
		if (temp == sum) {
			flag = true;
		} else {
			return false;
		}
		return flag;
	}

	/***********************
	 * Insertion_Sort
	 ****************************************/
	/**
	 * @param arr user enter the string in array
	 * @return array
	 */
	public static String[] insertionSort(String arr[]) {
		String key;
		int i, j;
		for (i = 0; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j].compareTo(key) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	/******************* Question_To_Find_Number *******************/

	public static int findNumber(int arr[], int low, int high) throws InterruptedException {
		Thread.sleep(2000);
		if (low <= high) {
			int mid = (low + high) / 2;
			System.out.println(arr[mid] + "is the number?");
			System.out.println("If value is greater than mid press " + "g " + " otherwise press " + "l");
			String key = Utility.stringInput();
			if (key.equals("g")) {
				return findNumber(arr, mid + 1, high);
			} else if (key.equals("l")) {
				return findNumber(arr, low, mid - 1);
			} else {
				return findNumber(arr, low, high);
			}

		}
		return 0;
	}

	/********************* Merge_Sort_String **********************/
	public static void mergeSortString(String arr[], int low, int mid, int high) {
		low = 0;
		high = arr.length;
		mid = (low + high) / 2;

		int n1 = mid - low + 1;
		int n2 = high - mid;

		String[] arr1 = new String[n1];
		String[] arr2 = new String[n2];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[low + i];
		}
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = arr[mid + 1 + j];
		}
		int i = 0, j = 0;
		int k = low;
		while (i < n1 && j < n2) {
			if (arr1[i].compareTo(arr2[j]) < 0) {
				arr[k] = arr1[i];
				i++;
			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
	}

	public static void sort(String arr[], int low, int high) {

		if (low < high) {
			int mid = (low + high) / 2;
			Utility.sort(arr, low, mid);
			Utility.sort(arr, mid + 1, high);
			Utility.mergeSortString(arr, low, mid, high);
		}

	}

	/*******************
	 * Permutation_Of_String
	 ***************************************/

	public static void permute(String str, int left, int right) {
		char temp;
		char chararr[] = str.toCharArray();
		if (left == right) {
			System.out.println(str);
		} else {
			for (int i = left; i < right; i++) {
				str = swap(str, left, i);
				permute(str, left + 1, right);
			}
		}
	}

	public static String swap(String str, int i, int j) {
		char temp;
		char[] ch = str.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}

	/************************* Unordered_List ***************************/

	static Node head;
	static Node node;

	static class Node {
		String data;
		int data1;
		Node next;
	}

	public static void add(String data) {
		Node node = new Node();
		node.data = data;
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

	public static void addAtStart(String data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;

	}

	public static void addAtPosition(String data, int index) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		// int index;
		Node n = head;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}

	public static void delete() {

	}

	public static void deleteAtStart() {
		Node n = head;
		head = n.next;
		n = null;
	}

	public static void deleteAtEnd() {
		Node n = head;
		while (n.next.next != null) {
			n = n.next;
		}
		n.next = null;

	}

	public static void deleteAtPosition(int index) {
		Node n = head;
		Node n1 = null;

		if (index == 0)
			head = head.next;

		for (int i = 0; i < index - 1; i++) {
			n = n.next;
		}
		n1 = n.next;
		n.next = n1.next;
		n1 = null;

	}

	public static void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public static void searchAndDelete(String search) {
		Node currentNode = head;
		int temp = 0;
		while (currentNode.next != null) {
			if ((currentNode.next.data).compareTo(search) == 0) {
				currentNode.next = currentNode.next.next;
				temp++;
			} else {
				currentNode = currentNode.next;
			}
		}
		if (temp == 0) {
			System.out.println("Word not found!!");
			Utility.add(search);
		} else {
			System.out.println("Word found...So we have to delete it!!");
		}
	}

	public static void readAndWriteFile() throws FileNotFoundException {
		Node current = head;
		PrintWriter pw = new PrintWriter("/home/admin1/Desktop/UnorderedList.txt");
		while (current.next != null) {
			// System.out.println(current.data);
			pw.print(current.data);
			pw.print(" ");
			current = current.next;
		}
		pw.print(current.data);
		pw.flush();
	}

	/********************* Order_List ****************************************/

	public static int[] bSort(int arr[]) {
		int i = 0, j = 0;
		for (i = 0; i <= arr.length - 1; i++) {
			for (j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}
		return arr;
	}

	public static int[] fileReaderOL() throws Exception {
		File file = new File(("/home/admin1/Desktop/UnOrderList.txt"));
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String lines[] = br.readLine().split(" ");
		int[] arr = new int[lines.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(lines[i]);
		}
		arr = Utility.bSort(arr);

		return arr;
	}

	public static void sort(Node head) {
		Node current = head;
		Node current1 = null;
		current1 = current.next;
		int temp = 0;
		while (current.next != null) {
			current = current.next;
			while (current.next != null) {
				if (current.data.compareTo(current1.data) > 0)

				{
					temp = current.data1;
					current.data1 = current1.data1;
					current1.data1 = temp;
				}
			}
		}
	}

	public static void add(int data1) {
		Node node = new Node();
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

	public static void printListInt() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data1 + " ");
			n = n.next;
		}
	}

	public static void findAndDelete(int search) {
		Node currentNode = head;
		int temp = 0;
		while (currentNode != null && currentNode.data1 != search) {

			temp++;
			currentNode = currentNode.next;
		}
		if (currentNode.data1 == search) {
			deleteAtPosition(temp);
			System.out.println("number found...So we have to delete it!!");

		} else if (currentNode.data1 != search) {
			System.out.println("Number not found!!");
			Utility.add(search);
		} else {
		}
		Utility.printListInt();
	}

	public static void readWriteFile() throws FileNotFoundException {
		Node current = head;
		PrintWriter pw = new PrintWriter("/home/admin1/Desktop/UnOrderList.txt");
		while (current.next != null) {
			pw.print(current.data1);
			pw.print(" ");
			current = current.next;
		}
		pw.print(current.data1);
		pw.flush();
	}

	/*********************** Calender.java **************************/

	public static int getDayNumber(int date, int month, int year) {
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int day = (date + x + 31 * m0 / 12) % 7;
		return day;
	}

	public static boolean isLeafYear(int year) {
		if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0)
			return true;
		else
			return false;
	}

	public static String[] getMonthData(int month, int year) {
		String non_leap[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" };

		String leap[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
				"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29" };

		String month_30[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };

		String month_31[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
				"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return month_31;
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return month_30;
		} else if (month == 2 && isLeafYear(year)) {
			return leap;
		} else {
			return non_leap;
		}

	}

	/********************* Balanced_Parentheses **********************/
	public static boolean isMatchingPair(char char1, char char2) {
		if (char1 == '(' && char2 == ')')
			return true;
		else if (char1 == '{' && char2 == '}')
			return true;
		else if (char1 == '[' && char2 == ']')
			return true;
		else
			return false;
	}

	public static boolean isParenthesesBalanced(char expression[]) {
		Stack stk = new Stack();
		for (int i = 0; i < expression.length; i++) {
			if (expression[i] == '{' || expression[i] == '[' || expression[i] == '(') {
				stk.push(expression[i]);
			}
			if (expression[i] == '}' || expression[i] == ']' || expression[i] == ')') {
				if (stk.isEmpty()) {
					return false;
				} else if (!isMatchingPair(stk.pop(), expression[i])) {
					return false;
				}
			}
		}
		return true;
	}

	/****************** Prime_And_Anagram_Array ********************/

	public static int[] primeNumberArray(int number) {
		int arr[] = new int[1000];
		int i = 0, k = 0;
		for (i = 2; i < number; i++) {
			int counter = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					counter++;
				}
			}
			if (counter == 2) {
				arr[k] = i;
				k++;
			}
		}
		return arr;
	}

	public static int[] anagramArray(int arr1[]) {
		int count = 0;
		int arr2[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (Utility.anagram(arr1[i], arr1[j]) == true) {
					arr2[count] = arr1[i];
					count++;
					arr2[count] = arr1[j];
					count++;
				}
			}
		}

		return arr2;
	}

	public static int[] compareTo(int arr[], int arr2[]) {
		int arr3[] = new int[arr.length];

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int flag = 1;
			for (int j = 0; j < arr2.length; j++) {
				if (arr[i] == arr2[j]) {
					flag = 0;
					break;
				} else
					flag = 1;

			}
			if (flag == 1) {
				arr3[count] = arr[i];
				count++;
			}
		}
		return arr3;

	}

	/************** Binary_Search_Tree *************************/
	// BST.java
	// BinarySearchTree.java

	/************** Banking_Cash_Counter ******************/

	static int bank_amount = 5000;
	static int check;
	static int deposit;
	static int withdraw;

	public static void enqueue(int users) {
		for (int i = 1; i <= users; i++) {
			transaction();
		}
	}

	public static void transaction() {
		System.out.println("Enter your choice:\n1.Deposit\n2.Withdraw");
		int choice = Utility.integerInput();
		switch (choice) {
		case 1:
			System.out.println("Enter amount to deposit: ");
			int amount = Utility.integerInput();
			check = 1;
			dequeue(amount, check);
			break;
		case 2:
			System.out.println("Enter amount to withdraw: ");
			amount = Utility.integerInput();
			check = 0;
			dequeue(amount, check);
			break;
		default:
			System.out.println("Enter Proper Choice!!");
			Utility.transaction();
		}
	}

	public static void dequeue(int amount, int check) {
		if (check == 1) {
			bank_amount = bank_amount + amount;
			System.out.println("Amount Deposited Successfully!!");
		} else if (amount < bank_amount) {
			bank_amount = bank_amount - amount;
			System.out.println("Amount withdraw successfully!!");
		} else {
			System.out.println("Not enough bank amount");
		}

	}

	/********************* Stack_Using_Linked_List ******************/
	// stack using linked list.java
	// stack1.java

	/********************* Queue_Using_Linked_List *****************/
	// queue using linked list.java
	// queue1.java

	/************** Hashing_Function_To_Search_Number **************/
	public static void getValue(int key, int data) {
		LinkedListUtility<Integer> list = (LinkedListUtility<Integer>) Hashing.ob[key];
		if (list.search(data)) {
			list.removeAtIndex((int) list.index(data));
		} else {
			list.add(data);
		}
		list.display();
	}

	public static int[] inputFromFile() throws IOException {
		File file = new File(
				"/home/admin1/Desktop/FellowshipProgramsJavaAishwarya/Fellowship_Sampada_Prabhu/src/com/bridgelabz/fellowship/DataStructurePrograms/Hash");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String lines[] = br.readLine().split(",");
		int arr[] = new int[lines.length];
		for (int i = 0; i < lines.length; i++) {
			arr[i] = Integer.parseInt(lines[i]);
		}
		return arr;

	}

	public static void writeInFileHash() throws FileNotFoundException {
		Node current = head;
		PrintWriter pw = new PrintWriter(
				"/home/admin1/Desktop/FellowshipProgramsJavaAishwarya/Fellowship_Sampada_Prabhu/src/com/bridgelabz/fellowship/DataStructurePrograms/Hash");
		while (current.next != null) {
			pw.print(current.data1);
			pw.print(" ");
			current = current.next;
		}
		pw.print(current.data1);
		pw.flush();
	}

	/******************** Binary_Search_Tree *********************/

	public static double factorial(double i) {
		double fact = 1;
		while (i > 0) {
			fact = fact - i;
			i--;
		}
		return fact;
	}

	public static BigInteger countBinarySearchTree(double d) {
		double a = 2 * d;
		double b = d + 1;
		BigInteger x = calculateNode(a);
		BigInteger y = calculateNode(b);
		BigInteger c = calculateNode(d);

		return x.divide(y.multiply(c));
	}

	public static BigInteger calculateNode(double a) {

		BigInteger factorial = BigInteger.ONE;
		for (double i = a; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf((long) i));
		}
		return factorial;
	}

}