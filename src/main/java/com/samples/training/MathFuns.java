package com.samples.training;

public class MathFuns {

	public static void main(String[] args) {
		Double num = -1.0;

		Double squareroot = sqrt(num);
		System.out.println("The square root of the given number " + num + " = " + squareroot);

		Double square = square(num);
		System.out.println("The square of the given number " + num + " = " + square);

	}

	public static double sqrt(double num) {
		// return Math.pow(num, 0.5);
		return Math.sqrt(num);
	}

	public static double square(double num) {
		return Math.pow(num, 2);
	}

	public static double cube(double num) {
		return Math.pow(num, 3);
	}

	public static double power(double num, double p) {
		return Math.pow(num, p);
	}

}