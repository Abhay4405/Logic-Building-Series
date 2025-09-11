package Pallindrome;

public class Pld {
public static void main(String[] args) {
	int rem;
	int num = 78087;
	int reverse = 0;
	int n = num;
	
	while (num != 0) {
		rem = num % 10;
		reverse = (reverse * 10) + rem;
		num = num / 10;		
	}
	if (n == reverse) {
		System.out.println("Pallindrome");
	}
	else {
		System.out.println("Not a Pallindrome");
	}
}
}