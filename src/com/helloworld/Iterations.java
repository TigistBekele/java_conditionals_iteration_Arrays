package com.helloworld;

public class Iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Create a method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11.
for(int counter = 10; counter < 100; counter++) {
	
           // Finding the first digit
           int first = counter / 10;
            
           // Finding the last digit
           int last = counter % 10;
            
           // Finding the sum of the digits
           int sum = first + last;
           
    System.out.println( "The sum of two digits is " + counter + " " + sum);  
    
//    ***************OR**************
     
//	int firstDigit = counter % 10;
//    int remainingNumber = counter / 10;
//    int SecondDigit = remainingNumber % 10;
//    remainingNumber = remainingNumber / 10;
//	
//    int sum = firstDigit + SecondDigit;
//    
//    System.out.println( "this is " + counter + " " + sum);  
           
}        


//Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
	
//Expand on the method you wrote in Numbers 2 to allow the input 1-999.


Iterations abc = new Iterations();
System.out.println("* " + abc.convert(567));
System.out.println("* " + abc.convert(-98));
	
	}     
	
	
		private static final String[] specialNames = {
		        "",
		        " thousand",
		        " million",
		     	    };
		    
		    private static final String[] tensNames = {
		        "",
		        " ten",
		        " twenty",
		        " thirty",
		        " forty",
		        " fifty",
		        " sixty",
		        " seventy",
		        " eighty",
		        " ninety"
		    };
		    
		    private static final String[] numNames = {
		        "",
		        " one",
		        " two",
		        " three",
		        " four",
		        " five",
		        " six",
		        " seven",
		        " eight",
		        " nine",
		        " ten",
		        " eleven",
		        " twelve",
		        " thirteen",
		        " fourteen",
		        " fifteen",
		        " sixteen",
		        " seventeen",
		        " eighteen",
		        " nineteen"
		    };
		    
		    private String convertLessThanOneThousand(int number) {
		        String current;
		        
		        if (number % 100 < 20){
		            current = numNames[number % 100];
		            number /= 100;
		        }
		        else {
		            current = numNames[number % 10];
		            number /= 10;
		            
		            current = tensNames[number % 10] + current;
		            number /= 10;
		        }
		        if (number == 0) return current;
		        return numNames[number] + " hundred" + current;
		    }
		    
		    public String convert(int number) {

		        if (number == 0) { return "zero"; }
		        
		        String prefix = "";
		        
		        if (number < 0) {
		            number = -number;
		            prefix = "negative";
		        }
		        
		        String current = "";
		        int place = 0;
		        
		        do {
		            int n = number % 1000;
		            if (n != 0){
		                String s = convertLessThanOneThousand(n);
		                current = s + specialNames[place] + current;
		            }
		            place++;
		            number /= 1000;
		        } while (number > 0);
		        
		        return (prefix + current).trim();
		    }
		    
	
}
