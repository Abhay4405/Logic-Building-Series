package ArrayRightRotationBydPosition;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int d = 3;
		for (int i = 0; i < d; i++) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
