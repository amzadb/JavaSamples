package com.samples.training;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SquareCalculator {

	private static ExecutorService executor = Executors.newSingleThreadExecutor();

	public static Future<Integer> getSquare(Integer number) {
		return executor.submit(() -> {
			Thread.sleep(100);
			return number * number;
		});
	}

	private static Integer getSquareAsync(int number) throws InterruptedException, ExecutionException {
		Future<Integer> future = getSquare(number);
		while (!future.isDone()) {
			System.out.println("Calculating " + number + "^2");
			Thread.sleep(100);
		}

		Integer square = future.get();
		return square;
	}
	
	public static void main(String[] args) throws Exception {
		int number = 4;
		int square = getSquareAsync(number);
		System.out.println("Square of " + number + " is: " + square);

		number = 5;
		square = getSquareAsync(number);
		System.out.println("Square of " + number + " is: " + square);
		
		number = 9;
		square = getSquareAsync(number);
		System.out.println("Square of " + number + " is: " + square);
		
		executor.shutdown();		
		System.exit(0);
	}


}
