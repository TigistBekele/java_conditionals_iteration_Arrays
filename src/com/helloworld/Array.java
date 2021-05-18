package com.helloworld;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] rarry = new int[10];
		System.out.println(rarry);

		int[] intarrays = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for (int i = 0; i < intarrays.length; i++) {

			System.out.println(intarrays[i]);
		}
		for (int i = 0; i < intarrays.length; i++) {

			System.out.println(intarrays[i] * 10);
		}

		arraystring();

		method();
	}

//	Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.
	public static void arraystring() {

		String[] strarry = { "banana", "orange", "apple", "lime" };
		for (int i = 0; i < strarry.length; i++) {

			String strarr1 = strarry[i]; 
			
			System.out.println(strarr1);		
		}

	}

	public static void method() {
		System.out.println("Starting task");

		int[] strarry = new int[10];
		for (int x = 0; x < strarry.length; x++) {
			strarry[x] = x + 1;
			System.out.println(strarry[x] + "");
		}
		
		System.out.println("");
		
		for (int x = 0; x < strarry.length; x++) {
			strarry[x] = strarry[x] * 10;
			System.out.println(strarry[x] + "");
		}
	}

}