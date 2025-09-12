package SortArrayAccToOrderDefinedByAnotherArray;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	int[] arr1 = {1,3,2,4};
	int[] arr2 = {4,3,2,1};
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr2.length; j++) {
			if (arr1[i] == arr2[j]) {
				int temp = arr2[j];
				arr2[j] = arr2[i];
				arr2[i] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(arr2));
}
}
