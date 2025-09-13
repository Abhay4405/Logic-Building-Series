package FindShortestDistanceToACharacter;

public class Main {
	public static void main(String[] args) {
		String s = "hello hello";
		char ch = 'l';
		int left = 1;
		int right = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				break;
			} else {
				left++;
			}
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ch) {
				break;
			} else {
				right++;
			}
		}
		if (left < right) {
			System.out.println("Shortest diatance to " + ch + " is " + left);
		} else {
			System.out.println("Shortest diatance to " + ch + " is " + right);
		}
	}
}
