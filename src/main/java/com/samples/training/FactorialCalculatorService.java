package com.samples.training;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialCalculatorService {

	private static ExecutorService executor = Executors.newSingleThreadExecutor();

	public static void main(String[] args) throws Exception {
		int number = 3;
		System.out.println("Calling FacotrialCalualtor(" + number + ")");
		Future<Long> future3 = executor.submit(new FactorialCalculator(number));

		Long factorial3 = future3.get();
		System.out.println("3! = " + factorial3);

		number = 5;
		System.out.println("Calling FacotrialCalualtor(" + number + ")");
		Future<Long> future5 = executor.submit(new FactorialCalculator(number));

		Long factorial5 = future5.get();
		System.out.println("5! = " + factorial5);

		number = 10;
		System.out.println("Calling FacotrialCalualtor(" + number + ")");
		Future<Long> future10 = executor.submit(new FactorialCalculator(number));

		Long factorial10 = future10.get();
		System.out.println("10! = " + factorial10);

		executor.shutdown();
		System.exit(0);
	}

}

class FactorialCalculator implements Callable<Long> {

	private int number;

	public FactorialCalculator(int number) {
		this.number = number;
	}

	private Long getFactorial() throws InterruptedException {
		long result = 1;

		while (number != 0) {
			result = number * result;
			number--;
			Thread.sleep(100);
		}
		return result;
	}

	@Override
	public Long call() throws Exception {
		return getFactorial();
	}

}