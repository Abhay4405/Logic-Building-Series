package CheckIfACharacterIsVowelOrConsonent;

public class Main {
	public static void main(String[] args) {
		char ch = 'J';
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'u' || ch == 'U') {
			System.out.println("Character is a Vowel");
		} else {
			System.out.println("Character is a Consonent");
		}
	}
}
