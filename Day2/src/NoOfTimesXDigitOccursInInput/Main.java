package NoOfTimesXDigitOccursInInput;

public class Main {
public static void main(String[] args) {
	int num = 4536454;
	int digit = 4;
	int count = 0;
	while (num != 0) {
		int rem = num%10;
		if (rem == digit) {
			count ++;
		}
		num = num/10;
	}
	System.out.println(count);
}
}
