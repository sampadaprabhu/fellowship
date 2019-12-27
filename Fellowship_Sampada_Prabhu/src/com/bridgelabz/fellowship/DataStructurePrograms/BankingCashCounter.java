package com.bridgelabz.fellowship.DataStructurePrograms;

import com.bridgelabz.fellowship.utility.Utility;

public class BankingCashCounter {

	public static void main(String[] args) {
		int users;
		System.out.println("Enter the users: ");
		users=Utility.integerInput();
		Utility.enqueue(users);
	}

}
