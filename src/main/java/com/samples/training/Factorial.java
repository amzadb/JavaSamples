package com.samples.training;

public class Factorial {
	public static long getfactorial(int number) {
        long result = 1; 
        
        while (number != 0) { 
           result = number * result; 
           number--; 
        }
        return result;	
     }
	
	public static void main(String[] args) {
		int number = 4;
		long factorial = getfactorial(number);
		
		System.out.println("Factorial of " + number + " is: " + factorial);
		
		number = 5;
		factorial = getfactorial(number);
		
		System.out.println("Factorial of " + number + " is: " + factorial);
		
		number = 6;
		factorial = getfactorial(number);
		
		System.out.println("Factorial of " + number + " is: " + factorial);
		
		number = 7;
		factorial = getfactorial(number);
		
		System.out.println("Factorial of " + number + " is: " + factorial);
	}

}
