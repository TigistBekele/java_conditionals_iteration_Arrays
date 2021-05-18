package com.helloworld;

public class Result {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

	
	public static double Physics = 130;
	public static double Chemistry = 100;
	public static double Biology = 110;
	public static double total= Physics + Chemistry + Biology;
	public static double percentage;
	public static double passmarkPhy = Physics * 100 / 150;
	public static double passmarkChem = Chemistry * 100 / 150;
	public static double passmarkBio = Biology * 100 / 150;
public static void displayResults() {
		// TODO Auto-generated method stub
		
		System.out.println("Physics Marks: " + Physics);
		System.out.println("Physics Marks: " + Chemistry);
		System.out.println("Physics Marks: " + Biology );
		
		System.out.println("overall MArk : " +  total);
		
	}
	
public static void displayExamOverall() {
	
	System.out.println("persentage of all : " + total * 100 / 450 );
		
	}

public static void displayPassMark() {
	
	 System.out.println("PassMark of Physics is : " + passmarkPhy );
     System.out.println("PassMark of Physics is : " + passmarkChem );
	 System.out.println("PassMark of Physics is : " + passmarkBio );
		
	}

public static void displayOverallPassMark() {
	
	if((passmarkPhy > 60) && (passmarkChem > 60) && (passmarkBio > 60)) {
		System.out.println( "You pass all exam");
	}else {
		System.out.println("You fail");
	}
		
//	****************************OR**********************************
	
//	if((passmarkPhy < 60) || (passmarkChem < 60) || (passmarkBio < 60)) {
//		System.out.println( "You fail ");
//	}else {
//		System.out.println("You pass all exam");
//	}
//		
	}

}
