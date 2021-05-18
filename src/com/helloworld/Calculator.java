package com.helloworld;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result;

		result = add(10, 10);

		System.out.println(result);

		int multi;

		multi = multiplication(10, 10);

		System.out.println(multi);

		int sub;

		sub = subtraction(10, 10);

		System.out.println(sub);

		division(10.5d, 2.5d);
		Flowcharts(5, 7, true);
		Flowcharts(5, 7, false);

		Result.displayResults();
		Result.displayExamOverall();
		Result.displayPassMark();
		Result.displayOverallPassMark();
	}

	public static int add(int num1, int num2) {

		return num1 + num2;
	}

	public static int multiplication(int x, int y) {

		return x * y;
	}

	public static int subtraction(int w, int z) {

		return w - z;
	}

	public static void division(double a, double b) {

		if (a < b) {
			System.out.println(a / b);
		} else {
			System.out.println("The division cannot be performed.");
		}

	}

	public static void Flowcharts(int numa, int numb, boolean booli) {

		if (booli == true) {
			System.out.println(numa + numb);
		} else {
			System.out.println(numa * numb);
		}

	}

}