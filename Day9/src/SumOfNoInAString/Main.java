package SumOfNoInAString;

public class Main {
public static void main(String[] args) {
	String s = "36k1";
	int sum = 0;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)>='0' && s.charAt(i)<='9') {
			int num = s.charAt(i);
			num = num - 48;
			sum = sum + num;
		}
	}
	System.out.println("Sum of Numbers in String is "+sum);
}
}
