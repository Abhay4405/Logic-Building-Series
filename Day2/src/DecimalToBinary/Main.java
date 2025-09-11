package DecimalToBinary;

public class Main {
public static void main(String[] args) {
	int num = 10;
	String binary = "";
	while (num != 0) {
		int rem = num % 2;
		binary = rem + binary;
		num = num/2;
	}
	System.out.println(binary);
}
}
