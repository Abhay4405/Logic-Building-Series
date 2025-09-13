package AvgOfNoInArray;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 5, 10, 20, 25, 40 };
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println(avg);
	}
}
