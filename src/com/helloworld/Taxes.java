package com.helloworld;

public class Taxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(method1(5000));
		System.out.println(method1(17000));
		System.out.println(method1(25000));
		System.out.println(method1(40000));
		System.out.println(method1(50000));

		System.out.println(method2(5000));
		System.out.println(method2(17000));
		System.out.println(method2(25000));
		System.out.println(method2(40000));
		System.out.println(method2(50000));

		fizzbuzz(100);
	}

	public static int method1(int salary) {
		int tax1 = salary * 1;
		int tax2 = salary * 10 / 100;
		int tax3 = salary * 15 / 100;
		int tax4 = salary * 20 / 100;
		int tax5 = salary * 25 / 100;

		if ((salary > 0) && (salary < 14999)) {
			return tax1;
		} else if (salary >= 15000 && salary < 19999) {
			return salary - tax2;
		} else if (salary >= 20000 && salary < 29999) {
			return salary - tax3;
		} else if (salary >= 30000 && salary < 44999) {
			return salary - tax4;
		} else {
			return salary - tax5;
		}

	}

	public static int method2(int salary) {
		int taxa = salary * 1;
		int taxb = salary * 10 / 100;
		int taxc = salary * 15 / 100;
		int taxd = salary * 20 / 100;
		int taxe = salary * 25 / 100;

		if ((salary > 0) && (salary < 14999)) {
			return 0;
		} else if (salary >= 15000 && salary < 19999) {
			return taxb;
		} else if (salary >= 20000 && salary < 29999) {
			return taxc;
		} else if (salary >= 30000 && salary < 44999) {
			return taxd;
		} else {
			return taxe;
		}

	}

//	FizzBuzz

	public static void fizzbuzz(int num) {

		for (num = 1; num <= 100; num++) {
			if (num % 3 == 0) {
				System.out.println("Fizz");
			} else if (num % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(num);
			}

		}

	}
}