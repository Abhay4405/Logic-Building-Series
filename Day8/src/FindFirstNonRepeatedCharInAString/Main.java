package FindFirstNonRepeatedCharInAString;

public class Main {
	public static void main(String[] args) {
		String s = "cccchj";
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(index) != s.charAt(i)) {
				System.out.println(s.charAt(i) + " is first non repeated character.");
				break;
			}
		}
	}
}
