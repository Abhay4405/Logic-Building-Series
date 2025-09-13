package ReverseAnArray;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 7, 2, 4, 3, 5 };
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
