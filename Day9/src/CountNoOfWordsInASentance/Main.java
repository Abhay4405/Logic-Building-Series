package CountNoOfWordsInASentance;

public class Main {
	public static void main(String[] args) {
		String s = "hello world world";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("There are " + count + " words in the sentance.");
	}
}
