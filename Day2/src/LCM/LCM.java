package LCM;

public class LCM {
	public static void main(String[] args) {
		int n1 = 12;
		int n2 = 18;
		int gcd = 0;

		for (int i = 1; i < n1 && i < n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}

		}
		int lcm = (n1 * n2) / gcd;
		System.out.println("LCM of " + n1 + " & " + n2 + " is " + lcm);
	}
}