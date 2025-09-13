package NoOfWordsStartingWithVowelsInSentance;

public class Main {
	public static void main(String[] args) {
		String s = "viva institute of technology";
		int count = 0;
		if (s.charAt(0) == 'a' || s.charAt(0) == 'A' || s.charAt(0) == 'e' || s.charAt(0) == 'E' || s.charAt(0) == 'i'
				|| s.charAt(0) == 'I' || s.charAt(0) == 'u' || s.charAt(0) == 'U' || s.charAt(0) == 'o'
				|| s.charAt(0) == 'O') {
			count++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				if (s.charAt(i + 1) == 'a' || s.charAt(i + 1) == 'A' || s.charAt(i + 1) == 'e' || s.charAt(i + 1) == 'E'
						|| s.charAt(i + 1) == 'i' || s.charAt(i + 1) == 'I' || s.charAt(i + 1) == 'u'
						|| s.charAt(i + 1) == 'U' || s.charAt(i + 1) == 'o' || s.charAt(i + 1) == 'O') {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
