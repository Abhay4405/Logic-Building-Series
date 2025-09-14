package AlternatingNegativeAndPositive;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 1, -2, -3, 5, 7, -9, -8 };
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				index+=2;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
