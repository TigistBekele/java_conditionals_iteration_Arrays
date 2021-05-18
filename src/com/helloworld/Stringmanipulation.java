package com.helloworld;

public class Stringmanipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	1.	Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
		String myStr1 = "yesterday it was raining ";
		String myStr2 = "today it is sunny ";
		System.out.println(myStr2.toUpperCase() + "," + myStr1.toUpperCase());

		String mySubString1 = myStr2.substring(0, 11);
		String mySubString2 = myStr1.substring(16, 24);
		System.out.println(mySubString1 + mySubString2);
//	2.	For this task you are to implement 4 methods that manipulate String objects. For all parts of this section you are only allowed to use the length(), substring(), and equals() methods. Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:
		
//		Mothod 1
		String countstring = "yesterday";
		System.out.println(countstring.length());


		System.out.println(myStr1.substring(3, 10));
		System.out.println(myStr1.equals(myStr2));
     
//		Method 2
		String b = "Today";
		String sub1 = b.substring(0, 1);
		String sub2 = b.substring(1, 2);
		String sub3 = b.substring(2, 3);
		String sub4 = b.substring(3, 4);
		String sub5 = b.substring(4, 5);

		String join = sub1 + "\n" + sub2 + "\n" + sub3 + "\n" + sub4 + "\n" + sub5;
		System.out.println(join);
		
		
//		Method 3
		String r = "Today";
		String suba = r.substring(0, 1);
		String subb = r.substring(1, 2);
		String subc = r.substring(2, 3);
		String subd = r.substring(3, 4);
		String sube = r.substring(4, 5);

		String joinReverse = sube + "\n" + subd + "\n" + subc + "\n" + subb + "\n" + suba;
		System.out.println(joinReverse);
//		Method 4
		System.out.println(myStr1.substring(3, 10));
		System.out.println(myStr1.equals(myStr2));
	}

}
