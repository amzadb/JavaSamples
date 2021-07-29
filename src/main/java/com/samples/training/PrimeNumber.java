package com.samples.training;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 13;
		if (isPrime(number)) {
			System.out.println("The given number " + number + " is a prime number");
			checkEvenOdd(number);
		} else {
			System.out.println("The given number " + number + " is not a prime number");
			checkEvenOdd(number);
		}
	}
	
	private static void checkEvenOdd(int number) {
		if (number %2 == 0) {
			System.out.println(number + " is even"); 
		} else {
			 System.out.println(number + " is odd");
		}
	}

	private static boolean isPrime(int number) {
		boolean flag = true;
		if (number == 0 || number == 1) {
			return flag;
		} else {
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					flag = false;
					break;
				}
			}
			return flag;
		}
	}

}
