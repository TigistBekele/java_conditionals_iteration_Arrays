package com.helloworld;

public class HelloWorld {

	public static String msg = "new hello world";

	public static void main(String[] args) {



		System.out.println("Hello World!");

		String myString = "This is String variable";

		System.out.println(myString);

		int myInt;

		myInt = 32;

		System.out.println(myInt);

		float myFloat = 2.5f;
		System.out.println(myFloat);

		System.out.println("Hello World!");
		System.out.println("Hello World!");

		System.out.print("Hello World!");
		System.out.print("Hello World!");

		System.out.println(msg);

		exampleMethod();
		
		int result;
		
		result = add(6,7);
		
		System.out.println(result);
		
//		printThese(12,5);
		
		

	}

	public static void exampleMethod() {
		// TODO Auto-generated method stub

		System.out.println("Hello World two!");

		System.out.println(msg);

	}

	public static void printThese(int num1, int num2) {
//System.out.println(num1);
//System.out.println(num2);



	}
	

	public static int add(int num1, int num2) {

		return num1 + num2; 

	}
}
