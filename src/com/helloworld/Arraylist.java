package com.helloworld;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrayList = new ArrayList<>();

		arrayList.add(23);
		arrayList.add(20);
		arrayList.add(22);
		arrayList.add(21);
		arrayList.add(25);

		System.out.println("ArrayList: " + arrayList);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		for (Integer handle : arrayList) {
			System.out.println(handle);
		}

		System.out.println(arrayList.get(2));

		arrayList.set(0, 100);
		System.out.println(arrayList);

		arrayList.remove(4);
		System.out.println(arrayList);

		Collections.sort(arrayList);
		System.out.println(arrayList);

		Collections.reverse(arrayList);
		System.out.println(arrayList);

		Collections.swap(arrayList, 0, 2);
		System.out.println(arrayList);

		arrayList.clone();
		System.out.println(arrayList);
	}
	

}
