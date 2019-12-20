package com.bridgelabz.fellowship.utility;

public class StopWatch {

	public static void main(String[] args) {
		double start=Utility.startTime();
		System.out.println("Time Started at: "+start);
		
		double stop=Utility.stopTime();
		System.out.println("Time Stopped at: "+stop);
		
		System.out.println("Elapsed time is: "+(stop-start)/1000);

	}

}
