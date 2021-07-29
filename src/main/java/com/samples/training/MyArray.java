package com.samples.training;

public class MyArray {

	public static void main(String[] args) {
		int scores[] = { 68, 75, 88, 83, 76, 65, 48, 82, 91, 95 };
		int highScore = findHighScore(scores);
		int lowScore = findLowScore(scores);
		int averageScore = findAverageScore(scores);
		int highLowAverage = averageOfHighAndLow(scores);
		System.out.println("High Score: " + highScore);
		System.out.println("Low Score: " + lowScore);
		System.out.println("Average Score: " + averageScore);
		System.out.println("High Low Average: " + highLowAverage);
	}

	private static int findAverageScore(int[] scores) {
		int average = 0;
		for (int i = 0; i < scores.length; i++) {
			average += scores[i];
		}
		average = average / scores.length;
		return average;
	}

	private static int averageOfHighAndLow(int[] scores) {
		int highScore = findHighScore(scores);
		int lowScore = findLowScore(scores);
		return (highScore + lowScore) / 2;
	}

	private static int findLowScore(int[] scores) {
		int low = scores[0];
		for (int i = 0; i < scores.length; i++) {
			low = (scores[i] < low) ? scores[i] : low;
		}
		return low;
	}

	private static int findHighScore(int[] scores) {
		int high = scores[0];
		for (int i = 0; i < scores.length; i++) {
			high = (scores[i] > high) ? scores[i] : high;
		}
		return high;
	}

}
