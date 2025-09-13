package NearestSmallestElementFromTheLeftSideOfArray;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4, 5, 6 };
		int smallest = arr[0];
		for (int i = 0; i < arr.length / 2; i++) {
			if (smallest > arr[i]) {

				smallest = arr[i];
			}
		}
		System.out.println(smallest + " is the smallest element");
	}
}
