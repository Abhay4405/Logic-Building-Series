package Factorial;

import java.util.Iterator;

public class Fact {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int times = 10;

		if (times > 1) {
			System.out.println(num1);
		}
		if (times >= 2) {
			System.out.println(num2);
		}
		for (int i = 3; i <= times; i++) {
			int next = num1 + num2;
			System.out.println(next);
			num1 = num2;
			num2 = next;
		}
	}
}
