package CheckIfStringContainsOnlyDigits;

public class Main {
public static void main(String[] args) {
	String s = "34567w";
	boolean isDigit = true;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i)>=0 && s.charAt(i)<=9) {
			isDigit = true;
		}else {
			isDigit = false;
			break;
		}
	}
	if (isDigit) {
		System.out.println("String contains only digits");
	} else {
		System.out.println("String does not contains only digits");
	}
}
}
