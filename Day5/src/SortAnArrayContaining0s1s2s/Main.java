package SortAnArrayContaining0s1s2s;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	int[] arr = {6,0,2,1,5,2,1,0};
	for (int i = 0; i < arr.length; i++) {
	for (int j = 0; j < arr.length - 1; j++) {
		if (arr[j] > arr[j+1]) {
			int temp = arr[j+1];
			arr[j+1] = arr[j];
			arr[j] = temp;
		}
		
	}
	}
	System.out.println(Arrays.toString(arr));
}
}
