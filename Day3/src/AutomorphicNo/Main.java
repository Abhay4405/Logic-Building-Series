package AutomorphicNo;

public class Main {
public static void main(String[] args) {
	int num = 5;
	int square = num * num;
	int rem = square % 10;
	if (num == rem) {
		System.out.println(num + " is a Automorphic Number");
	} else {
		System.out.println(num + " is not a Automorphic Number");
	}
}
}
