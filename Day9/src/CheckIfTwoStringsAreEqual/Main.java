package CheckIfTwoStringsAreEqual;

public class Main {
	public static void main(String[] args) {
		String s1 = "abhay";
		String s2 = "abhay";
		boolean isEqual = true;
		if (s1.length() != s2.length()) {
			isEqual = false;
		} else {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == s2.charAt(i)) {
					isEqual = true;
				} else {
					isEqual = false;
				}
			}
		}

		if (isEqual) {
			System.out.println("Two strings are equal");
		} else {
			System.out.println("Two strings are not equal");
		}
	}
}
