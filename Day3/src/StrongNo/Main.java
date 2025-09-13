package StrongNo;

public class Main {
	public static int fact(int n) {
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int num = 145;
		int result = 0;
		int n = num;
		while (num != 0) {
			int rem = num % 10;
			result = result + fact(rem);
			num = num / 10;
		}
		if (result == n) {
			System.out.println(n + " is a Strong Number");
		} else {
			System.out.println(n + " is not a Strong Number");
		}

	}
}
