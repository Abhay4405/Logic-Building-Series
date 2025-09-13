package SumOfTwoMatrices;

public class Main {
	public static void main(String[] args) {
		int[][] arr1 = { { 2, 3, 4 }, { 1, 6, 8 } };
		int[][] arr2 = { { 2, 3, 4 }, { 1, 6, 8 } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println(arr1[i][j] + arr2[i][j]);
			}
		}
	}
}
