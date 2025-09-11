package Convert2DArrayinto1DArray;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	int[][] arr = {{1,2,3},{4,5,6}};
	int[] newArr = new int[arr.length*arr[0].length];
	int index = 0;
	
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			newArr[index] = arr[i][j];
			index++;
		}
	}
	System.out.println(Arrays.toString(newArr));
}
}
