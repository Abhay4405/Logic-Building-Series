package EqualityOf2Arrays;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 7, 9 };
		int[] arr2 = { 2, 5, 7, 5, 9 };
		boolean isEqual = true;

		if (arr1 != arr2) {
			isEqual = false;
		} else {
			for (int i = 0; i < arr2.length; i++) {
				if (arr1[i] == arr2[i]) {
					isEqual = true;
				} else {
					isEqual = false;
				}
			}
		}
		if (isEqual) {
			System.out.println("Both The Arrays Are Equal");
		} else {
			System.out.println("The Arrays Are Not Equal");
		}
	}
}
