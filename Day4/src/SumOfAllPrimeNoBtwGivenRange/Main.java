package SumOfAllPrimeNoBtwGivenRange;

public class Main {

	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int range = 10;
		int sum = 0;
		for (int i = 2; i < range; i++) {
			if (isPrime(i)) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
