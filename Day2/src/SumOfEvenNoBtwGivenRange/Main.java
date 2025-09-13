package SumOfEvenNoBtwGivenRange;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
