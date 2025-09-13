package Replace0swith1s;

public class Main {
	public static void main(String[] args) {
		int num = 3006;
		int pow = 1;
		int ans = 0;
		while (num != 0) {
			int rem = num % 10;
			if (rem == 0) {
				rem = 1;
			}
			ans = ans + rem * pow;
			num = num / 10;
			pow = pow * 10;
		}
		System.out.println(ans);
	}
}
