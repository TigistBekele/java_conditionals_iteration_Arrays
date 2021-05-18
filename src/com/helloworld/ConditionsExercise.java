package com.helloworld;

public class ConditionsExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flowcharts(5, 7, true);
		Flowcharts(5, 7, false);

		System.out.println(blackjack(10, 21));
		System.out.println(blackjack(20, 18));
		System.out.println(blackjack(1, 22));
		System.out.println(blackjack(22, 23));

		System.out.println(uniquesum(1, 2, 3));
		System.out.println(uniquesum(3, 3, 3));
		System.out.println(uniquesum(1, 1, 2));
		System.out.println(uniquesum(3, 2, 2));
		System.out.println(uniquesum(3, 6, 3));
	}

// BlackJack

	public static void Flowcharts(int numa, int numb, boolean booli) {

		if (booli == true) {
			System.out.println(numa + numb);
		} else {
			System.out.println(numa * numb);
		}

	}

	public static int blackjack(int numx, int numz) {
		if (numx > 21)
			numx = 0;
		if (numz > 21)
			numz = 0;

		if (numx > numz) {
			return numx;

		} else {
			return numz;
		}

	}
//	Unique Sum

	public static int uniquesum(int r, int s, int t) {

		int sum = r + s + t;

		if (r == s && s == t) {
			return 0;
		}

		else if (r == s) {
			return t;
		} else if (s == t) {
			return r;
		} else if (r == t) {
			return s;

		} else {
			return sum;
		}

	}
	

}
