package com.samples.training;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FindFactorial {

	private static ExecutorService executor = Executors.newSingleThreadExecutor();

	public static Future<Long> getFactorial(Integer number) {
		return executor.submit(() -> {
			long result = 1;
			int num = number;
			while (num != 0) {
				result = result * num;
				num--;
				Thread.sleep(100);
			}
			return result;
		});
	}

	private static Long getFactorialAsync(int number) throws InterruptedException, ExecutionException {
		Future<Long> future = getFactorial(number);
		while (!future.isDone()) {
			System.out.println("Calculating " + number + "!");
			Thread.sleep(100);
		}

		Long factorial = future.get();
		return factorial;
	}

	public static void main(String[] args) throws Exception {
		int number = 3;
		Long factorial = getFactorialAsync(number);
		System.out.println("Factorial of " + number + " is: " + factorial);

		number = 5;
		factorial = getFactorialAsync(number);
		System.out.println("Factorial of " + number + " is: " + factorial);

		number = 10;
		factorial = getFactorialAsync(number);
		System.out.println("Factorial of " + number + " is: " + factorial);

		executor.shutdown();
		System.exit(0);
	}

}
