package LargestElementInArray;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 3, 1 };
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}
}
