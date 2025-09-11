package MoveAllThe0sToTheRightOfArray;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	int[] arr = {3,6,0,7,0,9,8,0};
	int index = arr.length-1;
	for (int i = arr.length-1; i >=0; i--) {
		if (arr[i] == 0) {
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
			index--;
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
