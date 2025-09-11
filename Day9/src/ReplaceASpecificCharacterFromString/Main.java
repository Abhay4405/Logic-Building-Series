package ReplaceASpecificCharacterFromString;

public class Main {
public static void main(String[] args) {
	String s = "ABHAY";
	char[] Array = s.toCharArray();
	char character = 'A';
	char replace = 'X';
	for (int i = 0; i < Array.length; i++) {
		if (Array[i] == character) {
			Array[i] = replace;
		}
		System.out.println(Array[i]);
	}
}
}
