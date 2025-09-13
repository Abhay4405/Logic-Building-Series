package PrimeNo;

public class PN {
	public static void main(String[] args) {
		int num = 61;
		boolean isPrime = true;
		for (int i = 2; i < num ; i++) {
			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(num + " is a Prime Number!!");
		} else {
			System.out.println(num + " is not a Prime Number!!");
		}
	}
}