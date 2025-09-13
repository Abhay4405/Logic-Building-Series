package FirstHalfAscendingSecondHalfDecending;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 6, 8, 3, 4, 2, 9, 5, 1 };
		int mid = arr.length / 2;
		for (int j = 0; j < mid - 1; j++) {
			for (int i = 0; i < mid - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int j = mid; j < arr.length; j++) {
			for (int i = mid; i < arr.length - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
