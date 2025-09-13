package PowerOfTheNumber;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		int num = 5;
		int pow = 3;
		int result = 1;
		for (int i = 1; i <= pow; i++) {
			result = result * num;
		}
		System.out.println(result);
	}
}
