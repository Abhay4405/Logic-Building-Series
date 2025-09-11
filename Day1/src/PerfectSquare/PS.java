package PerfectSquare;

public class PS {
public static void main(String[] args) {
	int num = 169;
	boolean isPerfect = false;
	
	for (int i = 1; i < num/2; i++) {
		if (i*i==num) {
			isPerfect = true;
			break;
		}
	}
	if (isPerfect) {
		System.out.println("It is a Perfect Square");
	}
	else {
		System.out.println("Its not a Perfecr Square");
	}
}
}