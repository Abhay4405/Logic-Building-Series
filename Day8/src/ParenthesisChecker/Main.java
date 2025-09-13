package ParenthesisChecker;

public class Main {
	public static void main(String[] args) {
		String s = "(1+2)=3)(";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (count < 0) {
				break;
			}
			if (s.charAt(i)=='(') {
				count ++;
			}
			if (s.charAt(i)==')') {
				count --;
			}
		}
		if (count == 0) {
			System.out.println("Perfect Parenthesis");
		}
		else {
			System.out.println("Imperfect Parenthesis");
		}
	}
}
