package ArmstrongNo;

public class An {
public static void main(String[] args) {
	int num = 371;
	int r;
	int sum = 0;
	int n = num;
	while (num != 0) {
		r  = num % 10;
		sum = sum + (r*r*r);
		num = num / 10;
	}
	if (n == sum) {
	System.out.println("Armstrong Number");
	}
	else {
		System.out.println("Not a Armstrong Number");
	}
	
}
}