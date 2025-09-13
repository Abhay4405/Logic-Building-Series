package AllPairsOfElementInArrayWhoseSumIsEqualToGivenNumber;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 3, 6, 2, 8, 7, 1 };
		int num = 9;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == num) {
					System.out.println(arr[i] + " and " + arr[j]);
				}
			}
		}
	}
}
