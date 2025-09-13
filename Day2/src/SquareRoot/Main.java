package SquareRoot;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		int num = 169;
		for (int i = 0; i < num / 2; i++) {
			if (i * i == num) {
				System.out.println("The Square Root Of " + num + " is " + i);
			}
		}
	}
}
