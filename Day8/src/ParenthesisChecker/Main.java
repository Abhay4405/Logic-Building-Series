package ParenthesisChecker;

public class Main {
public static void main(String[] args) {
	String s = "{{{}}}}";
	int leftBraces = 0;
	int RightBraces = 0;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) == '{') {
			leftBraces = leftBraces + 1;
		}
		else if(s.charAt(i) == '}') {
			RightBraces = RightBraces + 1;
		}
	}
	if (leftBraces == RightBraces) {
		System.out.println("Perfect Parenthesis");
	} else {
		System.out.println("Imperfect Parenthesis");
	}

}
}
