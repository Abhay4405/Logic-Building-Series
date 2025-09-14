package SquareRoot;

import java.util.Iterator;

public class Main {
	public static double sqrt(int num , double guess) {
		double new_guess = (guess+num/guess)/2;
		if (new_guess == guess) {
			System.out.println(new_guess);
			return new_guess;
		}
		return sqrt(num, new_guess);
	}
	public static void main(String[] args) {
		System.out.println(sqrt(80, 80/2));
	}
}
