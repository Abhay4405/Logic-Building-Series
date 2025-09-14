package SecondLargestNoInArray;

public class Main {
public static void main(String[] args) {
	int[] arr = {9,12,5,3,8,15};
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length-1; j++) {
			if (arr[j] > arr[j+1]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println(arr[arr.length-2]);
}
}
