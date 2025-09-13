package RemoveSpacesInString;

public class Main {
	public static void main(String[] args) {
		String s1 = "hello world I am Abhay";
		String s2 = "";
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
}
