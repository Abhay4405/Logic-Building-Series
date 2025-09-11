package MinMaxElementIn2DArray;

public class Main {
public static void main(String[] args) {
	int[][] arr = {{2,3,1},{5,9,7}};
	int min = arr[0][0];
	int max = arr[0][0];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			if (arr[i][j] < min) {
				min = arr[i][j];
			}else if (arr[i][j] > max) {
				max = arr[i][j];
			} 
		}
	}
	System.out.println("The Minimum and Maximum element in Array is " + min +" and "+ max);
}
}
