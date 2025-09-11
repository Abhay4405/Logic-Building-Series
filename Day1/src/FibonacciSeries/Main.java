package FibonacciSeries;

import java.util.Iterator;

public class Main {
public static void main(String[] args) {
	int n1 = 0;
	int n2 = 1;
	int times = 10;
	if (n1>=0) {
		System.out.println(n1);
	}
	if (n2>=1) {
		System.out.println(n2);
	}
	for (int i = 3; i < times; i++) {
		int next = n1+n2;
		System.out.println(next);
		n1 = n2;
		n2 = next;
	}
}
}
