package DecimalToOctal;

public class Main {
	public static void main(String[] args) {
		int num = 973;
		String octal = "";
		while (num != 0) {
			int rem = num % 8;
			octal = rem + octal;
			num = num/8;
		}
		System.out.println(octal);
	}
}
