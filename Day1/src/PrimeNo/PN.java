package PrimeNo;

public class PN {
public static void main(String[] args) {
	int num = 61;
	boolean isPrime = true;
	for (int i = 2; i < num - 1; i++) {
		if (num % i == 0) {	
			isPrime = false;
		}	
	}
	if (isPrime) {
		System.out.println("Prime Number!!");	
		}
	else {
		System.out.println("Not a Prime Number!!");
	}
}
}