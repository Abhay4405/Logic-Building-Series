package SortAnArrayInAscendingOrder;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 2, 9, 4, 1, 6, 3 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.println(Arrays.toString(arr));
		}
	}
}
