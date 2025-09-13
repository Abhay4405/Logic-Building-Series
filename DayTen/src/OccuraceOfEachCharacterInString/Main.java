package OccuraceOfEachCharacterInString;

public class Main {
	public static void main(String[] args) {
		String s = "helhello";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			if (ch[i] == ' ') {
				continue;
			}
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = ' ';
					count++;
				}
			}
			System.out.println(ch[i] + " is repeated " + count + " times.");
		}
	}
}
