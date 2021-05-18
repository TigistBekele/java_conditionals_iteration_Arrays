package com.helloworld;

public class Iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
		for (int counter = 10; counter < 100; counter++) {

			// Finding the first digit
			int first = counter / 10;

			// Finding the last digit
			int last = counter % 10;

			// Finding the sum of the digits
			int sum = first + last;

			System.out.println("The sum of two digits is " + counter + " " + sum);

//    ***************OR**************

//	  int firstDigit = counter % 10;
//    int remainingNumber = counter / 10;
//    int SecondDigit = remainingNumber % 10;
//    remainingNumber = remainingNumber / 10;
//	
//    int sum = firstDigit + SecondDigit;
//    
//    System.out.println( "this is " + counter + " " + sum);  

		}

		Iterations abc = new Iterations();
		System.out.println("* " + abc.convert(567));
		System.out.println("* " + abc.convert(-98));

		flowChart1();
		flowChart2();

	
		
		printNumbers();
		printNumber();

	}

	private static final String[] specialNames = { "", " thousand", " million", };

	private static final String[] tensNames = { "", " ten", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };

	private static final String[] numNames = { "", " one", " two", " three", " four", " five", " six", " seven",
			" eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
			" seventeen", " eighteen", " nineteen" };

	private String convertLessThanOneThousand(int number) {
		String current;

		if (number % 100 < 20) {
			current = numNames[number % 100];
			number /= 100;
		} else {
			current = numNames[number % 10];
			number /= 10;

			current = tensNames[number % 10] + current;
			number /= 10;
		}
		if (number == 0)
			return current;
		return numNames[number] + " hundred" + current;
	}

	public String convert(int number) {

		if (number == 0) {
			return "zero";
		}

		String prefix = "";

		if (number < 0) {
			number = -number;
			prefix = "negative";
		}

		String current = "";
		int place = 0;

		do {
			int n = number % 1000;
			if (n != 0) {
				String s = convertLessThanOneThousand(n);
				current = s + specialNames[place] + current;
			}
			place++;
			number /= 1000;
		} while (number > 0);

		return (prefix + current).trim();
	}

//	Flowchart
//	Recreate the following flowchart as a project.	
	public static void flowChart1() {

		for (int A = 100; A < 200; A++) {

			System.out.println(A);

		}
	}

//	Recreate the following flowchart as a project.
	public static void flowChart2() {
		int A = 100;
		do {

			if (A % 2 == 0) {
				System.out.println("_");
				A++;
			} else {
				System.out.println("*");
				A++;
			}
		} while (A <= 200);

	}

//Create a method that can print out the numbers 1-10 10 times each.
	public static void printNumbers() {
		
		 for (int A=1;A<=10;A++) {
			 for (int B=1;B<=10;B++) //print 1 up to 10 B times
			 {
	    	  System.out.println(A);
	    		       }
}  

	
//	Create a method to print the numbers 1 to 10 as many times as the value of that number.
//	For example; you will print 1 once, and 10 ten times.

	   	  
    
}
	
	public static void printNumber() {
		
		 for (int A=1;A<=10;A++) {
			 for (int B=1;B<=A;B++) //print 1 up to 10 B times
			 {
	    	  System.out.println(A);
	    		       }
}  
	
	
}
}