package ProductOfAllElementsInArray;

public class Main {
public static void main(String[] args) {
	int[] arr = {1,8,4,5};
	int product = 1;
	for (int i = 0; i < arr.length; i++) {
		product = product * arr[i];
	}
	System.out.println(product);
}
}
