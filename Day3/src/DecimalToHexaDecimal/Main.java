package DecimalToHexaDecimal;

public class Main {
	public static void main(String[] args) {
		int num = 1000;
		char[] hexNum = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		String x = "";
		while (num != 0) {
			int rem = num % 16;
			x = hexNum[rem] + x;
			num = num / 16;
		}
		System.out.println(x);
	}
}
