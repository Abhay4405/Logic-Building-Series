package LargestSumOfElementsFromGiven2Arrays;

public class Main {
public static void main(String[] args) {
	int[] arr1 = {3,6,7,2};
	int[] arr2 = {4,9,1,5};
	int sumOf1 = 0;
	int sumOf2 = 0;
	for (int i = 0; i < arr1.length; i++) {
		sumOf1 = sumOf1 + arr1[i];
	}
	for (int i = 0; i < arr2.length; i++) {
		sumOf2 = sumOf2 + arr2[i];
	}
	if (sumOf1 > sumOf2) {
		System.out.println("Array 1 has larger sum");
	}
	else if (sumOf1 < sumOf2) {
		System.out.println("Array 2 has larger sum");
	}else {
		System.out.println("Both the Arrays have same sum");
	}
}
}
