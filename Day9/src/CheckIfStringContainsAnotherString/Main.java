package CheckIfStringContainsAnotherString;

public class Main {
	public static void main(String[] args) {
		String s1 = "Abhay Dubey From Viva College";
		String s2 = "Sdac";
		int index2 = 0;
		boolean isFound = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(index2)) {
				index2++;
				if (index2 == s2.length()) {
					isFound = true;
					break;
				}
			} else {
				index2 = 0;
			}
		}
		if (isFound) {
			System.out.println("String Found");
		} else {
			System.out.println("Not Found");
		}
	}
}
