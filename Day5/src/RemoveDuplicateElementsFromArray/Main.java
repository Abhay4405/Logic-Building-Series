package RemoveDuplicateElementsFromArray;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	int[] arr = {2,5,7,2,7,5};
	for (int i = 0; i < arr.length-1; i++) {
		if (arr[i] == 0) {
			continue;
		}
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i] == arr[j]) {
				arr[j] = 0;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
